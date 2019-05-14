import java.util.Scanner;
public class Test04{
	public static void main(String[] args){
		String y="yes",x="no";
		Scanner input=new Scanner(System.in);
		System.out.println("你爱我吗？");
		String a=input.next();
		if(a.equals("yes")){
			System.out.println("你是爱我的");
		}
		if(a.equals("no")){
			System.out.println("原来你不爱我");
		}
		if(!a.equals("yes")&&!a.equals("no")){
			System.out.println("你到底是爱还是不爱，自己也不清楚");
		}	

	}
} 
