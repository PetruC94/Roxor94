public class Article extends Publication {
    private String author;
    public Article(String title, String author) {
        super(title);
        this.author = author;
    }
// write your code here
    public String getType(){
        return "Article";
    }
    public String getDetails(){
        return "(author-"+author+")";
    }
}