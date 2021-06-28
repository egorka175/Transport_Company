package com.tms.TZ.Metods;

import java.util.Scanner;

public class WriteAPI {
    public static String writerStr(){
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        return str;
    }
    public static int writerInt(){
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        return num;
    }
    public  static void writerMessage(String message){
        System.out.println(message);
    }
}
