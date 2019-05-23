/*
 ÇóºÍ:1!+2!+3!+4! +......+10!
*/
public class To4{
	public static void main(String[] args){
		int a=0;
		for(int i=1;i<=10;i++){
			int sum=1;
			for(int j=1;j<=i;j++){
				sum=sum*j;	
			}
			a=sum+a;
		}
			System.out.print(a);
	}
}