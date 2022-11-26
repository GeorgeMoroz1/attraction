public class Person {
    protected String passengerFirstName;
    protected String passengerLastName;
    protected int numberOfTickets;

    public Person(String passengerFirstName, String passengerLastName, int numberOfTickets) {
        this.passengerFirstName = passengerFirstName;
        this.passengerLastName = passengerLastName;
        this.numberOfTickets = numberOfTickets;
    }

    public String getPassengerFirstName() {
        return passengerFirstName;
    }

    public String getPassengerLastName() {
        return passengerLastName;
    }


}
