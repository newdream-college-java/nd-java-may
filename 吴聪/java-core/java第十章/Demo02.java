
public class Demo02 {
	String type;
	int jf;
	public String toString(){
		return "卡类型："+type+"\t积分："+jf;
	}
	public void hk(){
		if(type=="金卡"&&jf>1000){
			System.out.print("回馈积分500");
		}else if(type=="普卡"&&jf>5000){
			System.out.print("回馈积分500");
		}
	}
}
