package day05;

public class ForDemo {
	public static void main(String[] args) {
		for (int times=0;times<10;times++) {
			System.out.println("行动是进步的阶梯");			
		}
		for(int num=1;num<=9;num++) {
			System.out.println(num+"*9="+num*9);
		}
		int su=0;
		for(int a=0; a<=100;a++) {
			su = su +a;
		}
		System.out.println("su="+su);
		
		/*
		 *     su=0
		 * a=1 su=1
		 * a=2 su=1+2
		 * a=3 su=1+2+3
		 * a=4 su=1+2+3+4
		 * .......
		 * a=100 su=1+2+3+4+5+6+...+100
		 * a=101
		 */
		
		for (int i = 0; i < 10; i++) {
			System.out.println("i=" + i);
			if (i == 2) {
				break;
			}
		}
		
		for (int i = 0; i < 4; i++) {
			if (i == 2) {
				continue;
			}
			System.out.print("i=" + i +" ");
		}
		
		
		int sum = 0;
		for(int i = 1; i<=100;i++) {
			sum = sum + i;
		}
		System.out.println("sum="+sum);
		/*
		 *          		sum=0
		 *          i=1 sum=1
		 *          i=2 sum=1+2
		 *          i=3 sum=1+2+3
		 *         				 ...............
		 *          i=100 sum = 1+2+3+...+100
		 *          i=101 
		 */ 				
		for(int i=0,j=0,k=0;i<10&&j<4&&k<10;j+=2){
			System.out.println(i++);
			System.out.println(++k+i);
		}
	}
}
