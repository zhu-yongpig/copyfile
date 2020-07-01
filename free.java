package com.java.test;

import java.io.*;
import java.util.Scanner;

/**
 * description: 文件拷贝（速度较慢）
 * author: 朱勇
 * time: 2020/6/30 22:48
 */
public class free {
    public static void main(String[] args) throws IOException {
       Scanner in = new Scanner(System.in);
       System.out.println("please enter input path:");
       String s1=in.nextLine();
       System.out.println("please enter output path:");
       String s2=in.nextLine();
        long starttime=System.currentTimeMillis();
       FileInputStream fin=new FileInputStream(s1);
       FileOutputStream fou=new FileOutputStream(s2);
       int data;
       for(;(data=fin.read())!=-1;){
           fou.write(data);
       }
       fin.close();
       fou.close();
       long endtime=System.currentTimeMillis();
       System.out.println("完成拷贝共消耗"+(endtime-starttime)+"ms");

    }

}
