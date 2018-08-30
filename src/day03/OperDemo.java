package day03;

import java.awt.TexturePaint;

//运算符的演示
public class OperDemo {
	public static void main(String[] args) {
		/*
		int a = 5;
		a += 10;
		System.out.println(a);//15
		a *=3;
		System.out.println(a);//45
		a -=4;
		System.out.println(a);//41
		
		int age =37;
		System.out.println(age);
		System.out.println("今年我"+age+"岁了！");
		
		int b = 10,c = 6;
		int max = b>c?b:c;
		System.out.println(max);//10
		*/
		int a = 5;
		a += 10;
		System.out.println(a);
		a *=3;
		System.out.println(a);
		a -=4;
		System.out.println(a);
		
		int age = 37;
		System.out.println(age);
		System.out.println("今年我"+age+"岁了");
		
		System.out.println(10+20+"");
		System.out.println(10+20+""+10+20);
		System.out.println(""+10+20);
		
		int b = 10,c = 6;
		int max = a>b?a:b;
		System.out.print(max);
		/*
		int a = 5,b = 10, c = 5;
		System.out.println(a<b && b<c);
		System.out.println(a<=b && b>c);
		System.out.println(a<=b && b!=c);
		System.out.println(a>b && b<c);
		
		System.out.println(a<b || b<c);
		System.out.println(a==b || b>=c);
		System.out.println(a<=b || b>c);
		System.out.println(a>b || b<c);
		
		System.out.println(!(a<b));
		System.out.println(a<b);
		
		boolean a1 = a<b || b>=4;
		System.out.println(a1);
		System.out.println(c);
		*/
		/*
		System.out.println(5%3+" , "+9%3+" , "+3%9);//2,0,3
		int a = 5;
		a++;
		System.out.println(a);//6
		int b = 5;
		++b;
		System.out.println(b);//6
		int c = 5;
		int d = c++;
		System.out.println(c);//6
		System.out.println(d);//5
		int e = 5;
		int f = ++e;
		System.out.println(e);//6
		System.out.println(f);//6
		int g,h;
		g = 5;
		h = 5;
		System.out.println(g--);//5
		System.out.println(g);//4
		System.out.println(--h);//4
		System.out.println(h);//4
		*/
	}
}
