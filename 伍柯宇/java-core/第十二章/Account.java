
public class Account {
	double sum=0;
	public void addmoney(int a){
		
		sum+=a;
		System.out.println("���ɹ�\n\n***��ǰ���Ϊ��"+sum+"***");
	}
	public void deletemoney(int b){
		if(sum>=b){
			sum-=b;
			System.out.println("ȡ��ɹ�\n\n***��ǰ���Ϊ��"+sum+"***");
		}else{
			if(sum<b){
				System.out.println("����ʧ��\n\n***��ǰ����***");
			}
		}
	}
}
