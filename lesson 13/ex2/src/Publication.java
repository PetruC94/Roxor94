public class Publication {
    private String title;

    public Publication(String title) {
        this.title = title;
    }

    public final String getInfo() {
        return getType() + getDetails() + ": " + getTitle();
    }

    public String getType() {
        return getClass().getSimpleName();
    }

    public String getDetails() {
        return "";
    }

    public String getTitle() {
        return title;
    }
}