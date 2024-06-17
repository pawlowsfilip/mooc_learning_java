public class Book {
    private String name;
    private String pages;
    private String publicationYear;

    public Book(String name, String pages, String publicationYear) {
        this.name = name;
        this.pages = pages;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return this.name;
    }

    public String getPages() {
        return this.pages;
    }

    public String getPublicationYear() {
        return this.publicationYear;
    }

    public String toString(){
        return this.name + ", " + this.pages + " pages, " + this.publicationYear;
    }
}
