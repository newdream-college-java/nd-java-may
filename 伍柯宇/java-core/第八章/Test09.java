public class Test09{
	public static void main(String[] args){
		int kg=0;
		int x=7;
		for(int i=1;i<=4;i++){
			for(int j=0;j<=kg;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=x;j++){
				System.out.print("*");
			}
			System.out.println();
			kg++;
			x-=2;
		}
	}
}