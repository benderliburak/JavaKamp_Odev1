
public class Main {

	public static void main(String[] args) {
	
Category category1 = new Category();
category1.id=1;
category1.name="C#";


Category category2 = new Category();
category2.id=2;
category2.name="C+";


Category category3 = new Category();
category3.id=3;
category3.name="java";


Student student1= new Student(1,"Burak","Benderlioðlu",category1.name);
Student student2= new Student(2,"Can","Aslan",category2.name);
Student student3= new Student(3,"Engin","Demiroð",category3.name);

InformationCourse  studentoperation= new InformationCourse();

studentoperation.addToStudent(student3);
studentoperation.addToStudent(student2);
studentoperation.addToStudent(student1);



	}

}
