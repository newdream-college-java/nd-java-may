/*
插入字符
*/
import java.util.*;
public class Test04{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		char[] arr = new char[]{'a','c','u','b','e','p','f','z',' '};
		System.out.print("原字符数列：");
		for(int i =0;i<8;i++){
			System.out.print(arr[i]+"\t");
		}
		System.out.print("\n升序排序后：");
		Arrays.sort(arr);
		for(int i =0;i<8;i++){
			System.out.print(arr[i]+"\t");
		}
		System.out.print("\n请输入一个字符：");
		arr[0]  = input.next().charAt(0);
		int i = 1;
		for(;i<arr.length;i++){
			if(arr[i-1]>arr[i]){
				char t;
				t = arr[i-1];
				arr[i-1] = arr[i];
				arr[i] = t;
			}else{
				break;
			}
		}
		System.out.print("\n插入字符后的字符序列：");
		for(int j = 0;j<arr.length;j++){
			System.out.print(arr[j]);
		}
		System.out.print("\n插入的位置是："+(i-1));
	}
}