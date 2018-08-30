package day06;
import java.util.Arrays;
public class MaxOfArrary {

	public static void main(String[] args) {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*100);
			System.out.print(arr[i]+"\t");
		}
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(max<arr[i]) {
				max=arr[i];				
			}			
		}
		System.out.println();
		System.out.println(max);
		Arrays.sort(arr);
		for (int i = arr.length-1; i >= 0; i--) {
			System.out.print(arr[i]+"\t");
		}
		
		int[] a = new int[arr.length+1];
		System.arraycopy(arr, 0, a, 0, 10);
		a[a.length-1] = max;
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+"\t");
		}
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		int[] a=new int[] {20,30,40,5,070,6,0};
		int[] a1= new int[12];	
		System.arraycopy(a, 1, a1, 0, 6);
		for (int i = 0; i < a1.length; i++) {
			System.out.println(a1[i]);
		}
		
		int[] a=new int[] {20,30,40,5,897,6,10};
		//int a1[] =Arrays.copyOf(a,6);
		Arrays.sort(a);
		for (int i =a.length-1; i >=0; i--) {
			System.out.print(a[i]+"\t");
		}
		*/
		/*
		int a[] = new int[10];
		for (int i = 0; i < a.length; i++) {
			a[i] = (int)(Math.random()*100);
			System.out.println(a[i]);
		}
		int max = a[0];
		for(int i =1; i < a.length; i++) {
			if(max<a[i]) {
				max = a[i];
			}			
		}
		System.out.println("max="+max);
		
		
		a = Arrays.copyOf(a, a.length+1);
		a[a.length-1] = max;
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		
		
		a = Arrays.copyOf(a, a.length+1);
		a[a.length-1]=max;
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		*/
	}
}
