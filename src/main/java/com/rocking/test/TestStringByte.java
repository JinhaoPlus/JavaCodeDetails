package com.rocking.test;

import java.io.UnsupportedEncodingException;

abstract class MainTestParent{
    public static void main(String[] args) {
        System.out.println("P");
    }
}

class MainTestChild extends MainTestParent{

    public static void main(String[] args) {
        System.out.println("C");
    }
}

public class TestStringByte {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String string = "CCC";
    //1.string 转 byte[]
        byte[] midbytes = string.getBytes("UTF8");
    //为UTF8编码
        String string2 = "中国";
        byte[] isoret = string2.getBytes("ISO-8859-1");
    //为ISO-8859-1编码
    //其中ISO-8859-1为单字节的编码
    // 2.byte[]转string
        byte[] bytes = {'a','b'};
        String isoString = new String(bytes, "ISO-8859-1");
        String srt2 = new String(midbytes, "UTF-8");

        MainTestChild.main(null);

    }
}
