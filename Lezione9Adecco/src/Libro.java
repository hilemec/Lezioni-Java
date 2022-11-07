
public class Libro {
	private String title;
	private String author;
	private int numeroPagine;
	
	public Libro(String title, String author, int numeroPagine) {
		setTitle(title);
		setAuthor(author);
		setPagine(numeroPagine);
	}
	public Libro() {
		setTitle("Guerra e Pace");
		setAuthor("Dostojesky");
		setPagine(10000);
	
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public int getPagine() {
		return numeroPagine;
	}
	public void setTitle(String newTitle) {
		this.title = newTitle;
	}
	public void setAuthor(String newAuthor) {
		this.author = newAuthor;
	}
	public void setPagine(int numeroPagine) {
		this.numeroPagine = numeroPagine;
	}
	public String toString() {
		return "Titolo: "+title+"/nAutore: "+author+"/nPagine: "+numeroPagine;
	}
		

}
