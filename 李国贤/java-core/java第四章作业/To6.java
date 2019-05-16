import java.util.Scanner;
public class To6{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入年,月,日:");
		int year=input.nextInt();
		int month=input.nextInt();
		int day=input.nextInt();
		int i=1,a=0;
		while(i<month){
			if(i==2){
				if(year%4==0&&year%100!=0||year%400==0){
					a+=29;
				}else{
					a+=28;
				}
			}else if(i==4||i==6||i==9||i==11){
					a+=30;
			}else
					a+=31;
					i++;
		}
					a+=day;
			System.out.print("输出的天数为"+a);
	}
}