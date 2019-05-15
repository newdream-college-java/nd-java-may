/*
 开发一个标题为”FlipFlop”的游戏应用程序。它从 1 计数到 100，遇到 3
的倍数就输出单词“Flip”，遇到 5 的倍数就输出单词”Flop”，既为 3 的倍数也为
5 的倍数就输出”FlipFlop”，其余情况输出当前数字。
*/
public class Test02{
	public static void main(String[] args){
		String a;
		for(int i = 1;i<101;i++){
			if(i%3==0){
				if(i%5==0){
					a = "FilpFlop";
					System.out.println(a);              //能被5并且被3整除
				}
				else{
					a = "Filp";
					System.out.println(a);              //只能被3整除
				}
			}
			else if(i%5==0){                                                          //只能被5整除
				a = "Flop";
				System.out.println(a);
			}
			if(i%3!=0&&i%5!=0){                                               //不能被3不能被5整除
				System.out.println(i);
			}
		}
	}
}