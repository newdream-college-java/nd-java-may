
public class Math {
	int tmp=0;
	public int one(int a,int b) {
		if (a<b) {
			tmp=a;
			a=b;
			b=tmp;
		}
		return a;
	}
	public int two(int c){
		int d=c%10;
		return d;
	}
	public int three(int e){
		int f=e*e*e;
		return f;
	}
	public int four(int n){
		int g=0;
		for (int i = 1; i <= n; i++) {
			g+=i;
		}
		return g;
	}
}
