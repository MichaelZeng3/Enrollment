import java.util.ArrayList;
import java.util.List;


public class Course {
	private String CourseName;
	private String CourseID;
	List<Student> students = new ArrayList<Student>();
	public Course(String CourseName,String CourseID) {
		this.CourseID = CourseID;
		this.CourseName = CourseName;
	}
	public boolean enroll(Student student) {
		
		if (student == null) {
		return false;
		}else {
					students.add(student);
				}
			return true;
	}
		
	public Boolean isIntheCourse(Student student) {
		Boolean enrolled = false;
		if(students.contains(student)) {
				enrolled = true;		
		}
		return enrolled;
		
	}
	@Override
	public String toString() {
		return String.format( "Course:%s\nCourseID:%s\nEnrolled Students:%s",this.CourseName,this.CourseID,students);

	}
}
