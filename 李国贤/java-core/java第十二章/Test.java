import java.util.Scanner;


public class Test {//第五题
	public static void main(String[] args) {
		Triangle d3=new Triangle();
		d3.stsu(5,'*');
		
		
		
		
		
		
		
		
		Scanner input=new Scanner(System.in);//第一题
		CustomerBiz d1= new CustomerBiz();
		d1.stus();
		
		
		Person d2=new Person();//第二题
		System.out.println("请输入姓名，性别，年龄");
		String name=input.next();
		String sex=input.next();
		int age=input.nextInt();
		d2.infor(name, sex, age);
	}
}
