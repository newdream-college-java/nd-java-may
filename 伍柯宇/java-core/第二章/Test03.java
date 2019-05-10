import  java.util.Scanner;
public class Test03{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入四位数的整数：");
		int a=input.nextInt();
		int last=a%10;
		int ten=a/10%10;
		int hundred=a/100%10;
		int thousand=a/1000%10;
		System.out.println(a+"的个位为："+last);
                                System.out.println(a+"的十位为："+ten);
        		System.out.println(a+"的百位为："+hundred);
        		System.out.println(a+"的千位为："+thousand);
	}
}