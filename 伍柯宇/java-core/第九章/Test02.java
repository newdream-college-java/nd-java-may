import java.util.*;

public class Test02{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		double[] arr=new double[5] ;
		double sum=0;
		for(int i=0;i<arr.length;i++){
			System.out.print("�������"+(i+1)+"�ʽ�");
			arr[i]=input.nextDouble();
			sum=sum+arr[i];
		}
		System.out.println("���\t���(Ԫ)");
		for(int i=0;i<arr.length;i++){
			System.out.println((i+1)+"\t"+arr[i]);
		}
		System.out.println("�ܽ��"+sum);
	}
}