package demo01;

public class TestDog {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a ;
		Dog dog = new Dog();
		dog.name = "��������";
		dog.color = "��ɫ";
		dog.weight = "32.5";
		
		dog.show();
		dog.name = "����";
		dog.color = "��ɫ";
		dog.weight = "23.5";
		dog.show();

	}

}
