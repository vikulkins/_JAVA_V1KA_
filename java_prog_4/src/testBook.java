public class testBook {
    public static void main(String[] args) {
     Book book = new Book("Fedorov", "CoolBook", 2004);
     System.out.println(book.toString());
     System.out.println("автор: " + book.getAuthorName());
     book.setAuthorName("Fomin");
     System.out.println("автор: " + book.getAuthorName());

     System.out.println("название: " + book.getBookName());
     book.setBookName("AllAboutFeduk'sLife");
     System.out.println("название: " + book.getBookName());

     System.out.println("год: " + book.getYear());
     book.setYear(2023);
     System.out.println("год: " + book.getYear());

     System.out.println(book.toString());
    }
}
