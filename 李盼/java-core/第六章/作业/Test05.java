/*
�� 100-999 ֮���ˮ�ɻ����������磺ˮ�ɻ��� 153=1*1*1+5*5*5+3*3*3��
*/
public class Test05{
	public static void main(String[] args){
		for(int i = 100;i<1000;i++){
			int a = i%10;                                //���λ
			int b = i/10%10;                          //��ʮλ
			int c = i/100%10;                        //���λ
			if(i==a*a*a+b*b*b+c*c*c){
				System.out.println(i);
			}
		}
	}
}