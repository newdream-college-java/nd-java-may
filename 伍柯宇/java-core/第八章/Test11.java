public class Test11{
	public static void main(String[] args){
		int kg=3;
		int x=1;
		for(int i=1;i<=7;i++){
			for(int j=1;j<=kg;j++){
				System.out.print(" ");
			}
				for(int j=1;j<=x;j++){
					if(i==1||i==4||i==7){
						System.out.print("*");
					}else{
						if(j==1||j==x){
							System.out.print("*");
						}else{
							System.out.print(" ");
						}
					}
					
				}	
			System.out.println();
			if(i>=4){
				kg++;
				x-=2;
			}else{
				
				kg--;
				x+=2;
			}

			/*kg++;
			x-=2;*/
		}
	}
}