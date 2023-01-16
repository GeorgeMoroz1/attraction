package main.java;

import java.util.*;

public class Main {
    public static List<Person> generateClients() {
        List<Person> passengers = new LinkedList<>();
        passengers.add(new Person("Екатерина", "Великая", 5));
        passengers.add(new Person("Юрий", "Морозов", 3));
        passengers.add(new Person("Владимир", "Ульянов-Ленин", 4));
        passengers.add(new Person("Козьма", "Прутков", 6));
        passengers.add(new Person("Эраст", "Фандорин", 3));
        return passengers;
    }

    public static void main(String[] args) {
        Queue<Person> passengersQueue = new LinkedList<>(generateClients());

        while (!passengersQueue.isEmpty()) {
            Person person = passengersQueue.poll();
            if (person.numberOfTickets > 0) {
                person.numberOfTickets = person.numberOfTickets - 1;
                System.out.println(person.getPassengerFirstName() + " " + person.getPassengerLastName() + " покатался/лась, осталось " + person.numberOfTickets + " билетов");
                passengersQueue.add(person);
            }
        }
    }
}


