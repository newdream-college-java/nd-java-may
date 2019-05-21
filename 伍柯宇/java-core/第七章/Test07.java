import java.util.*;

public class Test07{
	public static void main(String[] args){
		Scanner input =new Scanner(System.in);
		System.out.print("请输入与年份：");
		int year = input.nextInt();
		System.out.print("请输入月份：");
		int month = input.nextInt();

		int sum= 0;
		//1.总天数=整年天数+整月天数+1天
		//1.1整年天数=1900年+1901年+......+(year-1)年
		for(int i=1900;i<year;i++){
			if(i%4==0&&i%100!=0||i%400==0){//闰年
				sum+=366;
			}else{
				sum+=365;
			}
		}
		//1.2整月天数=2018年的1月+2月+。。。。。+（month-1）月天数
		for(int i=1;i<month;i++){
			if(i==2){
				if(i%4==0&&i%100!=0||i%400==0){//润年---2019年
					sum+=29;
				}else{//平年
					sum+=28;
				}
			}else if(i==4||i==6||i==9||i==11){//小月
				sum+=30;
			}else{//判断条件最多的放到else  大月
				sum+=31;
			}
		}
		//1.3加1号这一天
		sum+=1;
		//2.关键要素 2:确定这一年这一月的天数?
		int days = 0;//表示这个月的总天数
		if(month==2){
				if(year%4==0&&year%100!=0||year%400==0){//润年
					days+=29;
				}else{//平年
					days+=28;
				}
		}else if(month==4||month==6||month==9||month==11){//小月
			days+=30;
		}else{//判断条件最多的放到else  大月
			days+=31;
		}
		//3.输出日历表
		//3.1输出表头
		System.out.println("\t\t"+year+"年"+month+"月");
		//3.2输出星期
		System.out.println("日\t一\t二\t三\t四\t五\t六\t");
		//3.3输出日历
		//1-确定1号的位置：1号是星期几前面就打几个\t
		for(int i=1;i<=sum%7;i++){
			System.out.print("\t");
		}
		for(int i=1;i<=days;i++){
			System.out.print(i+"\t");
			if(sum%7==6){//如果这一天是星期六就换行
				System.out.print("\n");
			}
			sum++;//每天打印一年总体天数+1

		}
	}
}







