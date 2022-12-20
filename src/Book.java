import java.util.Objects;

public class Book {

    private String name;
    private final Author author;
    private int year;

    public Book(int year, String name , Author author){
        this.year = year;
        this.name = name;
        this.author = author;

    }
    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public void setYear (int year){
        this.year = year;

    }

    @Override
    public String toString() {
        return " Название книги: " + this.name  + " Автор: " + this.author + " Год публикации: " + this.year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && name.equals(book.name) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, year);
    }
}
