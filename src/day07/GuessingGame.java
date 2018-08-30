package day07;

import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

import javax.print.attribute.standard.Chromaticity;

public class GuessingGame {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		char [] chs = generate();//获取随机字符数组
		System.out.println(chs);
		                                            //作弊
		    int count = 0;                                        //猜错的次数
		  while(true) {							//自造死循环
			  System.out.println("猜吧");
			  String str = scan.next().toUpperCase();
			  if(str.equals("EXIT")) {
				  System.out.println("下次再来吧");
				  break;
			  }
			  char[] input = str.toCharArray();
			  int[] result = check(chs, input);
			  if(result[0]==chs.length) {
				  int score = 100*chs.length-10*count;
				  System.out.println("恭喜你猜对了，你的分数为："+score);
				  break;
			  }else{
				  count++;
				  System.out.println("字符对个数为"+result[1]);
			  }

		  }
		                                            
		/*
		Scanner scan =new Scanner(System.in);
		char[] chs = generate();
		System.out.println(chs);
		int count= 0;
		while (true) {
			System.out.println("猜吧");
			String str = scan.next().toUpperCase();
			char[] input= str.toCharArray();
			int [] result = check(chs, input);
			if(result[0]==chs.length) {
				int score = 100*chs.length-10*count;
				System.out.println("恭喜你，答对了,你的分数为："+score);
				break;
			}else {
				count++;
				System.out.println("字符对个数为："+result[1]);
			}
		}
		*/
	}
	//生成随机字符数组
	public static char[] generate() {
		char[] chs = new char[5];
		char[] letters = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
				'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V',
				'W', 'X', 'Y', 'Z' };
		boolean[] flags = new boolean[letters.length];
		for (int i = 0; i < chs.length; i++) {
			int index;
			do {
				index = (int)(Math.random()*letters.length);
			} while (flags[index]==true);
			
			chs[i] = letters[index];
			flags[index] = true;
		}
		/*
		 * i=0 index=0 chs[0]='A' flags[0]=true
		 * i=1 index=25 chs[1]='Z' flags[25]=true
		 * i=2 index=0/25/3 chs[2]='C' flags[3]=true
		  */
		
		return chs;	
	}
	//对比：随机字符数组chs与用户输入的字符数组input
	
	
	public static int[] check(char[] chs,char[] input) {
		int[] result = new int[2];
		for (int i = 0; i < chs.length; i++) {
			for (int j = 0; j < input.length; j++) {
				if(chs[i]==input[j]) {
					result[1]++;
					if(i==j) {
						result[0]++;
					}
					break;	
				}				
			}			
		}
		return result;
	}
}
