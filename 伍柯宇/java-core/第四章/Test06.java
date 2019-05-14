import java.util.Scanner;
public class Test06{
	public static void main(String[] args){
		Scanner input =new Scanner(System.in);
		System.out.println("请输入年，月，日：");
		int year = input.nextInt();
		int month = input.nextInt();
		int day = input.nextInt();

		int sum = 0;

		//1月总天数+2月总天数+....+4月总天数
		int i=1; //i表示月份
		while(i<month){
			//sum+=30;
			if(i==2){//2月
				if(year%4==0&&year%100!=0||year%400==0){//闰年
					sum+=29;
				}else{	
					sum+=28;
				}
			}else if(i==4||i==6||i==9||i==11){//小月
				sum+=30;
			}else{//大月
				sum+=31;
			}
			i++;
		}
		//5月14天
		sum+=day;

		System.out.println("总天数为："+sum);



	}
}