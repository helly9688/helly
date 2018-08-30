package oo.day04;
import javax.net.ssl.ExtendedSSLSession;
public class Text {
	public static void main(String[] args) {
		Student stus = new Student("zs", 12, "add", 12);
		stus.sayHi();
		Teacher teacher  = new Teacher("boa",122, "address",10000);
		teacher.sayHi();
		Doctor doctor = new Doctor("a",12, "a", "shabi");
		doctor.sayHi();
		
		Person[] ps = new Person[5];
		ps[0]  = new Student("aaa",22, "lj", 01);
		ps[1]  = new Student("32q",22, "lj", 01);
		ps[2]  = new Doctor("aaa",22, "lj", "sfd");
		ps[3]  = new Doctor("aaa",22, "lj", "fsfs");
		ps[4]  = new Teacher("aaa",22, "lj", 01);
		for (int i = 0; i < ps.length; i++) {
			ps[i].sayHi();
		}
	}
}
class Person{//超类
	String name;
	int age;
	String address;
	Person(String name,int age,String address){
		this.name  = name;
		this.age = age;
		this.address = address;	
	}
	void sayHi() {
		System.out.println("大家好，我叫"+name+",今年"+age+"了，来自"+address);
	}
}
class Student extends Person{
	int stuId;
	Student(String name,int age,String address,int stuId){
		super(name, age, address);
		this.stuId = stuId;
	}
	void sayHi() {
		System.out.println("大家好，我叫"+name+",今年"+age+"了，来自"+address+"学号为"+stuId);
	}
}
/**创建Teacher类，继承Person类，包括:
  2.1)成员变量:salary
  2.2)构造方法:Teacher(4个参数){}*/
class Teacher extends Person{
	double salary;
	Teacher(String name,int age,String address,double salary){
		super(name, age, address);
		this.salary = salary;
	}
	void sayHi() {
		System.out.println("大家好，我叫"+name+",今年"+age+"了，来自"+address+"工资为"+salary);
	}
}
/**创建Doctor类，继承Person类，包括:
  2.1)成员变量:level
  2.2)构造方法:Doctor(4个参数){}     */
class Doctor extends Person{
	String level;
	Doctor(String name,int age, String address,String level){
		super(name, age, address);
		this.level = level;
	}
}














