/*
打印*
*/
public class Test06{
	public static void main(String[] args){
		int kg = 0;
		for(int i = 1;i<5;i++){
			//打印空格
			for(int j=1;j<=kg;j++ ){
				System.out.print(" ");
			}
			kg++;
			//打印*
			for(int k = 1;k<=14;k++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}