package Java.interview;

import Java.annotationprocessiong.Person;

import java.util.*;
import java.util.stream.Collectors;

public class Globant {
    public static void main(String[] args) {
        Integer ar[] = {5,6,7,8,7,9,5,5}; //o/p - {7,5}

        ArrayList<Integer> ar1 = new ArrayList<>();

        List<Integer> ar2 = Arrays.stream(ar).
                collect(Collectors.groupingBy(x -> x)).
                entrySet().stream().filter(x -> x.getValue().
                        size() > 1).map(Map.Entry::getKey).toList();
        System.out.println(ar2);

        final ArrayList<Integer> ar3 = new ArrayList<>();
        ar3.add(29);
        List<Person> people = new ArrayList<>();
        // Add some people to the list

        // Sort the list by age using Comparator
        //people.sort(Comparator.comparingInt(Person::getAge));

        // Display the sorted list
        people.forEach(System.out::println);
        //ar3 = new ArrayList<>();

        try{
            int a = 5/0;
            System.exit(200);
        }catch(Exception e){
            System.out.println("hi");
        }
        finally{
            System.out.println("hello");
        }
    }


}
