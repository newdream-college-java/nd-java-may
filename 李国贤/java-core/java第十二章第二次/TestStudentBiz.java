
public class TestStudentBiz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentBiz d1=new StudentBiz();
		Student[] arr=new Student[3];
		arr = d1.score();
		arr = d1.getAvg(arr);
		for (int i = 0;  i< arr.length; i++) {
			System.out.print("平均成绩为："+arr[i].pinjun+"\t");
		}
	}

}
