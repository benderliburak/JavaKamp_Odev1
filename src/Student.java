
public class Student {
	
	
	public Student ()
	{
		System.out.println("��renci ekleme i�lemleri");
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
