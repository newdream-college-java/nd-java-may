/*
 * 4��дһ���������࣬���������ԣ�Ʒ�ƣ��۸���ɫ�������з�����
��һ����ʾ��ǰ����������������Եķ���toString��
���������������ķ�����Ҫ�������XXƷ�Ƶ����������ˡ���
�������������ٵķ�����Ҫ�������XXƷ�Ƶ����������С���
���ģ����������ķ�����Ҫ�������XXƷ�Ƶ���������XXԪ�ļ۸����ˡ���
 * */
public class car {
	String brand = "����";
	int price = 100000;
	String color = "��ɫ";
	public String toString(){
		return brand+price+color;
	}
	public void start(){
		System.out.println(brand+"Ʒ�Ƶ�����������");
	}
	public void quicken(){
		System.out.println(brand+"Ʒ�Ƶ�����������");
	}
	public void sell(){
		System.out.println(brand+"Ʒ�Ƶ���������"+price+"Ԫ�ļ۸�����");
	}
}
