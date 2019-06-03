import java.util.Scanner;

public class SortName {
	public String[] sys(){
		Scanner input = new Scanner(System.in);
		String[] name = new String[10];
		for (int i = 0; i < name.length; i++) {
			System.out.println("请输入第"+(i+1)+"客户姓名（英文）：");
			name[i] = input.next();
		}
		return name;
	}
	public String[] sort(String[] str){
		for (int i = 1; i < str.length; i++) {
			for (int j = 0; j < str.length - i; j++) {
				if(str[j].compareToIgnoreCase(str[j+1]) > 0){
					String s;
					s = str[j];
					str[j] = str[j+1];
					str[j+1] = s;
				}
			}
		}
		return str;
	}
}
