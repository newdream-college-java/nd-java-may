import java.util.*;

public class Test03{
	public static void main(String[] args){
		String[] arr={"a","c","u","b","e","p","f","z"};
		System.out.print("Ô­×Ö·ûĞòÁĞ£º");
		for(int i=0;i<=7;i++){
			System.out.print(arr[i]+"\t");
		}
		Arrays.sort(arr);
		System.out.print("\nÉıĞòÅÅĞòºó£º");
		for(int i=0;i<=7;i++){
			System.out.print(arr[i]+"\t");
		}
		System.out.print("\nÄæĞòÊä³öÎª£º");
		for(int i=7;i>=0;i--){
			System.out.print(arr[i]+"\t");
		}
		
		
	}
}