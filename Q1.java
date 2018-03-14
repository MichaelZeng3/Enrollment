import java.util.Scanner;


public class Q1 {
	// implement requirements A - D here
    // ...
	private String title;
	private String borrowerID;
	private String bookID;
	private String author;
	
	public Q1(String title,String bookID,String author) {
		super();
		this.title = title;
		this.borrowerID = null;
		this.bookID = bookID;
		this.author = author;
	}
    
	public String getTitle() {
		return title;
	}


	public String getBorrowerID() {
		return borrowerID;
	}


	public void setBorrowerID(String borrowerID) {
		this.borrowerID = borrowerID;
	}


	public String getBookID() {
		return bookID;
	}


	public String getAuthor() {
		return author;
	}
	public boolean borrow(String borrowerID) {
		if (this.borrowerID != null) {
			return false;
		}
		else{
			this.borrowerID = borrowerID;
			return true;
		}
	}
	public void borrowBook() {
		if (this.borrowerID == null) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Borrower's ID: ");
			setBorrowerID(sc.next());//this.borrowerID = borrowerID;
			
		}
		else{
			System.out.println("this book is borrowed");
		}
			//reset borrowerID to null and return true result
	}


	//method which allows the Book to be "returned" if it has been borrowed
	public boolean returnBook() {
		//if borrower ID has been set (ie. book has been borrowed)
		if (this.borrowerID != null) {
			//reset borrowerID to null and return true result
			this.borrowerID = null;
			return true;
			} 
		else {
			//otherwise book is not currently borrowed so return false result
			return false;
		}
	}
		//format Book details to a String (useful for printing!)
	@Override
	public String toString() {
		return String.format( "Book ID:%s\nTitle: %s\nAuthor: %s\nBorrowed by: %s\n", 
				this.bookID, this.title, this.author,this.borrowerID != null ? 
						this.borrowerID : "Available");
	}
}