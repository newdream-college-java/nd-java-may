package demo01;

public class TestDog {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a ;
		Dog dog = new Dog();
		dog.name = "花花公子";
		dog.color = "黄色";
		dog.weight = "32.5";
		
		dog.show();
		dog.name = "黑熊";
		dog.color = "黑色";
		dog.weight = "23.5";
		dog.show();

	}

}
