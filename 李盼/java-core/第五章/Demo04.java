/*
一口缸能存100L水，一次提3L，多少次把水缸提满
*/
public class Demo04{
	public static void main(String[] args){
		int i=0,j=0;
		while(i<100){
			i = i+3;
			j++;
		}
		System.out.println(j+"次把水缸提满");
	}
}