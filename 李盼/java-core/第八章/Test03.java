/*
ÇóºÍ£º1!+2!+3!+.......+10!                               4037913
*/
public class  Test03{
	public static void main(String[] args){
		int sum = 0;
		for(int i = 1;i<11;i++){
			int a=1;
			for(int j = 1;j<=i;j++){
				a=a*j;
			}
			sum+=a;
		}
		System.out.println(sum);
	}
}