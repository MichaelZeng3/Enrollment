
public class Student {
	private String name;
	private String studentNumber;
	public Student(String name,String studentNumber) {
		this.name = name;
		this.studentNumber = studentNumber;
		
		
	}
	public String getStudentNumber() {
		return studentNumber;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return String.format( "Student:%s\nStudentID:%s",this.name,this.studentNumber);
	}
}
