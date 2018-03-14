
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q1 b1 = new Q1("Divergent","B001","Veronica Roth");
		Q1 b2 = new Q1("Green Eggs and Ham","B002","Dr Seuss");
		System.out.println(b1.getBookID()+" "+b1.getTitle()+"\n"+b2.getBookID()+" "+b2.getTitle());
		boolean result = b1.borrow("m1234");
		for(int i=0;i<2;i++) {
			result = b1.returnBook();
			if (result) {
				System.out.println("Book returned");
			}else{
				System.out.println("Book not on loan");
			}
		}
		System.out.println(new Q2());
		System.out.println(b1);
		System.out.println(b2);
		b1.borrow("m1234");
		System.out.println(b1);
	}
	
}
