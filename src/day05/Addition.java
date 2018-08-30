package day05;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		// 练习随机加法运算器
		Scanner scan = new Scanner(System.in);
		int score = 0;
		int i;
		for (i = 1; i <= 10; i++) {
			int a = (int) (Math.random() * 100);
			int b = (int) (Math.random() * 100);
			int result = a + b;
			System.out.println("开始计算吧");
			System.out.println("(" + i + ")" + a + "+" + b + "=?");
			int answer = scan.nextInt();

			if (answer == -1) {
				break;
			}
			if (answer == result) {
				score += 10;
				System.out.println("计算正确");
			} else {
				System.out.println("计算错误");
			}
		}
		if (i == 10) {
			System.out.println("score=" + score);
		} else {
			System.out.println("下次再玩");
		}

		/*
		 * Scanner scan = new Scanner(System.in); int score = 0; int i; for( i =
		 * 1;i<=10;i++) { int a = (int)(Math.random()*100); int b =
		 * (int)(Math.random()*100); int result = a+b;
		 * System.out.println("("+i+")"+a+"+"+b+"=?"); System.out.println("算吧"); int
		 * answer = scan.nextInt();
		 * 
		 * if(answer==-1) { break; } if(answer==result) { score +=10;
		 * System.out.println("答对了"); }else { System.out.println("答错了"); } }if(i==10) {
		 * System.out.println("总得分"+score); }else { System.out.println("下次再来吧"); }
		 * 
		 */
	}

}
