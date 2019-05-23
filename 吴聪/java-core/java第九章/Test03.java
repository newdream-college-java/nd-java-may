import java.util.*;
public class Test03{
	public static void main(String[] args) {
		char[] a={'a','c','b','s','z'};
		Arrays.sort(a);
		for(int i=4;i>=0;i--){
			System.out.print(a[i]+"\t");
		}
	}
}