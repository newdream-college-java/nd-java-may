import java.util.Scanner;

public class Test02{
	public static void main(String[] args){
	double length,area,perimeter;
	System.out.println("������߳�");
	Scanner input=new Scanner(System.in);
	length=input.nextDouble();
	area=length*length;
	perimeter=length*4;
	System.out.println("�˳����εĳ�Ϊ"+length+","+"����ǣ�"+area+","+"�ܳ��ǣ�"+ perimeter); 
	}
}