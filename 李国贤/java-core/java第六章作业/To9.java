/*
�̳��Թ˿͵������ν��е���,����������εĹ˿ͱ���
*/
import java.util.Scanner;
public class To9{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int a=0,b=0;
		double m,n;
		for(int i=1;i<=10;i++){
			System.out.println("�������"+i+"Ϊ�˿͵�����:");
			int age=input.nextInt();
			if(age>30){
				b++;
			}else{
				a++;
			}
		}	
		m=b/10.0*100;
		n=a/10.0*100;
		System.out.println("30�����ϵı�����"+m+"%");
		System.out.println("30�����µı�����"+n+"%");
	}
}