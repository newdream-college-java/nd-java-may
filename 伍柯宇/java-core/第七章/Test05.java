/*
����һ���������1+1/2+1/3+1/4+......+1/n������������������
*/
import java.util.Scanner;
public class Test05{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("������һ��������");
		int n = input.nextInt();
		double sum = 0;
		if(n>0){
			for(int i = 1;i<=n;i++){
				sum = sum+1.0/i;
			}
			System.out.print(sum);
		}
		else{
			System.out.print("�������");
		}
	}
}