
public class Account {
	int money;
	int sum=0;
	
	
	public void save(int money){
		sum=sum+money;
		System.out.println("������Ϊ��"+money+"\n===��ǰ���Ϊ��"+sum+"Ԫ===");
		
	}
	public void with(int money){
		sum=sum-money;
		System.out.println("ȡ�����Ϊ��"+money+"\n===��ǰ���Ϊ��"+sum+"Ԫ===");
		
	}
}
