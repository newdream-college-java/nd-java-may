/*
�̳��Թ˿͵������ν��е���,����������εĹ˿ͱ���
*/
import java.util.Scanner;
public class Test09{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int b=0,c=0,a;
		for(int i=1;i<=10;i++){
			System.out.print("�������"+i+"���˿����䣺");
			a = in.nextInt();
			if(a>=30){
				b++;
			}else{
				c++;
			}	
		}
		System.out.println("30�����Ϲ˿ͱ���ռ"+b+"0%");
		System.out.println("30�����¹˿ͱ���ռ"+c+"0%");
	}
}