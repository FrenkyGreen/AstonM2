import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class StudentReader {

    public static List<Student> readStudents(String file) throws IOException {

        List<String> lines = Files.readAllLines(Path.of(file));
        List<Student> students = new ArrayList<>();

        String name = null;
        List<Book> books = new ArrayList<>();

        for (String line : lines) {
            if (line.isBlank()) {
                students.add(new Student(name, books));
                books = new ArrayList<>();
                name = null;
                continue;
            }

            if (name == null) {
                name = line.replace(";", "");
            } else {
                String[] parts = line.replace(";", "").split(",");

                books.add(new Book(
                        parts[0],
                        parts[1],
                        Short.parseShort(parts[2]),
                        Short.parseShort(parts[3])
                ));
            }
        }

        if (name != null && !books.isEmpty()) {
            students.add(new Student(name, books));
        }

        return students;
    }
}