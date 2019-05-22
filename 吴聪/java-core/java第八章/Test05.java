/*
打印99乘法表
*/
public class Test05{
	public static void main(String[] args){
		for(int j=9;j>=1;j--){//打印9行
			for(int i=1;i<=j;i++){//打印9列
				System.out.print(j+"*"+i+"="+j*i+"\t");
				if(j==i){
				System.out.println();
				}
			}
		}
	}
}