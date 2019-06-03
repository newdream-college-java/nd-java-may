
public class Demo {
	public static void main(String[] args) {
		CurrentTime time = new CurrentTime();
		time.show();
		
		time.year=2019;
		time.month=5;
		time.day=12;
		time.hour=10;
		time.min=11;
		time.second=30;
		time.show();
			
	}
}
