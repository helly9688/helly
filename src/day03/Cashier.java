package day03;
import java.util.Scanner;
public class Cashier {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*System.out.println("请输入一个整数：");
		int num1 = scan.nextInt();
		if(num1%2==0) {
			System.out.println("该数是偶数");
		}else {
			System.out.println("该数不是偶数");
		}
	*/
		//编写一个收银柜台收款程序。根据商品单价、
		//购买数量以及收款金额计算并输出应收金额和找零，

		System.out.println("请输入单价：");
		double price = scan.nextDouble();
		System.out.println("请输入数量：");
		int number = scan.nextInt();
		System.out.println("请输入金额：");
		double money = scan.nextDouble();
		double total = price*number;
		if(total>=500) {
			total*=0.8;
		}
		if(money>=total) {
				double change = money-total;	
				System.out.println("应收金额为："+total+"；"+"找零："+change);
		}else {
			System.out.println("输入金额错误错误！");
		}
		
	}
}
