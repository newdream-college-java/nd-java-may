/*
�����ַ�
*/
import java.util.*;
public class Test04{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		char[] arr = new char[]{'a','c','u','b','e','p','f','z',' '};
		System.out.print("ԭ�ַ����У�");
		for(int i =0;i<8;i++){
			System.out.print(arr[i]+"\t");
		}
		System.out.print("\n���������");
		Arrays.sort(arr);
		for(int i =0;i<8;i++){
			System.out.print(arr[i]+"\t");
		}
		System.out.print("\n������һ���ַ���");
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
		System.out.print("\n�����ַ�����ַ����У�");
		for(int j = 0;j<arr.length;j++){
			System.out.print(arr[j]);
		}
		System.out.print("\n�����λ���ǣ�"+(i-1));
	}
}