
public class Delete {
	Student[] stus = new Student[5];
	
	public void dele(Student stu){
		for(int i = 0;i < stus.length;i++){
			if(stus[i].name.equals(stu.name)){
				stus[i] = null;
				break;
			}
		}
	}    
	
	public void xianshi(Student stu){
		for(int i = 0;i < stus.length;i++){
			if(stus[i]==null){
				stus[i] = stu;
				break;
			}
		}
	}
	public void age(Student stu){
		for(int i = 0;i < stus.length;i++){
			if(stus[i].name.equals(stu.name)){
				stus[i].age = stu.age;
				break;
			}
		}
	}
}
















