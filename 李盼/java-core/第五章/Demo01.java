/*
2012������ѧԱ25���ˣ�ÿ������25%�����ʰ��������ٶȣ�
����һ����ѵ�������ﵽ100���ˣ�
*/
public class Demo01{
	public static void main(String[] args){
		double i=250000;
		int j=2012;
		while(i<=100*10000){
			i = i*1.25;
			j++;
		}
		System.out.println("��"+j+"�������ﵽ100����");
	}
}