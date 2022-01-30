import java.util.*;
import java.util.stream.Collectors;

public class ReadersHandler {

    public static void addReaders(Readers reader, List<Readers> readersRoster) {

        readersRoster.add(reader);
        System.out.println(reader.getName() +" added to the list.");
    }

    public static List<Readers> sortedByYear(List<Readers> Mylist) {

        SortedMap<Integer, Set<String>> sortedMapByYear = Mylist.stream()
                .collect(Collectors.groupingBy(person -> person.getAge(), TreeMap::new,
                        Collectors.mapping(person -> person.getName(),
                                Collectors.toSet())));

        sortedMapByYear.entrySet().forEach(entry -> System.out.println(entry.getKey()
                + " -> " + entry.getValue()));
        return Mylist;
    }


    public static List<Readers> sortedByID(List<Readers> Mylist) {

        SortedMap<Integer, SortedSet<String>> sortedMapByYearAndName = Mylist.stream()
                .collect(Collectors.groupingBy(person -> person.getAge(), () -> new TreeMap<>(),
                        Collectors.mapping(person -> person.getId(), Collectors.toCollection(TreeSet::new))));

        // TreeMap::new = a Map értékei is rendezett halmazok

        sortedMapByYearAndName.entrySet()
                .forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
        return Mylist;
    }

    public static List<Readers> sortedByName(List<Readers> Mylist) {

        Map<String, Set<Integer>> sortedMapByName = Mylist.stream().
                //SortedMap<Integer, SortedSet<String>> sortedMapByName =
                        collect(Collectors.groupingBy(person ->
                                person.getName(), TreeMap::new, // mapFactory: rendezett map-be // gyűjtjük
                        //az elemeket, ami // biztosítja a kulcsok // sorrendjét
                        Collectors.mapping(person -> person.getAge(), Collectors.toSet())));

        sortedMapByName.entrySet().forEach(entry -> System.out.println(entry.getKey()
                + " -> " + entry.getValue()));
        return Mylist;

    }
}
