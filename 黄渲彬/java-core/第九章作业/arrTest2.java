package sc;
import java.util.Scanner;
public class arrTest2 {
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		double sum = 0; 
	double[] arr = new double[6];
	System.out.println("�������Ա���µ����Ѽ�¼");
		for(int a = 1;a<arr.length;a++)
			{		
				System.out.print("�������"+a+"�ʹ�����:");
				arr[a]=input.nextDouble();				
		}
		System.out.println("���                "+"���(Ԫ)");
		for (int i = 1; i < arr.length; i++) {
			System.out.println(i+"            "+arr[i]);
			sum +=arr[i];			
		}
		System.out.println("�ܽ��             "+sum);
	}
	
}
