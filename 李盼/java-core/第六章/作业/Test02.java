/*
 ����һ������Ϊ��FlipFlop������ϷӦ�ó������� 1 ������ 100������ 3
�ı�����������ʡ�Flip�������� 5 �ı�����������ʡ�Flop������Ϊ 3 �ı���ҲΪ
5 �ı����������FlipFlop����������������ǰ���֡�
*/
public class Test02{
	public static void main(String[] args){
		String a;
		for(int i = 1;i<101;i++){
			if(i%3==0){
				if(i%5==0){
					a = "FilpFlop";
					System.out.println(a);              //�ܱ�5���ұ�3����
				}
				else{
					a = "Filp";
					System.out.println(a);              //ֻ�ܱ�3����
				}
			}
			else if(i%5==0){                                                          //ֻ�ܱ�5����
				a = "Flop";
				System.out.println(a);
			}
			if(i%3!=0&&i%5!=0){                                               //���ܱ�3���ܱ�5����
				System.out.println(i);
			}
		}
	}
}