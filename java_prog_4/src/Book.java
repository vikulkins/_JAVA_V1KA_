public class Book {
    public String authorName;
    public String bookName;
    public int year;
    public Book(String authorName, String bookName, int year){
        this.authorName = authorName;
        this.bookName = bookName;
        this.year = year;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return "книга: " + this.bookName + " автор: " + this.authorName + " год: " + this.year ;
    }
}
