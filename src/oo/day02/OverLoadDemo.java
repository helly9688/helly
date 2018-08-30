package oo.day02;

public class OverLoadDemo {
	public static void main(String[] args) {
		overload over = new overload();
		over.say();
		System.out.println();
		over.say(22);
		over.say("lonmglong");
		over.say(22, "longlobng");
		over.say("longlo", 22);
	}
}

class overload {
	void say() {
	}

	void say(int age) {
		System.out.println("我的年龄为：" + age);
	}

	void say(String name) {
		System.out.println("我的名字为" + name);
	}

	void say(String name, int age) {
	}

	void say(int age, String name) {
	}
	// int say() {};
	// void say(int year) {}

}
