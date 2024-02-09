package hm11_classes;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Лев", "Толстой");
        Author author2 = new Author("Александр", "Пушкин");
        Book book1 = new Book("Война и мир", author1, 1863);
        Book book2 = new Book("Дубровский", author2, 1833);
        book2.setPublicationYear(1836);
        System.out.println(book1 + "\n");
        System.out.println(book2);
    }
}