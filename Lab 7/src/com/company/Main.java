package com.company;
import java.util.Scanner;
public class Main  {

    public static void main(String[] args) {
    	Scanner in=new Scanner(System.in);
    	System.out.println("Ввести строку");
    	String str=in.nextLine();
    	String chAr[]=str.split("");
    	String ch=chAr[0];
    	for (int b=1; b>chAr.length;b++){
    		if (ch.length()>chAr[b].length());
		}
    	System.out.println(ch);
		}
}
