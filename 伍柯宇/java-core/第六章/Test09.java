/*
2.1���̳��Թ˿͵������ν��е���,����������εĹ˿ͱ���
*/
import java.util.Scanner;
public class Test09{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int p=1,num=0;
		for(;p<=10;p++){
			System.out.print("�������"+p+"λ�˿͵����䣺");
			int i=input.nextInt();
			if(i<=30){
				continue;
			}
			num++;
		}
		System.out.println("30�����µı����ǣ�"+((num*1.0)/10.0)*100+"%");
		System.out.println("30�����ϵı����ǣ�"+((10-num)*1.0/10.0)*100+"%");
	}
}
