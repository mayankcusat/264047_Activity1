import java.util.*;

public class EmployeeMain5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee5 emp = new Employee5();
        System.out.println("Enter the name");
        String name = sc.next();
        System.out.println("Enter Address");
        String address = sc.next();
        System.out.println("Enter Mobile");
        String mobile = sc.next();
        emp.setName(name);
        emp.setAddress(address);
        emp.setMobile(mobile);
        System.out.println("Employee Details\nName: " + emp.getName() + "\nAddress: " + emp.getAddress() + "\nMobile: "
                + emp.getMobile());
        int choice;

        do {
            System.out.println(
                    "Verify and Update the details:\nMenu\n1. Update Employee name\n2. Update Employee address\n3. Update Employee mobile\n4. All information correct/Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Current name is: " + emp.getName());
                    System.out.println("Enter the name: ");
                    name = sc.next();
                    emp.setName(name);
                    break;
                case 2:
                    System.out.println("Current address is: " + emp.getAddress());
                    System.out.println("Enter the address: ");
                    address = sc.next();
                    emp.setAddress(address);
                    break;
                case 3:
                    System.out.println("Current address is: " + emp.getMobile());
                    System.out.println("Enter the mobile: ");
                    mobile = sc.next();
                    emp.setMobile(mobile);
                    break;
                case 4:
                    System.out.println("The details are: \nName: " + emp.getName() + "\nAddress: " + emp.getAddress()
                            + "\nMobile: " + emp.getMobile());
                    break;
                default:
                    System.out.println("Invalid Input");
            }
        } while (choice != 4);
    }
}

class Employee5 {
    private String name;
    private String address;
    private String mobile;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}