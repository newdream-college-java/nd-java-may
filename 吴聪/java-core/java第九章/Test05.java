/*
����10��ѧ���ĵ��Ƴɼ�����ɼ���60������~60~80��80�����ϵ�ѧ�����ж��ٸ� ����߷� ��ͷֺ�ƽ����
*/
import java.util.Scanner;
public class Test05{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int[] score=new int[10];
		int a=0,b=0,c=0;//ͳ�Ʒ����ı���
		for(int i=0;i<10;i++){
			System.out.print("�������"+(i+1)+"���˵ĳɼ���");
			score[i]=in.nextInt();
			if(score[i]>=80){
				a++;
			}else if(score[i]>=60&&score[i]<80){
				b++;
			}else{
				c++;
			}	
		}
		System.out.println("80������ѧ������:"+a);
		System.out.println("60�ֵ�80��ѧ������:"+b);
		System.out.println("60������ѧ������:"+c);
		int min = score[0];int max = score[0];
		for(int i=1;i<score.length;i++){
			if(score[i]<min){
				min = score[i];
			}
		}
		System.out.println("��ͷ֣�"+min);
		for(int i=1;i<score.length;i++){
			if(score[i]>max){
				max = score[i];
			}
		}
		System.out.println("��߷֣�"+max);
		double sum=0;
		for(int i=0;i<score.length;i++){
			sum+=score[i];
		}
		System.out.print("ƽ���֣�"+(sum/10.0));
	}
}