package ex;
/*
 * Topic: 設計一 class 包含下列資訊:學號、姓名、國文成績、英文成績、數學成績，
 並於主程式讓使用者輸入位學生的資料並根據平均成績由高至低輸出如下:
 ID    NAME     Chinese     English       Math        Avg
 * Date: 2016/11/28
 * Author: 1050210XX 周永振老師
 */

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> studList = new ArrayList<Student>();
		studList.add(new Student("david", "1899"));
		studList.add(new Student("Jack", "1085"));
		studList.add(new Student("Kevin", "1985"));
		studList.get(1).showInfo();
		studList.get(1).addCourse("程式", "1050809");
		studList.grt(1).showInfo();

	}

}

public class Student{
	private String id,name;
	private ArrayList<Course> couList = new ArrayList<Course>();
	public Student (String name1,String id1){
		name = name1; id = id1;
	}
	public void showInfo();
	System.out.println("name:"+name);
	System.out.println("id:"+id);
	System.out.println("# of course"+couList.see());
	
	}}
