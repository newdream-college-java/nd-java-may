/*
用sort()函数正序输出逆序输出
*/
import java.util.*;
public class Test02{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String[] arrStr = {"a","c","u","b","e","p","f","z"};
		System.out.print("原字符数列：");
		for(int i =0;i<8;i++){
			System.out.print(arrStr[i]+"\t");
		}
		System.out.print("\n升序排序后：");
		Arrays.sort(arrStr);
		for(int i =0;i<8;i++){
			System.out.print(arrStr[i]+"\t");
		}
		System.out.print("\n逆序输出为：");
		for(int i = 7;i>=0;i--){
			System.out.print(arrStr[i]+"\t");
		}
	}
}