import java.util.*;
public class Student01 {
	public void calcScore(){
		int sum=0;
		double ave=0;
		for(int i=0;i<10;i++){
			System.out.print("�������"+(i+1)+"��ͬѧ�ĳɼ���");
			Scanner input=new Scanner(System.in);
			int score=input.nextInt();
			sum+=score;
		}
		System.out.println("�ܷ�Ϊ��"+sum);
		System.out.println("ƽ����Ϊ��"+sum/10.0);
	}
	
	public int getMax(){
		int []arr = new int [10];
		Scanner input=new Scanner(System.in);
		for(int i=0;i<10;i++){
			System.out.print("������������");
			arr[i]=input.nextInt();
			}
		int max=arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
			}	
		}
		return max;
	}
}
