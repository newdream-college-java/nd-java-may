import java.util.*;
public class Test04{
	public static void main(String[] args) {
		char[] a={'a','c','b','s','z',' '};
		Scanner in =new Scanner(System.in);
		System.out.print("����һ����ĸ");
		a[a.length-1]=in.next().charAt(0);
		Arrays.sort(a);
		for(int i=a.length-1;i>=0;i--){
			System.out.print(a[i]+"\t");
		}
		for(int i=a.length-1;i>=0;i--){
			if(a[i]=='m'){
				System.out.print("\nλ����"+i);
			}
		}

	}
}