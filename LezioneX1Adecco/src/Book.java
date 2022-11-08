
public class Book { 
	private String title, author;
	private int nPages;
	
	public Book() {
		setTitle=("Author");
		setAuthor=("Title");
		setNpages=(100);		
	}
	public Book(String title, String author, int nPages) {
		setTitle(title);
		setAuthor(author);
		setNpages(nPages);
	}
	public Book(int nPages) {
		setNpages(npages);
		setAuthor("Autore");
		setNpages(100);
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public int getNpages() {
		return nPages;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setNpages(int nPages) {
		this.nPages = nPages > 0 ? nPages : nPages-1;
	}
	public String toString() {
		return  "Titolo: " + this.title + 
				"\nAutore: " + this.author + 
				"\nNumero di Pagine: " + this.nPages;
	}


}
