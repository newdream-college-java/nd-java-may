/*
1.5���� 100-999 ֮���ˮ�ɻ����������磺ˮ�ɻ��� 153=1*1*1+5*5*5+3*3*3��
*/
public class Test05{
	public static void main(String[] args){
		for(int i=100;i<+999;i++){
			if(i==(i%10)*(i%10)*(i%10)+(i/10%10)*(i/10%10)*(i/10%10)+(i/100)*			(i/100)*(i/100)){
				System.out.println(i);
			}
		}
	}
}