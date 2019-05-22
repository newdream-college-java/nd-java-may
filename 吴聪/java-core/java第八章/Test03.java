/*
循环365天 每天3次饭 要求使用嵌套循环完成 每过一天输出"总算又过了一天" 然后在这天输出"我吃了一顿饭"三次
*/
public class Test03{
	public static void main(String[] args){
		for(int i=1;i<366;i++){
			for(int j=1;j<4;j++){
				System.out.println("我吃了一顿饭");
			}
			System.out.println("总算又过了一天");
		}
	}
}