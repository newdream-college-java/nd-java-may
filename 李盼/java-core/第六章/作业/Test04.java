/*
��� 10000-99999 ��������л�������˵�������磺12321 �ǻ���������λ��
��λ��ͬ��ʮλ��ǧλ��ͬ��12321 99999 99899
*/
public class Test04{
	public static void main(String[] args){
		for(int i = 10000;i<100000;i++){
			if(i%10==i/10000%10&&i/1000%10==i/10%10){
				System.out.println(i);
			}
		}
	}
}