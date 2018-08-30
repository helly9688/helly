package day04;

import java.util.Scanner;

public class Homework {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入三个数");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		if(a>b) {
			int t = a;
			a = b;
			b = t;		
		}
		if(a>c) {
			int t = a;
			a = c;
			c = t;
			
		}
		if(b>c) {
			int t = b;
			b = c;
			c = t;
		}
		System.out.println("a="+a+",b="+b+",c="+c);
	}
}
