/*
[1,3,-1,5,-2]逆序放进新数组里，并且小于0 的按0存储
*/
import java.util.Arrays;
public class Test07{
	public static void main(String[] args){
		int[] a = {1,3,-1,5,-2};
		int[] newArray = new int[5];
		Arrays.sort(a);
		for(int i = 0;i<5;i++){
			if(a[i]<0){
				a[i] = 0;
			}
			newArray[i] = a[4-i];
		}
		for(int i = 0;i<5;i++){
			System.out.print(newArray[i]);
		}
	}
}