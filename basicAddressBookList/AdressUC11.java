import java.util.ArrayList;

public class AdressUC11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             
		ArrayList<Book> store = new ArrayList<Book>();
		int length = store.size();
		Book b11=new Book(1,"krishna","kumari","dknl","odisha","75433","98989898","dg@we");
		
		Book b12=new Book(1,"krishna","kumari","dknl","odisha","75433","98989898","dg@we");
		
		store.add(b11);
		store.add(b12);
		store.stream().forEach(System.out::println);
		for( Book iz: store)
		{
			//Book b=iz.Book;
			//System.out.println(i.toString());
			System.out.println("contact details are : ");
			System.out.println(iz);
			//System.out.println(b.id+ " " +b.fsname+ " " +b.lname+ " " +b.city+ " " +b.state+ " " +b.zip_code+ " " +b.phone_no+ " " +b.email+ " " );
			
		}
;	}

}
