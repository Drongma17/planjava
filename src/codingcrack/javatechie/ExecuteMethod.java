package codingcrack.javatechie;


import java.util.*;
import java.util.stream.Collectors;

public class ExecuteMethod {


    public static void main(String[] args) {
        List<Employee> employees = EmployeeDataBase.getAllEmployees();


        Map<Integer, String> developmentEmployees = employees.stream()
                .filter(e -> e.getDept().equals("Development") && e.getSalary() > 80000)
                .collect(Collectors.toMap(Employee::getId, Employee::getName));
//        System.out.println(developmentEmployees);


        //map
        //distinct
        List<String> depts = employees.stream()
                .map(Employee::getDept)
                .distinct()
                .collect(Collectors.toList());
        // System.out.println(depts);


        List<Employee> ascSortedEmployees = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .collect(Collectors.toList());

        //  System.out.println(ascSortedEmployees);


        //desc
        List<Employee> descSortedEmployees = employees.stream()
                .sorted(Collections.reverseOrder(Comparator.comparing(Employee::getSalary)))
                .collect(Collectors.toList());

//        descSortedEmployees.get(0);

        //min & max
        Optional<Employee> highestPaidEmployees = employees.stream()
                .max(Comparator.comparingDouble(Employee::getSalary));

        // System.out.println("Highest paid employee : "+highestPaidEmployees);

        Optional<Employee> lowestPaidEmployees = employees.stream()
                .min(Comparator.comparingDouble(Employee::getSalary));

        //System.out.println("Lowest paid employee : "+lowestPaidEmployees);


        //Gender -> [names]
        Map<String, List<String>> employeeGroupNames = employees.stream()
                .collect(Collectors.groupingBy(Employee::getGender,
                        Collectors.mapping(Employee::getName, Collectors.toList())
                ));
        //   System.out.println(employeeGroupNames);


        Map<String, String> map = new HashMap<>();
        map.put("A", "m");
        map.put("B", "l");
        map.put("C", "l");
        map.put("D", "l");
        // Output:
        // m = [A]
        // l = [B, C, D]

        Map<String, List<String>> revertedMap = new HashMap<>();

        for (Map.Entry<String, String> entry : map.entrySet()) {
            String mapKey = entry.getKey();
            String mapValue = entry.getValue();

            revertedMap.computeIfAbsent(mapValue, k -> new ArrayList<>()).add(mapKey);

        }

        for (Map.Entry<String, List<String>> mplist : revertedMap.entrySet()) {
            System.out.println(mplist.getKey() + " + " + mplist.getValue());
        }

    }
}
