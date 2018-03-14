
public class EnrolmentSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student A = new Student("michael","1234");
		Student B = new Student("lucy","1233");
		Student C = new Student("Mark","1222");
		Course P = new Course("programming","0000");
		P.enroll(null);
		P.enroll(A);
		P.enroll(B);
		System.out.println(P);
		System.out.println(A);
		System.out.println(B);
		P.isIntheCourse(A);
		P.isIntheCourse(B);
		P.isIntheCourse(C);
	}

}
