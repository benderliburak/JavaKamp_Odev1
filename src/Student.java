
public class Student {
	
	
	public Student ()
	{
		System.out.println("Öðrenci ekleme iþlemleri");
	}
	public Student (int number ,String name , String surname, String course )
	{
		
		this();
		this.number= number;
		this.name=name;
		this.surname=surname;
		this.course=course;
	
	}
	int number ;
	String name ;
	String surname;
	String course;

}
