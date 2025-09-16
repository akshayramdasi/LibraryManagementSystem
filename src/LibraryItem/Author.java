package LibraryItem;

public class Author {
    private String authorName;
    private String biography;

    public Author(String authorName, String biography) {
        this.authorName = authorName;
        this.biography = biography;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }


}
