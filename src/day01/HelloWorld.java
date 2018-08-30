package day01;//声明包day01

import java.util.Scanner;

public class HelloWorld {// 声明类HeolloWorld
	// 主方法，为程序的入口
	// 程序的执行从main开始，main结束则程序结束
	public static void main(String[] args) {
		// 输出HelloWorld
		/*
		 * 1)严格区分大小写 2)所有符号必须是英文模式的 
		 * 3)每句话必须以分号结尾 4)println():输出并换行 print():输出不换行
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入一个数：");
		int a = scan.nextInt();
		System.out.println("HelloWorld");

	}

}
