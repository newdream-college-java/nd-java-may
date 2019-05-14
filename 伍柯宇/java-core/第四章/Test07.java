import java.util.Scanner;
public class Test07{
	public static void main(String[] args){
		while(true){


			Scanner input=new Scanner(System.in);
			

System.out.println("请输入一个数");
			

int a=input.nextInt();


			

System.out.println("请输入运算符号");


			String j=input.next();


			System.out.println("请再输入一个数");

				
			int b=input.nextInt();


			if(b!=0){


				if (j.equals("+"))

{


					System.out.println("a+b="+(a+b));

				}


				if (j.equals("-"))

{

	
					System.out.println("a-b="+(a-b));


				}
				if (j.equals("*")){


					System.out.println("a*b="+(a*b));


				}


				if (j.equals("/"))

{


					System.out.println("a/b="+(a/b));


				}
				if (j.equals("%"))

{


					System.out.println("a%b="+(a%b));
				}


			}
				else{ 
					System.out.println("除数不能为0，请重新输入");
				}

		}
	}

}