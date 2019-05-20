/*
编程使用 while 循环输出：100、95、90、85……、5。
*/
import java.util.Scanner;
public class To3{
	public static void main(String[] args){
		int i=100;
		while(i>0){
			if(i%5==0){
			System.out.println(i);
			}
			i--;
		}
	}
}