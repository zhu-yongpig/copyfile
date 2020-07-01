package com.java.test;

import java.io.*;
import java.util.Scanner;

/**
 * description: 文件拷贝（速度快）
 * author: 朱勇
 * time: 2020/7/1 8:47
 */
public class charge {
    public static void main(String[] args) throws IOException {
        System.out.println("请输入需要拷贝的文件路径：");
        Scanner in=new Scanner(System.in);
        String str1=in.nextLine();
        System.out.println("请输入目标路径：");
        String str2=in.nextLine();
        long starttime=System.currentTimeMillis();
        BufferedInputStream bi=new BufferedInputStream(new FileInputStream(str1));
        BufferedOutputStream bo=new BufferedOutputStream(new FileOutputStream(str2));
        byte[] car=new byte[1024];
        int data;
        for(;(data=bi.read(car))!=-1;){
           bo.write(car,0,data);
        }
        bi.close();
        bo.close();
        long endtime=System.currentTimeMillis();
        System.out.println("共消耗"+(endtime-starttime)+"ms");
    }
}
