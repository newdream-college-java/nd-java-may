/*
�û��������޴ε��������֣���ͳ���û�����������������ĸ����������ĸ�����0�ĸ�����ֱ���û�����999�ͽ��������ͳ�ƽ��
*/
import java.util.Scanner;
public class To4{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int sum1=0,sum2=0,sum3=0;
		for(int i=1;;i++){
			System.out.println("������һ������:");
			int a=input.nextInt();
			if(a==999){
				break;
			}
			else if(a>0){
				sum1++;
			}else if(a==0){
				sum2++;
			}else{
				sum3++;
			}
		
		}
				System.out.println("�����ĸ���Ϊ:"+sum1+"\t�����ĸ���Ϊ:"+sum3+"\t0�ĸ���Ϊ:"+sum2);





}
}