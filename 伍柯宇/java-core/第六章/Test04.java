/*
1.4����� 10000-99999 ��������л�������˵�������磺12321 �ǻ���������λ��
��λ��ͬ��ʮλ��ǧλ��ͬ��12321 99999 99899
*/
public class Test04{
	public static void main(String[] args){
		for(int a=10000;a<=99999;a++){
			if(a%10==a/10000&&a/10%10==a/1000%10){
				System.out.println(a);
			}
		}
	}
}