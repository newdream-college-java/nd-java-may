import java.util.Scanner;
public class WuT{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入年：");
		int i = input.nextInt();
		System.out.println("请输入月：");
		int j = input.nextInt();
		System.out.println("请输入日：");
		int k = input.nextInt();
		int m;
		if(i%4==0&&i%100!=0||i%400==0){
			switch(j){
				case 1:
					m = k-1;
					System.out.println(m);
					break;
				case 2:
					m = k-1+31;
					System.out.println(m);
					break;
				case 3:
					m = k-1+31+29;
					System.out.println(m);
					break;
				case 4:
					m = k-1+31+29+31;
					System.out.println(m);
					break;
				case 5:
					m = k-1+31+29+31+30;
					System.out.println(m);
					break;
				case 6:
					m = k-1+31+29+31+30+31;
					System.out.println(m);
					break;
				case 7:
					m = k-1+31+29+31+30+31+30;
					System.out.println(m);
					break;
				case 8:
					m = k-1+31+29+31+30+31+30+31;
					System.out.println(m);
					break;
				case 9:
					m = k-1+31+29+31+30+31+30+31+31;
					System.out.println(m);
					break;
				case 10:
					m = k-1+31+29+31+30+31+30+31+31+30;
					System.out.println(m);
					break;
				case 11:
					m = k-1+31+29+31+30+31+30+31+31+30+31;
					System.out.println(m);
					break;
				case 12:
					m = k-1+31+29+31+30+31+30+31+31+30+31+30;
					System.out.println(m);
					break;
				default:
					System.out.println("输入有误");
					break;
			}
		}
		else{
			switch(j){
				case 1:
					m = k-1;
					System.out.println(m);
					break;
				case 2:
					m = k-1+31;
					System.out.println(m);
					break;
				case 3:
					m = k-1+31+28;
					System.out.println(m);
					break;
				case 4:
					m = k-1+31+28+31;
					System.out.println(m);
					break;
				case 5:
					m = k-1+31+28+31+30;
					System.out.println(m);
					break;
				case 6:
					m = k-1+31+28+31+30+31;
					System.out.println(m);
					break;
				case 7:
					m = k-1+31+28+31+30+31+30;
					System.out.println(m);
					break;
				case 8:
					m = k-1+31+28+31+30+31+30+31;
					System.out.println(m);
					break;
				case 9:
					m = k-1+31+28+31+30+31+30+31+31;
					System.out.println(m);
					break;
				case 10:
					m = k-1+31+28+31+30+31+30+31+31+30;
					System.out.println(m);
					break;
				case 11:
					m = k-1+31+28+31+30+31+30+31+31+30+31;
					System.out.println(m);
					break;
				case 12:
					m = k-1+31+28+31+30+31+30+31+31+30+31+30;
					System.out.println(m);
					break;
				default:
					System.out.println("输入有误");
					break;
			}
		}
	}
}