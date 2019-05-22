/*
ÇóºÍ1!+2!+3!+...+10!
*/
public class Test04{
	public static void main(String[] args){
		int num=1;
		for(int i=1;i<11;i++){
			int sum=1;
			for(int j=1;j<=i;j++){
				sum*=j;
			}
			num+=sum;
		}
		System.out.print(num);
	}
}