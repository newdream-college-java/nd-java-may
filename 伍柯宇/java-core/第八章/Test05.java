/*
打印九九乘法表（先打最后1行 最后打第1行）
*/
public class Test05{
	public static void main(String[] args){
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+"*"+i+"="+(i*j)+"\t");
			}
			System.out.println();
		}
	}
}