import java.util.Scanner;
public class Student {
	public void xiugai(){
		Scanner input = new Scanner(System.in);
		String[] name = new String[5];
		for (int i = 0; i < name.length; i++) {
			System.out.print("������ͻ�������");
			name[i] = input.next();
		}
		System.out.println("*************************************\n\t�ͻ��б�\n***************************");
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i]+"\t");
		}
		System.out.println("������Ҫ�޸ĵĿͻ�������");
		String jiuname = input.next();
		System.out.println("�������µĿͻ�������");
		String newname = input.next();
		boolean flag = false;
		for (int i = 0; i < name.length; i++) {
			if(name[i].equals(jiuname)){
				name[i] = newname;
				System.out.print("�޸ĳɹ���");
				flag = true;
				break;
			}
		}
		if(flag){
			for (int i = 0; i < name.length; i++) {
				System.out.print(name[i]+"\t");
			}
		}else{
			System.out.println("����Ŀͻ�����û���ҵ���");
		}
	}
}
