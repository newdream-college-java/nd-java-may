/*
����һ������n,ͳ��1��n���ж��ٸ�������ż��
*/
import java.util.Scanner;
public class To6{
	public static void  main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("������һ������:");
		int n=input.nextInt();
		int sum1=0,sum2=0;
		for(int i=1;i<=n;i++){
			if(i%2==0){
				sum1++;
			}else{
				sum2++;
			}
		System.out.println("����:"+sum2+"��,ż��:"+sum1+"��");
		}
	}
}