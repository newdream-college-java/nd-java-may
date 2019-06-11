import java.util.Scanner;


public class TestCustomer {
	public static void main(String[] args) {
		Customer d1=new Customer();
		Scanner input=new Scanner(System.in);
		String[] sum=new String[5];
		int i=0;
		for (; i < 5; i++) {
			System.out.println("请输入客户名字：");
			String name=input.next();
			sum[i]=name;
		}
		for (int j = 0; j < sum.length; j++) {
			System.out.print(sum[j]+"\t");
			
		}
		d1.stus(sum);
		
	}
}
