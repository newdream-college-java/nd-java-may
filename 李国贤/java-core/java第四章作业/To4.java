import java.util.Scanner;
public class To4{
public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.println("请输入一个一到七的数字:");
	int a=input.nextInt();
	
	switch(a){
		case 1:
			System.out.println("星期"+a );
		break;
		case 2:
			System.out.println("星期"+a );
		break;
		case 3:
			System.out.println("星期"+a );
		break;
		case 4:
			System.out.println("星期"+a );
		break;
		case 5:
			System.out.println("星期"+a );
		break;
		case 6:
			System.out.println("星期"+a );
		break;
		case 7:
			System.out.println("星期"+a );
		break;
		default:
			System.out.println("输入错误");
	}	
}
}