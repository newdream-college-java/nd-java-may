import java.util.Scanner;
public class To2{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("���������ӵĸ���:");
		int a=input.nextInt();
		int sum=0;
		if(a>=3&&a<=5){
			sum=a+1;
			System.out.println("��õ���������Ϊ:"+sum);
		}
		else if(a>5){
			sum=a+2;
			System.out.println("��õ���������Ϊ:"+sum);
		}else{
			System.out.println("��õ���������Ϊ:"+a);
		}

}
}