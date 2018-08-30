package day05;
public class MaxOfArray {
	public static void main(String[] args) {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100);
			System.out.println(arr[i] + "\t");

		}
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];

			}
		}

		System.out.println("max=" + max);

		/*
		 * int arr[] = new int[10]; for(int i=0;i<arr.length;i++) { arr[i]=
		 * (int)(Math.random()*100); System.out.println(arr[i]); } int max = arr[0];
		 * for( int i=0;i<arr.length;i++) { if(arr[i]>max) { max = arr[i]; } }
		 * System.out.println("最大值为："+max);
		 */
		/*
		 * int arr1[] = new int[10]; for(int i=arr1.length-1;i>=0;i--) { arr1[i]=
		 * (int)(Math.random()*100); System.out.println(arr1[i]); }
		 */
		/*
		 * int[] arr = new int[10]; for(int i=0;i<=arr.length-1;i++) { arr[i]=
		 * (int)(Math.random()*100); System.out.println(arr[i]); }
		 */
	}
}
