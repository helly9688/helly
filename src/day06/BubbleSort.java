package day06;

public class BubbleSort { 
	public static void main(String[] args) {
		int[] a = new int[10];
		for (int i = 0; i < a.length; i++) {
			a[i] = (int)(Math.random()*100);
			System.out.print(a[i]+"\t");
		}
		System.out.println();
		//排序
		//轮
		for (int i = 0; i < a.length-1; i++) {
			for (int j = 0; j < a.length-1-i; j++) {
				if (a[j]>a[j+1]) {
					int t = a[j];
					a[j]=a[j+1];
					a[j+1]=t;
					
				}
			}
			
		}
		System.out.println("排序后：");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+"\t");
		}	
		/*
		int[] a = new int[10];
		for(int i=0;i<a.length;i++) {
			a[i]=(int)(Math.random()*100);
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+"\t");
		}
		System.out.println();
		//排序
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
				int t =a[j];
				a[j]=a[j+1];
				a[j+1]=t;
				}
			}		
		}
		System.out.println("排序后");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+"\t");
		}
		*/
	}
}
