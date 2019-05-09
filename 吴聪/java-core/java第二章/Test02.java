/*
输入一个正方形的边长，求其周长和面积
*/
import java.util.Scanner;
//import java.util.Scanner;
public class C{
	public static void main (String [] args){
		Scanner in = new Scanner(System.in);
		System.out.print("输入正方形的边长：");
		double a = in.nextDouble();
	//	System.out.println("输入正方形的边长：");
	//	double a = in.nextDouble;
		double z=4*a;
		double s=a*a;
	//	System.out.println(z);
	//	System.out.println(s);
		System.out.println("边长\t周长\t面积\n"+a+"\t"+z+"\t"+s);
	//	System.out.println(a+"\t"+b+"\t"+z+"\t"+s);
	}
}