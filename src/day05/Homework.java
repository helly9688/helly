package day05;

import java.util.Scanner;

import day04.Scorelevel;

//作业讲解
public class Homework {
	public static void main(String[] args) {
		// 1.计算器
		Scanner scan = new Scanner(System.in);
		int score = 0;
		
		for (int i = 1; i <= 10; i++) {
			int a = (int) (Math.random() * 100);
			int b = (int) (Math.random() * 100);
			int result = a + b;
			System.out.println("(" + i + ")" + a + "+" + b + "=?");
			System.out.println("算吧");
			int answer = scan.nextInt();
			if (answer == -1) {
				System.out.println("下次再来");
				break;
			}
			if (answer == result) {
				score += 10;
				System.out.println("答对了");
			} else {
				System.out.println("答错了");
			}
			if (i==10) {
				System.out.println("score=" + score);

			}

		}

	}
}
