package  amar.beginner.examples;

import java.util.*;

public class HelloWord {
    public static void main(String[] args) {
        List<Integer> someNumbers1 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            someNumbers1.add(100);
        }
        List<Integer> someNumbers2 = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            someNumbers2.add(101);
        }
        Set<Integer> someSetNumbers = new HashSet<>(someNumbers1);

        //connection to db
        //select * from Emp;
        //ResultSet; (1000)
        //iterate for loop util end of the resultset
        // one row
        // int empNo = row.getMeColumn("empNo")
        // String empNam = row.getMeColumn("empNam")
        //

//        Map<Integer, EmployeeRecord> empsFromDb = new HashMap<>();
//        EmployeeRecord empRec = new EmployeeRecord(empNo, empName);
//        empRec.setAddress(row.getColumn("Address"));
//        empsFromDb.put(empNo, empRec);

//        EmployeeRecord employeeRecord = empsFromDb.get(100);



        someSetNumbers.addAll(someNumbers2);
        System.out.println(someSetNumbers);
        System.out.println(someNumbers1);
        System.out.println(someNumbers2);
        System.out.println("Hello World asdfkjas;kfjlasjdfajsdf");
        System.out.println("Hello World asdfkjas;kfjlasjdfajsdf");
        System.out.println("Hello World asdfkjas;kfjlasjdfajsdf");
        System.out.println("Hello World asdfkjas;kfjlasjdfajsdf");
        System.out.println("Hello World asdfkjas;kfjlasjdfajsdf");
        System.out.println("Hello World asdfkjas;kfjlasjdfajsdf");
        System.out.println("Hello World asdfkjas;kfjlasjdfajsdf");
        System.out.println("Hello World asdfkjas;kfjlasjdfajsdf");
        System.out.println("Hello World asdfkjas;kfjlasjdfajsdf");
        System.out.println("Hello World asdfkjas;kfjlasjdfajsdf");
    }

    class EmployeeRecord {
        int empPk;
        String empName;
        String address;


        public EmployeeRecord(int empPk, String empName) {
            this.empPk = empPk;
            this.empName = empName;
        }

        public void setAddress(String address) {
            this.address = address;
        }
    }
}
