/*
Ӣ�ĸ�������a��z���� �������֮��ҲҪ����
*/
import java.util.Scanner;
import java.util.Arrays;
public class Test08{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String[] music = {"Island","Ocean","Pretty","Sun",""};
		Arrays.sort(music);
		System.out.print("����ǰ������Ϊ��");
		for(int i = 1;i<5;i++){
			System.out.print(music[i]+"\t");
		}
		System.out.print("\n����������ƣ�");
		String str = input.next();
		music[0] = str;
		for(int i = 1;i<5;i++){
			if(music[i-1].compareToIgnoreCase(music[i])>0){
				String s;
				s = music[i-1];
				music[i-1] = music[i];
				music[i] = s;
			}else{
				break;
			}
		}
		System.out.print("����������Ϊ��");
		for(int i = 0;i<5;i++){
			System.out.print(music[i]+"\t");
		}
	}
}