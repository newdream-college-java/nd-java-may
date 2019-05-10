/*
Èı¸öÊıÅÅĞò
*/
import java.util.Scanner;
public class Px{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int a = input.nextInt(),
		      b = input.nextInt(),
		      c = input.nextInt(),t;  
		if(b<a){
			t = a; a = b; b = t;  
		}
		if(c<a){
			t = a; a = c; c = t; 
		}				
		if(b>c){
			t = c; c = b; b = t; 
		}		
	System.out.println(a+","+b+","+c);		
	}

}