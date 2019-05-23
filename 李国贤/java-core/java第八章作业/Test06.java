/*
   *
  *  *
 *    *
*******
 *   *
  * *
   *
*/
import java.util.Scanner;
public class Test06{
	public static void main(String[] args){
		int kg=3,xx=1;
		for(int i=1;i<=7;i++){
			for(int j=1;j<=kg;j++){
				System.out.print(" ");
			}
			if(i<4){
				kg--;
			}else{
				kg++;
			}
			for(int j=1;j<=xx;j++){
				if(i==2||i==3||i==5||i==6){
					if(j==1||j==xx){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}else{
					System.out.print("*");
				}
			}
			if(i<4){
				xx+=2;
			}else{
				xx-=2;
			}
			System.out.println();
			}
		
	}
}