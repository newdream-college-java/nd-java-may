import java.util.Scanner;
public class Test07{
	public static void main(String[] args){
		while(true){


			Scanner input=new Scanner(System.in);
			

System.out.println("������һ����");
			

int a=input.nextInt();


			

System.out.println("�������������");


			String j=input.next();


			System.out.println("��������һ����");

				
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
					System.out.println("��������Ϊ0������������");
				}

		}
	}

}