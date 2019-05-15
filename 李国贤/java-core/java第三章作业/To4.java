import java.util.Scanner;
public class To4{
	public static void main(String[] args){
		System.out.println("输入你爱我吗？");
		Scanner input=new Scanner(System.in);
		String a=input.next();
		if(a.equals("yes")){
			System.out.println("你是爱我的");
		}else if(a.equals("no")){
			System.out.println("原来你是不爱我的");
		}else{
			System.out.println("你到底爱还是不爱，自己也不清楚，");
		}
	}

}