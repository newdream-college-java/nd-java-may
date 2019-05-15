/*
编程实现一个简单的人与电脑的猜拳游戏软件。
*/

import java.util.*;
public class Test09{
	public static void main(String[] args){
		Scanner input =new Scanner(System.in);
		Random rd = new Random();
		int ren ;//人出的拳
		int renCount=0;//人赢的次数
		int com ; //电脑出的拳
		int comCount=0;//电脑赢的次数
		int i = 1;
		while(i<=5){
			com =rd.nextInt(3)+1;//1~3
			System.out.println("请出拳:(1-石头；2-剪刀；3-布)");
			ren = input.nextInt();

			//3.判断输赢
			if(ren==com){
				System.out.println("第"+i+"局，平局");
			}else if((ren-com==1)||(ren-com==-2)){
				System.out.println("第"+i+"局，电脑赢");
				comCount++;
			}else{
				System.out.println("第"+i+"局，人赢了");
				renCount++;
			}
			//4.是否终止比赛
			if(comCount==3||renCount==3){
				//终止比赛（终止循环 break）
				break;
			}

			i++;
		}
		//最终输赢
		if(renCount>comCount){
			System.out.println("人赢了");
		}else if(renCount<comCount){
			System.out.println("电脑赢了");
		}else{	
			System.out.println("平局！！");
		}
		
	}
}