package org.example;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Hello world!
 *
 */
public class Reduce
{
    public static void main( String[] args ) {
        List<Integer> numbers = Stream.of(3, 7, 8, 1, 5, 9).collect(Collectors.toList());

        int sum = 0;
        for(int num : numbers){
            sum += num;
        }
        System.out.println(sum);

        int addition = numbers.stream().mapToInt((i) -> {
            return i;
        }).sum();
        System.out.println(addition);

        int addition2 = numbers.stream().reduce(0, (a, b) -> {
            return a + b;
        });
        System.out.println(addition2);

        Optional<Integer> addition3 = numbers.stream().reduce((a, b) -> {
            return a + b;
        });
        System.out.println(addition3.get());

        int max = numbers.stream().reduce(0, (a, b) -> {
            return a > b ? a : b;
        });
        System.out.println(max);

        int max1 = numbers.stream().reduce(0, Integer::max);
        System.out.println(max1);

        List<String> words = List.of("Core Java", "Spring Boot", "Spring");
        System.out.println(words);

        Optional<String> longestWord = words.stream().reduce((str1, str2) -> {
            return str1.length() > str2.length() ? str1 : str2;
        });
        System.out.println(longestWord.get());

        double avgSalary = getAverageofSalaryOfGradeAEmployees();
        System.out.println(avgSalary);
    }

    public static Double getAverageofSalaryOfGradeAEmployees(){
        List<Employee> employees = EmployeeDatabase.getAllEmployees();

        double avgSalary = employees.stream().filter((e) -> {
            return e.getGrade().equalsIgnoreCase("A");
        }).map((e) -> {
            return e.getSalary();
        }).mapToDouble((i) -> {
            return i;
        }).average().getAsDouble();

        System.out.println(avgSalary);

        return avgSalary;
    }
}
