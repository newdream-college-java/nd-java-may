/*����һ������Ϊ��FlipFlop������ϷӦ�ó������� 1 ������ 100������ 3
�ı�����������ʡ�Flip�������� 5 �ı�����������ʡ�Flop������Ϊ 3 �ı���ҲΪ
5 �ı����������FlipFlop����������������ǰ����*/
public class Test02{
	public static void main(String[] args){
		for(int i=1;i<=100;i++){
			if(i%3==0&&i%5!=0){
				System.out.println("Flip");
			}else if(i%3!=0&&i%5==0){
				System.out.println("Flop");
			}else if(i%3==0&&i%5==0){
				System.out.println("FlipFlop");
			}else{
				System.out.println(i);
			}
		}
	}
}