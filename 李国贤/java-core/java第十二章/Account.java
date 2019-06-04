
public class Account {
	int money;
	int sum=0;
	
	
	public void save(int money){
		sum=sum+money;
		System.out.println("存款余额为："+money+"\n===当前余额为："+sum+"元===");
		
	}
	public void with(int money){
		sum=sum-money;
		System.out.println("取款余额为："+money+"\n===当前余额为："+sum+"元===");
		
	}
}
