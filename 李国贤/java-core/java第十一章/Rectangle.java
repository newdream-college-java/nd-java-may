
public class Rectangle {
	int length;
	int wide;
	public void move(){
		System.out.println("���������ƶ�");
	}
	public void change(){
		System.out.println("���������ڱ仯");
	}
	public String toString(){
		return "�����εĳ�Ϊ"+length+"��Ϊ"+wide;
	}
	public int a(){
		return length;
	}
	public int b(){
		return wide;
	}
	public int year(){
		return 2*(length+wide);
	}
	public int mianJi(){
		return length*wide;
	}
}
