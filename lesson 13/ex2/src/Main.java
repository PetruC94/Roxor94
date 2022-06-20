public class Main {
    public static void main(String[] args) {
        Publication publication=new Publication( "The new era" );
        Publication announcement=new Announcement( "Will sell a house",30 );
        Publication article=new Article( "Why the Sun is hot","Dr James Smith" );
        Publication newspaper=new Newspaper( "footbal resul","Sport news" );
        showinfo( publication );
        showinfo( announcement );
        showinfo( article );
        showinfo( newspaper );
    }
    private static void  showinfo(Publication publication){
        System.out.println(publication.getInfo());
    }
}