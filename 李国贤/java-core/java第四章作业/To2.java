import java.util.Scanner;
public class To2{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入桃子的个数:");
		int a=input.nextInt();
		int sum=0;
		if(a>=3&&a<=5){
			sum=a+1;
			System.out.println("获得的桃子数量为:"+sum);
		}
		else if(a>5){
			sum=a+2;
			System.out.println("获得的桃子数量为:"+sum);
		}else{
			System.out.println("获得的桃子数量为:"+a);
		}

}
}