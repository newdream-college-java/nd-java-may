/*
���ʵ��һ���򵥵�������ԵĲ�ȭ��Ϸ�����
*/

import java.util.*;
public class Test09{
	public static void main(String[] args){
		Scanner input =new Scanner(System.in);
		Random rd = new Random();
		int ren ;//�˳���ȭ
		int renCount=0;//��Ӯ�Ĵ���
		int com ; //���Գ���ȭ
		int comCount=0;//����Ӯ�Ĵ���
		int i = 1;
		while(i<=5){
			com =rd.nextInt(3)+1;//1~3
			System.out.println("���ȭ:(1-ʯͷ��2-������3-��)");
			ren = input.nextInt();

			//3.�ж���Ӯ
			if(ren==com){
				System.out.println("��"+i+"�֣�ƽ��");
			}else if((ren-com==1)||(ren-com==-2)){
				System.out.println("��"+i+"�֣�����Ӯ");
				comCount++;
			}else{
				System.out.println("��"+i+"�֣���Ӯ��");
				renCount++;
			}
			//4.�Ƿ���ֹ����
			if(comCount==3||renCount==3){
				//��ֹ��������ֹѭ�� break��
				break;
			}

			i++;
		}
		//������Ӯ
		if(renCount>comCount){
			System.out.println("��Ӯ��");
		}else if(renCount<comCount){
			System.out.println("����Ӯ��");
		}else{	
			System.out.println("ƽ�֣���");
		}
		
	}
}