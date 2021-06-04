import java.util.*;

public class CompanyMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the company name: ");
        String companyName = sc.next();
        System.out.println("Enter the employees");
        String employees = sc.next();
        // emp String array for employees
        String[] emp = employees.split(",");
        System.out.println("Enter TeamLead");
        String teamLead = sc.next();
        Company c = new Company(companyName, employees, teamLead);
        if (c.getTeamLead() != null)
            System.out.println(
                    "Name: " + c.getName() + "\nEmployees: " + c.getEmployees() + "\nLead: " + c.getTeamLead());
        else
            System.out.println("Invalid Input");
    }
}

class Company {
    private String name;
    private String employees;
    private String teamlead;

    Company(String name, String employees, String teamlead) {
        this.name = name;
        this.employees = employees;
        this.teamlead = teamlead;
    }

    public String getName() {
        return name;
    }

    public String getEmployees() {
        return employees;
    }

    public String getTeamLead() {
        if (teamlead.equals("Thomas"))
            return teamlead;
        else
            return null;
    }
}
