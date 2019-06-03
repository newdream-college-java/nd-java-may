/*
 * 创建客户业务类 CustomerBiz,实现客户姓名的添加和显示，
 */
import java.util.*;
public class CustomerBiz{
	Scanner input=new Scanner(System.in);
	public void customer(){
		String []arr=new String[4];
		for(int i=0;i<arr.length;i++){
			System.out.print("请输入客户姓名：");
			arr[i]=input.next();
			System.out.println("继续输入吗： (y/n)");
			String a=input.next();
			if(a.equals("n")){
				break;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println("客户姓名："+arr[i]);
		}
		
	}
}










