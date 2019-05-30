import java.util.Scanner;

public class Account {
	int sum = 0;
	Scanner input = new Scanner(System.in);
	public int save(int money){
		sum += money;
		return sum;
	}
	public int withdraw(int money){
		sum -= money;
		return sum;
	}
}
