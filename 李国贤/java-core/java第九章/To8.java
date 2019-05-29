import java.util.*;
public class To8{
	public static void main(String[] args){
		String[] arr={"Island","Ocean","Pretty","Sun",""};
//		String[] arr = new String[5];
//		String arr[0]=Island;
		Arrays.sort(arr);
		for(int i=0;i<5;i++){
			System.out.print(arr[i]+"\t");
		}
		System.out.println("\n请输入插入的字符");
		String ats="Ready";
		System.out.println("比较字符的大小");
		for(int i=0;i<arr.length;i++){
			int input=ats.compareToIgnoreCase(arr[i]);
			System.out.println(input);
			if(input>0){
				System.out.println("大于");
			}else if(input<0){
				System.out.println("小于");
			}else{
				System.out.println("零");
			}
		}
	System.out.print("Island","Ocean","Pretty","Ready","Sun")
	}
}	










		/*System.out.println("比较第一个字符的大小");
		for(int i=1;i<5;i++){
			int input=arr[0].compareToIgnoreCase(arr[i]);
			System.out.println(input);
		}
		System.out.println("比较第二个字符的大小");
		for(int i=1;i<arr.length-1;i++){
			int input=arr[1].compareToIgnoreCase(arr[i+1]);
			System.out.println(input);
		}
		System.out.println("比较第二个字符的大小");
		for(int i=1;i<arr.length-2;i++){
			int input=arr[2].compareToIgnoreCase(arr[i+1]);
			System.out.println(input);
		}*/
		

