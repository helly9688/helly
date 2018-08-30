package day03;
import java.util.Scanner;
public class LeapYear {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入一个年份：");
		int year = scan.nextInt();
		/*
	  boolean flag = year%4==0 && year%100!=0 || year %400==0;
		String str = flag ? year+"是闰年":year+"不是闰年";	
 		System.out.println(str);
		boolean flag = (year%4==0 && year%100!=0) || year%400==0 ;
		String str = flag ? year+"是闰年":year+"不是闰年";
		System.out.println(str);
		*/
		
		/*if((year%4==0 && year%100!=0) || year%400==0 ) {
			System.out.println(year+"是闰年！");
		}else {
			System.out.println(year+"是平年！");
		}
		*/
	}
}
