public class Test04{
	public static void main(String[] args){
		int e=1;
		int sum=0;
		for(int i=1;i<=10;i++){
			for(int a=1;a<=i;a++){
				e*=a;
			}
			sum+=e;
		}
			
			System.out.println(sum);
	}
}