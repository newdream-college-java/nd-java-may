import java.util.Scanner;

public class Test02{
	public static void main(String[] args){
	double length,area,perimeter;
	System.out.println("请输入边长");
	Scanner input=new Scanner(System.in);
	length=input.nextDouble();
	area=length*length;
	perimeter=length*4;
	System.out.println("此长方形的长为"+length+","+"面积是："+area+","+"周长是："+ perimeter); 
	}
}