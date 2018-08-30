package day04;

import java.util.Scanner;
//猜数字游戏
public class GuessingGame {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num =(int)(Math.random()*1000+1);
		System.out.println(num);
		int guess;
		do {
			System.out.println("开始猜吧");
			guess = scan.nextInt();
			if(guess == 0) {
				break;
			}
		
			if(guess>num) {
				System.out.println("猜大了");
			}else if(guess<num) {
				System.out.println("猜小了");
			}
		}while(guess != num);
		if(guess == num) {
		System.out.println("猜对了");
		}else {
			System.out.println("下次再来");
		}
		
		
		
		
		
		
		
		
		/*
		int num =(int)(Math.random()*1000+1);
		System.out.println(num);
		int guess= scan.nextInt();
		while(guess!=num) {
			if(guess == 0) {
				break;
			}
			if(guess>num) {
				System.out.println("猜大了");
			}else {
				System.out.println("猜小了");
			}
			guess= scan.nextInt();
		}
		if(guess == num) {
			System.out.println("猜对了");
		}else {
			System.out.println("下次再来");
		}
		*/
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		/*
		Scanner scan = new Scanner(System.in);
		int num = (int)(Math.random()*1000+1);
		System.out.println(num);
		int guess;
		do {	
			System.out.println("猜吧！");
			guess = scan.nextInt();
			if(guess==0) {
				break;
			}
			if(guess>num) {
				System.out.println("猜大了！");
			}else if(guess < num) {
				System.out.println("猜小了！");
			}	
		}while(guess!=num);
		if(guess == num) {
			System.out.println("猜对了");
		}else {
			System.out.println("下次再来");
		}
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		do {
			System.out.println("猜吧！");
			 guess = scan.nextInt();
			 
				if(guess==0) {
					break;
				}
				if (guess > num) {
					System.out.println("猜大了，请你继续猜吧！");
				} else if(guess<num) {
					System.out.println("猜小了，请你继续猜吧！");
				}
			//	guess = scan.nextInt();	
		}while(guess != num);
		if(guess==num) {
			System.out.println("恭喜你猜对了！");
		}else {
			System.out.println("下次再来！");
		}
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		System.out.println("猜吧！");
		int guess = scan.nextInt();
		while (guess != num) {
			if(guess==0) {
				break;
			}

			if (guess > num) {
				System.out.println("猜大了，请你继续猜吧！");
			} else {
				System.out.println("猜小了，请你继续猜吧！");
			}

			guess = scan.nextInt();
		}
		if(guess==num) {
			System.out.println("恭喜你猜对了！");
		}else {
			System.out.println("下次再来！");
		}
		*/
	}
}
