import java.util.*;

public class Test05{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int[] arr=new int[10];
		double sum=0,ave=0;
		int a=0,b=0,c=0;
		System.out.println("������ʮ��ѧ���ĵ��Ƴɼ���");
		for(int i=0;i<arr.length;i++){
			System.out.print("�������"+(i+1)+"��ͬѧ�ĳɼ���");
			arr[i]=input.nextInt();
			sum=sum+arr[i];
			if(arr[i]<60){
				a++;
			}else if(arr[i]>=60&&arr[i]<80){
				b++;
			}else{
				c++;	
			}
		}
		System.out.println("60�����µ����У�"+a);
		System.out.println("60�ֵ�80�ֵ����У�"+b);
		System.out.println("80�����ϵ����У�"+c);
		int max=arr[0];
		for(int i=1;i<arr.length;i++){
			
			if(arr[i]>max){
				max=arr[i];
			}
		}
		System.out.println("���ֵΪ"+max);
		int mix=arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i]<mix){
				mix=arr[i];
			}
		}
		System.out.println("��СֵΪ"+mix);
		ave=sum/10.0;
		System.out.println("ƽ��ֵΪ��"+ave);
	}
}
