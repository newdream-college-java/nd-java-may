import java.util.Scanner;
public class TestAdam {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adam d1=new Adam();
		Adam d2=new Adam();
		d1.name="admin1";
		d1.word=111111;
		d1.show();
		
		d2.name="admin2";
		d2.word=222222;
		d1.show();
		
		Scanner input=new Scanner(System.in);
		System.out.println("�������û�����");
		String c=input.next();
		System.out.println("���������룺");
		int d=input.nextInt();
		if(c.equals(d1.name)&&d==d1.word){
			System.out.println("�����������룺");
			int e=input.nextInt();
		
			System.out.println("�޸�����ɹ�������������Ϊ��"+e);
		
			System.out.println("�������û�����");
			String m=input.next();
			System.out.println("���������룺");
			int n=input.nextInt();
			if(m!=d1.name||n!=e){
				System.out.println("�û��������벻ƥ�䣡��û��Ȩ�޸��¹���Ա��Ϣ��");
			}	
		}
	}

}
