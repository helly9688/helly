package day04;
import java.util.Scanner;
public class CommandBySwitch {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入功能：1.显示全部记录，2.查询登记记录，0.下次再来");
		int command = scan.nextInt();
		switch (command) {
		case 1:
			System.out.println("显示全部记录");
			break;
		case 2:
			System.out.println("查询所有记录");
			break;
		case 0:
			System.out.println("下次再来");
			break;
		default:
			System.out.println("输入错误");
			break;
		}
		
		
		
		
		/*
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入功能：1.显示全部记录，2.查询登记记录，0.下次再来吧");
		int command = scan.nextInt();
		switch (command) {
		case 1:
			System.out.println("显示全部记录");
			break;
		case 2:
			System.out.println("查询登记记录");
			break;
		case 0:
			System.out.println("下次再来吧");
			break;
		default:
			System.out.println("输入错误");
		}
		*/
	}
}
