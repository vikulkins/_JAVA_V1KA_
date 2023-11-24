public class TestAuthor {
    public static void main(String[] args){
        Author author = new Author("Mike", "mike1982@gmail.com",'m');
        System.out.println("имя: "+author.getName());
        System.out.println("почта: "+author.getEmail());
        author.setEmail("wazowskiii007@mirea.ru");
        System.out.print(author);
    }
}
