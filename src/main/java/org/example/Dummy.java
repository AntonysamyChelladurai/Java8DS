package org.example;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Dummy {
    public void method1() {
        String test = "a1b2c3";
        String[] tokens = test.split("\\t");
        for (String s : tokens)
            System.out.println(s + " ");
    }

    public void method2() {
        int arr[] = new int[10];
        int i = 5;
        arr[i++] = ++i + i++;
        System.out.println(arr[5] + ":" + arr[6]);
    }

    public void reverseString() {
        String str = "quick brown fox jumps over lazy dog";
        System.out.println("Original String :: " + str);
        String revesString = Stream.of(str).map(s -> new StringBuilder(s).reverse()).collect(Collectors.toList()).toString();
        System.out.println("Reverse String :: " + revesString);
    }

    public void sumFirstDigit2() {

        int[] arr = {23, 45, 22, 67, 52, 222, 2};
        int no = 9834;
        double value = Math.log10(9834);
        System.out.println("Value :: " + value);
        System.out.println("Value :: " + Math.pow(10, value));
        System.out.println("Value :: " + (int) Math.floor(Math.pow(10, value)));
        System.out.println("Value :: " + (int) no / (int) Math.floor(Math.pow(10, value)));


        int digits = (int) (Math.log10(no));

        // Find first digit
        no = (int) (no / (int) (Math.pow(10, digits)));

        // Return first digit
        System.out.println("First digit :: " + no);
        //return n;

        System.out.println(Math.min(Double.MIN_VALUE, 0.0d));

    }

    public void removeDuplicate() {
        int[] arr = {5, 3, 2, 1, 7, 5, 4, 0, 9, 12, 3, 7, 4, 8};
        System.out.println("Remove Duplicate");
        String s1 = "coffee";
        Arrays.stream(arr).sorted().forEach(System.out::println);
        int m = Arrays.stream(arr).max().getAsInt();
        Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        Arrays.stream(s1.split("")).collect(Collectors.toSet()).forEach(e -> System.out.print("\t" + e));
        Arrays.stream(arr).boxed().collect(Collectors.toSet()).forEach(e -> System.out.print("\t" + e));
    }

    public void getEmployee() {
        Employee emp1 = new Employee("Antony1", "Computer Science", 15000);
        Employee emp2 = new Employee("Antony2", "Manager", 16000);
        Employee emp3 = new Employee("Aravind", "Account", 12000);
        Employee emp4 = new Employee("Venkat", "Manager", 28000);
        Employee emp5 = new Employee("Muthukumar", "Manager", 16000);
        Employee emp6 = new Employee("Jai", "Manager", 17000);
        Employee emp7 = new Employee("Raja", "HR", 10000);
        Employee emp8 = new Employee("Venkat", "Computer Science", 17000);
        Employee emp9 = new Employee("Sam", "Manager", 26000);
        Employee emp10 = new Employee("Antony4", "Manager", 17000);
        Employee emp11 = new Employee("Kumar", "HR", 12000);
        Employee emp12 = new Employee("Prabhakaran", "Computer Science", 28000);
        Employee emp13 = new Employee("Siva", "Computer Science", 16000);
        Employee emp14 = new Employee("Antony2", "Manager", 16000);
        Employee emp15 = new Employee("Antony4", "Manager", 28000);
        Employee emp16 = new Employee("Venkat", "Account", 12000);
        Employee emp17 = new Employee("Prabhakaran", "HR", 23000);
        Employee emp18 = new Employee("Muthukumar", "Manager", 16000);
        Employee emp19 = new Employee("Siva", "Manager", 17000);
        Employee emp20 = new Employee("Raja", "HR", 8000);
        Employee emp21 = new Employee("Venkat", "Computer Science", 15000);
        Employee emp22 = new Employee("Antony2", "Manager", 16000);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        employeeList.add(emp5);
        employeeList.add(emp6);
        employeeList.add(emp7);
        employeeList.add(emp8);
        employeeList.add(emp9);
        employeeList.add(emp10);
        employeeList.add(emp11);
        employeeList.add(emp12);
        employeeList.add(emp13);
        employeeList.add(emp14);
        employeeList.add(emp15);
        employeeList.add(emp16);
        employeeList.add(emp17);
        employeeList.add(emp18);
        employeeList.add(emp19);
        employeeList.add(emp20);
        employeeList.add(emp21);
        employeeList.add(emp22);

        Predicate<Employee> cscdep = e -> e.emp_dept.equals("Computer Science");
        Predicate<Employee> above17k = e -> e.emp_salary >= 17000;
        Function<Employee, Long> avg = e -> e.getEmp_salary();
        Predicate<Employee> combine = cscdep.and(above17k);



        employeeList.stream().mapToDouble(Employee::getEmp_salary).average();//.map((e,e1)->e*e1)

        List<Employee> sortedEmp= employeeList.stream().sorted(Comparator.comparing(Employee::getEmp_name)).collect(Collectors.toList());


        System.out.println("\n Employee Combine filter CS All Employee \n");
        employeeList.stream().filter(cscdep).forEach(System.out::println);
        //.collect(Collectors.toList()).stream().forEach(System.out::println);

        System.out.println("\n Employee Combine filter CS salary > 17000 \n");
        employeeList.stream().filter(combine).forEach(System.out::println);

        System.out.println("Maximum Salary in All Employee");
        Map<Long, List<Employee>> empmap = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getEmp_salary, Collectors.toList()));
        Set<Long> empsalary = empmap.keySet();
        Optional<Long> highsalary = empsalary.stream().max(Comparator.comparing(Long::longValue));
        List<Employee> emp = empmap.get(highsalary.get());
        emp.stream().forEach(System.out::println);
        System.out.println("Maximum Salary in Each Department");

        Map<String, Employee> grpbydep = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getEmp_dept, Collectors.collectingAndThen(
                        Collectors.maxBy(Comparator.comparingLong(Employee::getEmp_salary)), Optional::get
                )));
        grpbydep.keySet().stream().forEach(e -> System.out.println(grpbydep.get(e)));

    }

    public void mulitpleofno() {
        int[] input = {3, 1, 3, 5, 7, 3, 4, 9, 5, 4, 2};
        //Function multiplay=
        int sum = Arrays.stream(input).mapToObj(e -> e).mapToInt(Integer::intValue).sum();
        System.out.println("Sum ::" + sum);
        Arrays.stream(input).map(e1 -> e1 * e1).forEach(System.out::println);
       /* int mul=Arrays.stream(input).mapToLong((e1,e2)->e1*e2).mapToInt().
        System.out.println("Sum ::"+mul);*/
        // List a1 = a1.stream().
        OptionalInt multiple = Arrays.stream(input).reduce((a, b) -> a * b);
        System.out.println("Multiple :: " + multiple.getAsInt());
    }

    public void test(){
        List<Integer> number = Arrays.asList(2, 3, 4, 5);

        // demonstration of map method
        List<Integer> square
                = number.stream()
                .map(x -> x * x)
                .collect(Collectors.toList());
        square.stream().forEach(System.out::println);
    }
}
