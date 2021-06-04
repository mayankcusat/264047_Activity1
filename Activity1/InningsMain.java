import java.util.*;

public class InningsMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the team name:");
        String teamname = sc.nextLine();
        System.out.println("Enter session:");
        String inningsname = sc.nextLine();
        System.out.println("Enetr runs:");
        int runs = sc.nextInt();
        Innings i = new Innings(teamname, inningsname, runs);
        i.displayInningsDetails(teamname, inningsname, runs);
    }
}

class Innings {
    private String teamname;
    private String inningsname;
    private int runs;

    Innings(String teamname, String inningsname, int runs) {
        this.teamname = teamname;
        this.inningsname = inningsname;
        this.runs = runs;
    }

    String getTeamname() {
        return teamname;
    }

    String getInningsname() {
        return inningsname;
    }

    int getRuns() {
        return runs;
    }

    void displayInningsDetails(String teamname, String inningsname, int runs) {
        if (inningsname.equals("First")) {
            System.out.println("Name: " + getTeamname());
            System.out.println("Scored: " + runs);
            runs++;
            System.out.println("Need" + runs + "to win");
        } else {
            System.out.println("Name: " + getTeamname());
            System.out.println("Scored: " + runs);
            System.out.println("Match Ended");
        }
    }
}