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
			System.out.println("���ȭ:��1-ʯͷ;2-����;3-��)");
			ren=input.nextInt();
			if(ren==com){
				System.out.println("��"+i+"��,ƽ��");
			}else if((ren-com==1)||(ren-com==-2)){
				System.out.println("��"+i+"��,����Ӯ");
			}else{
				System.out.println("��"+i+"��,��Ӯ");
			renCount++;
			}
			if(comCount==3||renCount==3){
				break;
			}
				i++;
			}
			if(renCount>comCount){
				System.out.println("��Ӯ");
			}else if(renCount<comCount){
				System.out.println("����Ӯ");
			}else{
				System.out.println("ƽ��");
			}
	}

}