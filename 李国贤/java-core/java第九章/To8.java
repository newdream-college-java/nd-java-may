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
		System.out.println("\n�����������ַ�");
		String ats="Ready";
		System.out.println("�Ƚ��ַ��Ĵ�С");
		for(int i=0;i<arr.length;i++){
			int input=ats.compareToIgnoreCase(arr[i]);
			System.out.println(input);
			if(input>0){
				System.out.println("����");
			}else if(input<0){
				System.out.println("С��");
			}else{
				System.out.println("��");
			}
		}
	System.out.print("Island","Ocean","Pretty","Ready","Sun")
	}
}	










		/*System.out.println("�Ƚϵ�һ���ַ��Ĵ�С");
		for(int i=1;i<5;i++){
			int input=arr[0].compareToIgnoreCase(arr[i]);
			System.out.println(input);
		}
		System.out.println("�Ƚϵڶ����ַ��Ĵ�С");
		for(int i=1;i<arr.length-1;i++){
			int input=arr[1].compareToIgnoreCase(arr[i+1]);
			System.out.println(input);
		}
		System.out.println("�Ƚϵڶ����ַ��Ĵ�С");
		for(int i=1;i<arr.length-2;i++){
			int input=arr[2].compareToIgnoreCase(arr[i+1]);
			System.out.println(input);
		}*/
		

