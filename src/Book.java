public class Book{

    private final String title;
    private final String author;
    private final Short year;
    private final Short pages;

    public Book(String title, String author, Short year, Short pages){
        this.author = author;
        this.title = title;
        this.year = year;
        this.pages = pages;
    }

    public short getYear(){
        return year;
    }

    public short getPages(){
        return pages;
    }

    @Override
    public String toString(){
        return title + author + ", " + year + ". - " + pages + "p.";
    }


}
