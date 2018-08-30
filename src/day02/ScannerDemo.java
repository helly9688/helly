package day02;
import java.util.Scanner;
public class ScannerDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入年龄：");
		int age = scan.nextInt();
		System.out.println(age);
		System.out.println("请输入价格：");
		double price = scan.nextDouble();
		System.out.println(price);
	}
}
