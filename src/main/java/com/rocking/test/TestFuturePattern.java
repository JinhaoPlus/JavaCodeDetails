package com.rocking.test;

interface Data {
    String get();
}

class RealData implements Data {
    private String content;

    public RealData(String content) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    @Override
    public String get() {
        return content;
    }
}

class FutureData implements Data {
    private RealData realData;

    public boolean ready = false;

    public synchronized void set(RealData data) {
        if (ready) {
            return;
        }
        this.realData = data;
        ready = true;
        notifyAll();
    }

    @Override
    public synchronized String get() {
        if (!ready) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return realData.get();
    }
}

class TaskRunner {
    public Data request(String content) {
        FutureData futureData = new FutureData();

        new Thread(new Runnable() {
            @Override
            public void run() {
                RealData realData = new RealData(content);
                futureData.set(realData);
            }
        }).start();

        return futureData;
    }
}

public class TestFuturePattern {
    public static void main(String[] args) {
        TaskRunner runner = new TaskRunner();
        Data data = runner.request("CCC");
        System.out.println(data.get());
    }
}
