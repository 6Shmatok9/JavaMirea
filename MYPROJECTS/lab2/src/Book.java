public class Book {
    private String author;
    private String title;
    private int pages;
    private int year;
    public Book (String a, String t, int p, int y) {
        author = a;
        title = t;
        pages = p;
        year = y;
    }
    public Book (String a,String t, int y) {
        author = a;
        title = t;
        pages = 100;
        year = y;
    }
    public Book (int p) {
        author = "Name1";
        title = "Title1";
        pages = p;
        year = 1984;
    }
    public Book (int p, int y) {
        author = "Name2";
        title = "Title 2";
        pages = p;
        year = y;
    }
    public Book (String a, String t) {
        author = a;
        title = t;
        pages = 599;
        year = 1975;
    }
    public Book () {
        author = "Name4";
        title = "Title3";
        pages = 100;
        year = 1812;
    }
    public void setAuthor (String author) {
        this.author = author;
    }
    public void setTitle (String title) {
        this.title = title;
    }
    public void setPages (int pages) {
        this.pages = pages;
    }
    public void setYear (int year) { this.year = year; }
    public String getAuthor () {
        return author;
    }
    public String getTitle () {
        return title;
    }
    public int getPages() {
        return pages;
    }
    public int getYear() {
        return year;
    }
    public int MinutesToRead() {
        if (pages%2 == 0) {
            return pages / 2;
        }
        else {
            return pages / 2 + 1;
        }
    }
    public String toString () {
        return "Книгу " + this.title + " (" + this.year + "г.) автора "  + this.author + ", объёмом " + this.pages
                + " страниц, можно прочесть за " + this.MinutesToRead() + " минут";
    }
}
