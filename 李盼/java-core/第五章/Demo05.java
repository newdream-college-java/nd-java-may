/*
ѭ������10������ͳ��ż���ĸ�����
*/
import java.util.Scanner;
public class Demo05{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("������10������");
		int i=0,j=0;
		while(i<10){
			double m = input.nextDouble();
			if(m%2.0==0){
				j++;
			}
			i++;
		}
		System.out.println("ż���ĸ�����"+j+"��");
	}
}