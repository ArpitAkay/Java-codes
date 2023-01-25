package org.example.sortmap;

import org.example.sortlist.Employee;

import java.util.*;

public class SortMapDemo {
    public static void main(String args[]){
        Map<Integer, String> map = new HashMap<>();
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(1, "one");
//        System.out.println(map);

        List<Map.Entry<Integer, String>> entries = new ArrayList<>(map.entrySet());
//        System.out.println(entries);
//
//        Collections.sort(entries, new Comparator<Map.Entry<Integer, String>>() {
//            @Override
//            public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
//                return o1.getValue().compareTo(o2.getValue());
//            }
//        });
//        System.out.println(entries);
//
//        entries.forEach((e) -> {
//            System.out.println(e.getKey() + " " + e.getValue());
//        });
//
//        Collections.sort(entries, (o1, o2) -> {
//            return o2.getKey() - o1.getKey();
//        });
//
//        entries.forEach((e) -> {
//            System.out.println(e.getKey() + " " + e.getValue());
//        });
//
//        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach((e) -> {
//            System.out.println(e);
//        });

//        map.entrySet().stream().sorted(Map.Entry.<Integer, String>comparingByKey().reversed()).forEach((e) -> {
//            System.out.println(e);
//        });

        Map<Employee, Integer> employeeMap = new TreeMap<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o1.getSalary() - o2.getSalary());
            }
        });
        employeeMap.put(new Employee(101, "Arpit Kumar", "IT", 550000), 1);
        employeeMap.put(new Employee(102, "Ayush Agrawal", "Civil", 560000), 2);
        employeeMap.put(new Employee(103, "Krishna Vishwakarma", "CS", 450000), 3);
        employeeMap.put(new Employee(104, "Yashraj Anand", "", 350000), 4);

        employeeMap.entrySet().stream().forEach((e) -> {
            System.out.println(e);
        });

        employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary).reversed())).forEach((e) -> {
            System.out.println(e);
        });


    }
}
