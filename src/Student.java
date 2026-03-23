import java.util.List;

public class Student{

    private final String name;
    private final List<Book> books;

    public Student(String name, List<Book> books){
        if (books.size() < 5) {
            throw new IllegalArgumentException("Each student has at least 5 books!");
        }

        this.name = name;
        this.books = books;
    }

    public List<Book> getBooks(){
        return books;
    }

    @Override
    public String toString(){
        return "Student: " + name +
                "\nBooks:" + books;
    }
}
