import java.awt.print.Book;
import java.util.*;
import java.util.stream.Collectors;

public class BookHandler {

    // Books actualbook;

    public static void loan(Readers reader, Books actualBook) {
        if(reader.getLateFee() >= 120 || reader.getLoanedBooks() >=5){
            System.out.println("Loan is forbidden because of late fee or loan limit");
        }else
        if (actualBook.getAvailable() == false) {
            System.out.println("The book '" + actualBook.getTitle() + "' has already loaned!");

        }
         else if (actualBook.getAvailable() == true) {
            actualBook.setAvailable(false);
            reader.setLoanedBooks(reader.getLoanedBooks()+1);
            System.out.println("The book '" + actualBook.getTitle() + "' loaned by " + reader.getName() +".");

        }
    }

    public static void bringBack(Readers reader, Books actualBook) {

        if (actualBook.getAvailable() == true) {
            System.out.println("The book '" + actualBook.getTitle() +  "' has not loaned!");
        }
        if (actualBook.getAvailable() == false) {
            actualBook.setAvailable(true);
        }

    }

    public static boolean containsAuthors(String s, Books actualBook) {

        return actualBook.getAuthor().contains(s);
    }

    public static boolean containsTitle(String s, Books actualBook) {

        return actualBook.getTitle().contains(s);
    }

    public static List<Books> foundBooks(String search, List<Books> booklist) {

        List<Books> finding = booklist.stream()
                .filter(a -> a.getTitle().toLowerCase().contains(search)
                        || a.getAuthor().toLowerCase().contains(search))
                .collect(() -> new ArrayList<>(), // supplier - kezdőérték & közbenső értékek
                        (a, b) -> a.add(b), // akkumulátor
                        (c, d) -> c.addAll(d));
        System.out.println("Books with the word '" + search + "'" +"("+ finding.size() + " pieces):");
        System.out.println();
        finding.stream().forEach(a -> System.out.print(a + "\n"));
        //System.out.println("Nulladik könyv: "+finding.get(0));
        return finding;

    }

    public static boolean addBooks2(String title, String author, int pages, int edition, boolean available,List<Books> MyList) {

        Books temporary = new Books(title, author, pages, edition, available);
        return MyList.add(temporary);

    }

    public static boolean addBooks1(Books actualBook, List<Books> MyList2) {

        return MyList2.add(actualBook);
    }


    public static void printingBooklist(List<Books> booklist) {
        System.out.println("booklist:");
        booklist.stream().forEach(a -> System.out.print(a + "\n"));
    }


    public static List<Books> foundBooks2(int search, List<Books> booklist) {

        List<Books> finding = booklist.stream().filter(a -> a.getEdition() == (search)).collect(
                () -> new ArrayList<>(), // supplier - kezdőérték & közbenső értékek
                (a, b) -> a.add(b), // akkumulátor
                (c, d) -> c.addAll(d));
        System.out.println("A(z)" + search + " évjáratú könyvek listája:" + "("+ finding.size() + " darab):");
        System.out.println("List of books in the " + search + "'s edition " + "("+finding.size() + " pieces):");
        System.out.println();
        finding.stream().forEach(a -> System.out.print(a + "\n"));
        finding.size();
        finding.get(0);

        return finding;


    }

    public static List<Books> sortedByPages(List<Books> booklist){

        System.out.println("booklist size :" + booklist.size());

        SortedMap<Integer, SortedSet<String>> sortedMapByPage = booklist.stream()
                .collect(Collectors.groupingBy(book -> book.getPages(), () -> new TreeMap<>(),
                        Collectors.mapping(book -> book.getTitle(), Collectors.toCollection(TreeSet::new))));

        // TreeMap::new = a Map értékei is rendezett halmazok

        sortedMapByPage.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
        return booklist;

    }

    public static List<Books> sortedByTitle(List<Books> booklist){

        System.out.println("booklist size :" + booklist.size());

        SortedMap<String, SortedSet<String>> sortedMapByPage = booklist.stream()
                .collect(Collectors.groupingBy(book -> book.getTitle(), () -> new TreeMap<>(),
                        Collectors.mapping(book -> book.getAuthor(), Collectors.toCollection(TreeSet::new))));

        // TreeMap::new = a Map értékei is rendezett halmazok

        sortedMapByPage.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
        return booklist;

    }

    public static List<Books> sortedByAuthor(List<Books> booklist){

        System.out.println("booklist size :" + booklist.size());

        SortedMap<String, SortedSet<String>> sortedMapByPage = booklist.stream()
                .collect(Collectors.groupingBy(book -> book.getAuthor(), () -> new TreeMap<>(),
                        Collectors.mapping(book -> book.getTitle(), Collectors.toCollection(TreeSet::new))));

        // TreeMap::new = a Map értékei is rendezett halmazok

        sortedMapByPage.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
        return booklist;

    }

    public static List<Books> sortedByEdition(List<Books> booklist){

        System.out.println("booklist size :" + booklist.size());

        SortedMap<Integer, SortedSet<String>> sortedMapByPage = booklist.stream()
                .collect(Collectors.groupingBy(book -> book.getEdition(), () -> new TreeMap<>(),
                        Collectors.mapping(book -> book.getTitle(), Collectors.toCollection(TreeSet::new))));

        // TreeMap::new = a Map értékei is rendezett halmazok

        sortedMapByPage.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
        return booklist;

    }

    public static List<Books> avaiableBooks(List<Books> booklist){

        System.out.println("Avaiable books (" + booklist.stream().filter(book -> book.getAvailable()).count() + "item(s)):");

        booklist.stream().filter(book -> book.getAvailable()).forEach(a -> System.out.print(a + "\n"));

        return booklist;
    }

    public static List<Books> NonAvaiableBooks(List<Books> booklist){

        System.out.println("Not avaiable books (" + booklist.stream().filter(book -> !book.getAvailable()).count() + "item(s)):");

        booklist.stream().filter(book -> !book.getAvailable()).forEach(a -> System.out.print(a + "\n"));

        return booklist;
    }

    public static List<Books> bookLists(List<Books> booklist, String filter){

        switch (filter) {
            case "pages":
                System.out.println("Sorted by " + filter + ":\n");
                sortedByPages(booklist);
                break;

            case "title":
                System.out.println("Sorted by " + filter + ":\n");
                sortedByTitle(booklist);
                break;

            case "author":
                System.out.println("Sorted by " + filter + ":\n");
                sortedByAuthor(booklist);
                break;

            case "edition":
                System.out.println("Sorted by " + filter + ":\n");
                sortedByEdition(booklist);
                break;

        }
        return booklist;


    }

    public static void deleteBook(List<Books> booklist, Books book){
        booklist.remove(book);
        System.out.println(book + " deleted.");
    }
}
