import java.util.Scanner;

public class Test03{
	public static void main(String[] args){
		int x=123456,y=555555;//第一第二道密码
		Scanner input=new Scanner(System.in);
		System.out.print("请输入第一道密码：");
		int one=input.nextInt();
		if(one==x){
			System.out.print("请输入第二道密码：");
			int two=input.nextInt();
			if(two==y){
				System.out.println("恭喜拿到钱了");
			}else{
				System.out.println("第2道密码错误");
			}
		}else{
			System.out.println("第1道密码错误");
		}

	}
		

}