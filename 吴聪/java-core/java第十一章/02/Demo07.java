package day2;
import java.util.Scanner;
public class Demo07 {
	String name;
	int member;
	int Class;
	String sex;
	int age;
	String address;
	public void sayHello(){
		Scanner in = new Scanner(System.in);
		System.out.print("请输入学生姓名：");
		name=in.next();
		System.out.print("请输入学生学号：");
		member=in.nextInt();
		System.out.print("请输入学生班级：");
		Class=in.nextInt();
		System.out.print("请输入学生性别：");
		sex=in.next();
		System.out.print("请输入学生年龄：");
		age=in.nextInt();
		System.out.print("请输入学生家庭地址：");
		address=in.next();
	}
}
