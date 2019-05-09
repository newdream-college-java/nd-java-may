/*
输入四位数，求个位十位百位千位
*/
import java.util.Scanner;
public class B{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int a = input.nextInt(),b,c,d,e;
		//求个位
		b = a%10;
		//求十位
		c = a/10%10;
		//求百位
		d = a/100%10;
		//求千位
		e = a/1000;
		System.out.println("个位是"+b+"\n十位是"+c+"\n百位是"+d+"\n千位是"+e);
	}

}