import java.util.Scanner;

public class Student{
	Scanner input = new Scanner(System.in);
	public void max(int a,int b, int c){
		int max = a;
		if(max<b){
			max = b;
		}
		if(max<c){
			max = c;
		}
		System.out.println("���ֵ�ǣ�"+max);
	}
	public double avg(int n){
		int sum = 0;
		for (int i = 0; i < n; i++) {
			System.out.println("�������"+(i+1)+"��ͬѧ�ɼ���");
			int score = input.nextInt();
			sum += score;
		}
		System.out.println(sum);
		return 1.0*sum/n;
	}
}
