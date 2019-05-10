/*
输入三个int型的数据，放入到a,b,c三个变量中去，使用条件结构与交换逻辑将这三个变量中的值从小到大排列。
*/
/*

*/
import java.util.Scanner;
public class Test05{
	public static void main (String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("输入三个整数：");
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
//		int t;
/*		if (a>b&&b>c){
			System.out.print(c+","+b+","+a);
		}else if(a>b&&b<c){
			System.out.print(b+","+c+","+a);
		}else if(b>a&&a>c){
			System.out.print(c+","+a+","+b);
		}else if(b>c&&c>a){
			System.out.print(a+","+c+","+b);
		}else if(c>b&&b>a){
			System.out.print(a+","+b+","+c);
		}else if(c>a&&a>b){
			System.out.print(b+","+a+","+c);
		}else if(a==b&&b>c){
			System.out.print(c+","+a+","+b);
		}else if(a==b&&c>b){
			System.out.print(b+","+a+","+c);
		}else if(b==c&&a>b){
			System.out.print(c+","+b+","+a);
		}else if(b==c&&b>a){
			System.out.print(a+","+b+","+c);
		}else if(a==c&&a>b){
			System.out.print(b+","+a+","+c);
		}else if(a==c&&b>a){
			System.out.print(c+","+a+","+b);
		}
*/
/*		if(b<a){
			t = a; a = b; b = t;  
			if(c<a){
				t = a; a = c; c = t; 				
				if(b>c){
					t = c; c = b; b = t; 
				}
			}
		}
		else if(b>c){
				t = b; b = c; c = t; 
			if(a>b){
				t = a; a = b; b = t; 
			}
		}
		System.out.println(a+","+b+","+c);		*/

/*
4321
3214
2134
1234
*/
		if (a > b) {
		a = a + b;
		b = a - b;
		a = a - b;
		}
		if (b > c) {
		b = b + c;
		c = b - c;
		b = b - c;
		}
		if (a > b) {
		a = a + b;
		b = a - b;
		a = a - b;
		}
		System.out.print(a+","+b+","+c);
	}
}