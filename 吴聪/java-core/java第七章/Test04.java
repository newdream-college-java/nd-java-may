/*
�û��������޴��������֣���ͳ���û�����������������ĸ����������ĸ�����0�ĸ�����ֱ���û�����999�ͽ��������ͳ�ƽ��
*/
import java.util.Scanner;
public class Test04{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int zs=0,fs=0,l=0;
		System.out.print("������һ������");
		int num = in.nextInt();
		for(int i=1;num!=999;i++){
			if(num>0){
				zs++;
			}else if(num<0){
				fs++;
			}else{
				l++;
			}
			System.out.print("��������һ������");
			num = in.nextInt();
		}
		System.out.print("����"+(zs+1)+"��������"+fs+"������"+l+"��");
	}
}