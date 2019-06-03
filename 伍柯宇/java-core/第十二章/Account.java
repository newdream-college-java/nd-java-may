
public class Account {
	double sum=0;
	public void addmoney(int a){
		
		sum+=a;
		System.out.println("存款成功\n\n***当前余额为："+sum+"***");
	}
	public void deletemoney(int b){
		if(sum>=b){
			sum-=b;
			System.out.println("取款成功\n\n***当前余额为："+sum+"***");
		}else{
			if(sum<b){
				System.out.println("操作失败\n\n***当前余额不足***");
			}
		}
	}
}
