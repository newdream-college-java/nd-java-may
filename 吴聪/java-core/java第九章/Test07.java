/*
int[] array={1,3,-1,5,-2}
*/
public class Test07{
	public static void main(String[] args){
		int[] array={1,3,-1,5,-2};
		int[] newArray=new int[5];
		int j=4;
		for(int i=0;i<5;i++,j--){
			newArray[j]=array[i];
			if(newArray[j]<0){
				newArray[j]=0;
			}
		}
		for(int i=0;i<5;i++){
			System.out.print(newArray[i]+"\t");
		}
	}
}