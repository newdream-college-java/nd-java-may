/**
 * ��ӡ**
 * @author ƨƨ
 *
 */
import java.util.Scanner;

public class DaXing {
	public void syso(int h,String g){
		for(int i = 1;i<=h;i++){
			for(int j = 1;j<=i;j++){
				System.out.print(g);
			}
			System.out.println();
		}
	}
	public void num(){
		Scanner input = new Scanner(System.in);
		System.out.print("�������иߣ�");
		int h = input.nextInt();
		System.out.print("�������ӡ���ַ���");
		String g = input.next();
		syso(h,g);
	}
}
