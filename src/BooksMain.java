import java.awt.print.Book;
import java.util.*;
import java.util.stream.Collectors;

public class BooksMain {

    public static void main(String[] args) {

        //initialize readers:

        Readers reader1 = new Readers("Kiss Jenő", "VMX4AH", "Aba", 89);
        Readers reader11 = new Readers("Kiss Jenő", "VMX4AH", "Aba", 70);
        Readers reader2 = new Readers("Kiss Julía", "ert56z", "Budapest", 56);
        Readers reader3 = new Readers("Varga Jenő", "Lk89oo", "Szeged", 44);
        Readers reader4 = new Readers("Kovács Vali", "KL9IOP", "Miskolc", 22);
        Readers reader5 = new Readers("Szántó Pista", "6zuiK8", "Tata", 18);
        Readers reader6 = new Readers("Polák Béla", "RT56vv", "Göd", 41);
        Readers reader7 = new Readers("Úzon Zsuzsa", "VP998I", "Budaörs", 40);
        Readers reader8 = new Readers("Edelman György", "U43SDH", "Orfű", 33);
        Readers reader9 = new Readers("Péntek Tamás", "léy490", "Siófok", 66);
        Readers reader10 = new Readers("Nagy Ágnes", "ABC123", "Pécs", 56);
        Readers reader12 = new Readers("John Doe", "klo123", "Szarvas", 52);

        //initialize list of readers:

        List<Readers> readersList = new ArrayList<>();

        readersList.add(reader1);
        readersList.add(reader2);
        readersList.add(reader3);
        readersList.add(reader4);
        readersList.add(reader5);
        readersList.add(reader6);
        readersList.add(reader7);
        readersList.add(reader8);
        readersList.add(reader9);
        readersList.add(reader10);
        readersList.add(reader11);
        readersList.add(reader12);



        System.out.println("Reader's list sorted by year:");
        System.out.println();
        ReadersHandler.sortedByYear(readersList);

        System.out.println();

        System.out.println("Reader's list sorted by ID");
        System.out.println();
        ReadersHandler.sortedByID(readersList);

        System.out.println();

        System.out.println("Reader'slist sorted by Name:");
        System.out.println();
        ReadersHandler.sortedByName(readersList);



        //initialize Books objects:

        Books book1 = new Books("A Time for Mercy", "John Grisham", 100, 1987, true);
        Books book2 = new Books("The Duke and I", "Julia Quinn", 200, 1987, true);
        Books book22 = new Books("The Duke and I", "Julia Quinn", 200, 1983, true);
        Books book3 = new Books("The Russian", "James Patterson", 200, 1956, true);
        Books book4 = new Books("The Four Winds", "Kristin Hannah", 200, 1988, true);
        Books book5 = new Books("Life After Death", "Sister Souljah", 200, 1977, true);
        Books book6 = new Books("Life After Death", "Sister Souljah", 300, 1997, true);
        Books book666 = new Books("Life After Death", "Bruce Dickinson", 300, 1997, true);
        Books book7 = new Books("A Gambling Man", "David Baldacci", 200, 1967, true);
        Books book8 = new Books("Sooley", "John Grisham ", 890, 2000, true);
        Books book9 = new Books("The President's Daughter", "Laura Dave ", 400, 2010, true);
        Books book10 = new Books("The Paper Palace", "Laura Dave" , 250, 1980, true);
        Books book11= new Books("Gas turbines", "Fülöp Zoltán", 200, 1978, true);
        Books book12= new Books("gasurbines 2", "Fülöp Zoltán", 245, 1986, true);

        System.out.println();
        System.out.println("loan method:");
        BookHandler.loan(reader1, book1);

        System.out.println();
        System.out.println("bring back method:");
        BookHandler.bringBack(reader12, book11);
        System.out.println();

        //initialize lists of books

        List<Books> booklist_A = new ArrayList<>();

        System.out.println();
        BookHandler.addBooks1(book1, booklist_A);
        BookHandler.addBooks1(book2, booklist_A);
        BookHandler.addBooks1(book22, booklist_A);
        BookHandler.addBooks1(book3, booklist_A);
        BookHandler.addBooks1(book4, booklist_A);
        BookHandler.addBooks1(book5, booklist_A);
        BookHandler.addBooks1(book6, booklist_A);
        BookHandler.addBooks1(book666, booklist_A);
        BookHandler.addBooks1(book7, booklist_A);
        BookHandler.addBooks1(book8, booklist_A);
        BookHandler.addBooks1(book10, booklist_A);
        BookHandler.addBooks1(book11, booklist_A);
        BookHandler.addBooks1(book12, booklist_A);
        BookHandler.addBooks1(book9, booklist_A);
        BookHandler.addBooks1(book2, booklist_A);


        System.out.println();
        System.out.println("loan method again:");
        BookHandler.loan(reader9, book1);
        System.out.println();

        System.out.println("add readers method:");
        ReadersHandler.addReaders(reader12, readersList);
        System.out.println();

        //sorted booklists, sorted by, edition, pages, title, and author:
        System.out.println("sorted booklists, sorted by, edition, pages, title, and author:");
        System.out.println();
        BookHandler.bookLists(booklist_A, "edition");
        System.out.println();

        BookHandler.bookLists(booklist_A, "pages");
        System.out.println();

        BookHandler.bookLists(booklist_A, "title");
        System.out.println();


        BookHandler.bookLists(booklist_A, "author");
        System.out.println();

        //some loan methods again
        System.out.println("some loan methods again:");
        System.out.println();
        BookHandler.loan(reader9, book2);
        BookHandler.loan(reader9, book3);
        System.out.println();
        //another sort methods: avaiableBooks, and NonAvaiableBooks:
        System.out.println("another sort methods: avaiableBooks, and NonAvaiableBooks:");
        System.out.println();
        BookHandler.avaiableBooks(booklist_A);
        System.out.println();
        BookHandler.NonAvaiableBooks(booklist_A);
        System.out.println();

        //another add methods:
        BookHandler.addBooks2("Birdy", "William Wharton", 300, 1979, true, booklist_A);
        System.out.println();
        BookHandler.addBooks2("A másvalami", "Bogdányi Titanilla", 200, 1987, true, booklist_A);//így viszont hogy hívok rá book1.kivesz(reader1);-t? :-)
        System.out.println();
        //foundBook methods, found by word (in title or author), and by edition:
        System.out.println("foundBooks method (with te word 'gas')");
        System.out.println();
        BookHandler.foundBooks("gas", booklist_A);
        System.out.println();
        System.out.println("foundBooks method (with edition: 1987)");
        System.out.println();
        BookHandler.foundBooks2(1987, booklist_A);
        System.out.println();
        
        System.out.println("delete method");
        BookHandler.deleteBook(booklist_A, book12);
        System.out.println();
        //printing booklist:

        System.out.println("printing booklist:");

        BookHandler.printingBooklist(booklist_A);
        System.out.println();
        System.out.println("Könyvek száma/számláló/: " + Books.szamlalo);
        //System.out.println("Könyvek száma/sorszám/: " + Books.sorszam);
        System.out.println("Könyvek száma/counter/: " + Books.counter);


    }
}
