/*
��ӡ99�˷���
*/
public class Test05{
	public static void main(String[] args){
		for(int j=9;j>=1;j--){//��ӡ9��
			for(int i=1;i<=j;i++){//��ӡ9��
				System.out.print(j+"*"+i+"="+j*i+"\t");
				if(j==i){
				System.out.println();
				}
			}
		}
	}
}