import java.util.Scanner;
public class Test02{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("�������Ա���µ����Ѽ�¼");
		double[] arr =new double[5];
		double sum=0;
		for(int i=0;i<5;i++){
			System.out.print("�������"+(i+1)+"�ʹ����");
			arr[i]=in.nextDouble();
			sum+=arr[i];
		}
		System.out.println("���\t���(Ԫ)");
		System.out.println("1\t"+arr[0]);
		System.out.println("2\t"+arr[1]);
		System.out.println("3\t"+arr[2]);
		System.out.println("4\t"+arr[3]);
		System.out.println("5\t"+arr[4]);
		System.out.print("�ܽ��\t"+sum);
	}
}