package oo.day03;
public class RefArraryDemo {
	public static void main(String[] args) {
		Student[] stus = new Student[3];
		stus[0] = new Student("zhangsan", 25, "LF");
		stus[1] = new Student("ls", 25, "LF");
		stus[2] = new Student("ww", 25, "LF");
		System.out.println(stus[1].age);
		stus[0].sayHi();
		
		Student[] ss = new Student[] {
				new Student("zhangsan", 25, "LF"),
				new Student("lisi", 25, "LF"),
				new Student("ww", 25, "LF")
		};
		
		int[][] arr = new int[3][];
		arr[0] = new int[2];
		arr[1] = new int[3];
		arr[2] = new int[2];
		arr[1][2] = 100;
		
		int count = 0;
		int[][] a = new  int[3][4];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = 100;
				count++;
				System.out.println(a[i][j]);
				
			}
			System.out.println("输出了"+count+"次");
		}
		System.out.println("输出了"+count+"次");
		 
	}
}
