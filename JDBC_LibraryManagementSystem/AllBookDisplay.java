
package harsh.librarytest;


public class AllBookDisplay {
    private int isbn;
    private String name, author, publisher, issued;
    
    public AllBookDisplay(int isbn, String name, String author, String publisher, String issued)
    {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.issued = issued;
    }
    
    public int getISBN()
    {
        return isbn;
    }
    public String getName()
    {
        return name;
    }
    public String getAuthor()
    {
        return author;
    }
    public String getPublisher()
    {
        return publisher;
    }
    public String getIssued()
    {
        return issued;
    }
}