/**
 * instance variable : title ,author ,isbn
 * static variable :totalBook 
 * instance Methods:borrowBook(),returnBook()
 * static method :getTotalBooks()
 */

class Book {
    static int totalNoOfBooks;

    String author,title,isbn;
    boolean isBorrowed;
    static{
        totalNoOfBooks=0;
    }
    
    {
        //object init

        totalNoOfBooks++;
    }
    Book(String isbn,String title,String author ){
        this.title=title;
        this.isbn=isbn;
        this.author=author;
    }
    //is book number 
    Book(String isbn){
        this(isbn, "Unknown", "Unknown");

    }
    static int getTotalNoOfBooks(){
        return totalNoOfBooks;
    }

    void borrowBook(){
        if(!isBorrowed){
            this.isBorrowed=true;
            System.out.println("Enjoy "+this.title);
        }
        else{
            System.out.println("Book is already borrowed");
        }
    }
    void returnBook(){
        if(isBorrowed){
            this.isBorrowed = false;
            System.out.println("Hope you enjoyed , Please let me know the review");
        }
        else{
            System.out.println("This book is already in the liberary");
        }

    }


    public static void main(String[] args) {
       Book  designOfThings = new Book("1","Design","Author");
       Book mBook = new Book("2");

       System.out.println(Book.getTotalNoOfBooks());

       designOfThings.borrowBook();
       mBook.borrowBook();
       designOfThings.returnBook();
       designOfThings.returnBook();
       


    }
}
