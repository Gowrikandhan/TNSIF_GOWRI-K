package airfare;
public class AirIndia implements Airfare {
    // Attributes (use wrapper types as specified)
    private Integer hours;
    private Double costPerHour;

    // Default constructor
    public AirIndia() {
        this.hours = 0;
        this.costPerHour = 0.0;
    }

    // Parameterized constructor
    public AirIndia(Integer hours, Double costPerHour) {
        this.hours = hours;
        this.costPerHour = costPerHour;
    }

    // Getters and setters
    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Double getCostPerHour() {
        return costPerHour;
    }

    public void setCostPerHour(Double costPerHour) {
        this.costPerHour = costPerHour;
    }

    // calculateAmount: hours * costPerHour
    @Override
    public Double calculateAmount() {
        if (hours == null || costPerHour == null) return 0.0;
        return hours * costPerHour;
    }

    // display prints the rounded amount (2 decimal places)
    @Override
    public void display() {
        Double amt = calculateAmount();
        System.out.println(String.format("%.2f", amt));
    }
}
