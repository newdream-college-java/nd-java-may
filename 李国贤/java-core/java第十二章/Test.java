import java.util.Scanner;


public class Test {//������
	public static void main(String[] args) {
		Triangle d3=new Triangle();
		d3.stsu(5,'*');
		
		
		
		
		
		
		
		
		Scanner input=new Scanner(System.in);//��һ��
		CustomerBiz d1= new CustomerBiz();
		d1.stus();
		
		
		Person d2=new Person();//�ڶ���
		System.out.println("�������������Ա�����");
		String name=input.next();
		String sex=input.next();
		int age=input.nextInt();
		d2.infor(name, sex, age);
	}
}
