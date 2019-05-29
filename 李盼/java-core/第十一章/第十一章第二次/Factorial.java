
public class Factorial {
	public int jiecheng(int n){
		if(n<=1){
			return 1;
		}else{
			return n*jiecheng(n-1);
		}
	}
}
