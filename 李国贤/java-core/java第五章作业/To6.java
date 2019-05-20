import java.util.Scanner;
import java.util.Random;
public class To6{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		Random rd=new Random();
		int ren;
		int renCount=0;
		int com;
		int comCount=0;
		int i=1;
		while(i<=5){
			com=rd.nextInt(3)+1;
			System.out.println("请出拳:（1-石头;2-剪刀;3-布)");
			ren=input.nextInt();
			if(ren==com){
				System.out.println("第"+i+"局,平局");
			}else if((ren-com==1)||(ren-com==-2)){
				System.out.println("第"+i+"局,电脑赢");
			}else{
				System.out.println("第"+i+"局,人赢");
			renCount++;
			}
			if(comCount==3||renCount==3){
				break;
			}
				i++;
			}
			if(renCount>comCount){
				System.out.println("人赢");
			}else if(renCount<comCount){
				System.out.println("电脑赢");
			}else{
				System.out.println("平局");
			}
	}

}