import java.util.*;

public class EmployeeMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name:");
        String name = sc.nextLine();
        System.out.println("Enter Address:");
        String address = sc.nextLine();
        System.out.println("Enter Mobile:");
        String mobile = sc.nextLine();
        Employee e = new Employee(name, address, mobile);
        System.out.print("Employee Details:\n" + "Name: " + e.getName() + "\nAddress: " + e.getAddress() + "\nMobile: "
                + e.getMobile());
    }
}

class Employee {
    private String name;
    private String address;
    private String mobile;

    Employee(String name, String address, String mobile) {
        this.name = name;
        this.address = address;
        this.mobile = mobile;
    }

    String getName() {
        return name;
    }

    String getAddress() {
        return address;
    }

    String getMobile() {
        return mobile;
    }
}
