
public class Oblong {
	int length;
	int width;
	
	public void move(){
		System.out.println("���������ƶ�");
	}
	public void change(){
		System.out.println("���������ڱ仯");
	}
	public void message(){
		System.out.println("�����εĳ���"+length+"�����εĿ�"+width);
	}
	public int length_message(){
		return length;
	}
	public int width_message(){
		return width;
	}
	public int girth(){
		return (width+length);
	}
	public int area(){
		return width*length;
	}
}








