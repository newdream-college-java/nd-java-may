import java.util.*;

public class Maths {
	public int[] in(){
		Scanner input = new Scanner(System.in);
		int[] a = new int[10];
		for (int i = 0; i < a.length; i++) {
			System.out.print("请输入第"+(i+1)+"个数");
			a[i] = input.nextInt();
		}
		return a;
	}
	
	public int s(int[] a){
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
	
	public int m(int[] a){
		int max = a[0];
		for (int i = 0; i < a.length-1; i++) {
			if(a[i]<a[i+1]){
				max = a[i+1];
			}
		}
		return max;
	}
}
