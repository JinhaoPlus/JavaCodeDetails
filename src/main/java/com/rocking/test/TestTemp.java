package com.rocking.test;

import java.io.IOException;
import java.net.URLEncoder;

public class TestTemp {
    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new FileReader("/Users/jinhaoplus/Desktop/TMPw.csv"));
//        BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/jinhaoplus/Desktop/cccc.csv"));
//        String line = "";
//        while ((line = reader.readLine()) != null) {
//            line = "\"\"," + line + "\n";
//            writer.write(line);
//        }
//        writer.flush();
//        writer.close();
//        reader.close();
        System.out.println(URLEncoder.encode("中国"));
        System.out.println(URLEncoder.encode("中国", "utf-8"));
        System.out.println(URLEncoder.encode("中国", "gbk"));

    }
}
