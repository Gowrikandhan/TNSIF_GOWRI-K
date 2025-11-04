package airfare;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read inputs according to problem statement
        // First line: choice (1 - AirIndia, 2 - KingFisher, 3 - Indigo)
        // Second line: hours
        // Third line: costPerHour

        if (!sc.hasNextInt()) {
            sc.close();
            return;
        }
        int choice = sc.nextInt();

        // Read hours (expect integer)
        Integer hours = null;
        if (sc.hasNextInt()) {
            hours = sc.nextInt();
        } else {
            // If next token isn't int, try parse double then cast (defensive)
            try {
                hours = (int) Double.parseDouble(sc.next());
            } catch (Exception e) {
                hours = 0;
            }
        }

        // Read costPerHour (can be integer or double)
        Double costPerHour = 0.0;
        if (sc.hasNextDouble()) {
            costPerHour = sc.nextDouble();
        } else if (sc.hasNext()) {
            try {
                costPerHour = Double.parseDouble(sc.next());
            } catch (Exception e) {
                costPerHour = 0.0;
            }
        }

        sc.close();

        Airfare ticket = null;

        switch (choice) {
            case 1:
                ticket = new AirIndia(hours, costPerHour);
                break;
            case 2:
                ticket = new KingFisher(hours, costPerHour);
                break;
            case 3:
                ticket = new Indigo(hours, costPerHour);
                break;
            default:
                // invalid choice: do nothing or print 0.00
                System.out.println(String.format("%.2f", 0.0));
                return;
        }

        // Use display to print rounded 2-decimal output
        ticket.display();
    }
}
