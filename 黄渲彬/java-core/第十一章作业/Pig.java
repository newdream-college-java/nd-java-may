package demo05;

public class Pig {
	String breed;
	String color;
	int agg;
	
	public void walk(){
		System.out.println(breed+"Ʒ��"+color+"��ɫ"+"����������ȥ");
	}
	public void pigaggpeople(){
		System.out.println(breed+"Ʒ��"+color+"��ɫ"+"���������,������"+agg);
	}
	public void pigcooked(){
		System.out.println(breed+"Ʒ��"+color+"��ɫ"+"����Ե����");
	}
	public String toString(){
		return breed+color;
	}

}
