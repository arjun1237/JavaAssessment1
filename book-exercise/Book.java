/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private int borrowed;
    private String refNumber;
    private int pages;
    private String author;
    private String title;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber="";
    }
    
    // Accessor for Author name.
    public String getAuthor()
    {
        return author;
    }
    
    // Accessor for book Title.
    public String getTitle()
    {
        return title;
    }
    
    // Accessor for no. of Pages.
    public int getPages()
    {
        return pages;
    }
    
    // Printing Author name.
    public void printAuthor()
    {
        System.out.println("Author: "+author);
    }
    
    // Printing Title of the book.
    public void printTitle()
    {
        System.out.println("Title: "+title);
    }
    
    // Mutator/Getter for Reference Number of the book, takes value only if there are atleast 3 characters, else prints Error message.
     public void setRefNumber(String ref)
    {
        if(ref.length()>=3){
             refNumber = ref;
        }
        else{
            System.out.println("Error: The reference number must be more than 3 characters in length");
        }
    }
    
    // Accessor for Reference Number of the book.
    public String getRefNumber()
    {
        return refNumber;
    }
    
    // Increments no. of times you borrow, each time its invoked.
    public void borrow()
    {
        borrowed++;        
    }
    
    // Accessor for no. of times book borrowed.
    public int getBorrowed()
    {
        return borrowed;
    }
    
    // Prints entire details of the book borrowed/to be borrowed.
    public void printDetails()
    {
        System.out.println("##############################");
        System.out.println("#  Author: "+author);
        System.out.println("#  Title: "+title);
        System.out.println("#  Pages: "+pages);
        if(refNumber.length()!=0){
            System.out.println("#  Reference Number: "+refNumber);
        }
        else{
            refNumber="ZZZ";
            System.out.println("#  Reference Number: "+refNumber);
        }
        System.out.println("#  No. of Times Borrowed: "+borrowed);
        System.out.println("##############################\n");
    }
    
    
}
