import java.util.*;

public class Test03{
	public static void main(String[] args){
		String[] arr={"a","c","u","b","e","p","f","z"};
		System.out.print("ԭ�ַ����У�");
		for(int i=0;i<=7;i++){
			System.out.print(arr[i]+"\t");
		}
		Arrays.sort(arr);
		System.out.print("\n���������");
		for(int i=0;i<=7;i++){
			System.out.print(arr[i]+"\t");
		}
		System.out.print("\n�������Ϊ��");
		for(int i=7;i>=0;i--){
			System.out.print(arr[i]+"\t");
		}
		
		
	}
}