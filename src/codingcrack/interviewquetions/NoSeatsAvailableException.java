package codingcrack.interviewquetions;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

// Custom Exception for No Seats Available
class NoSeatsAvailableException extends Exception {
    public NoSeatsAvailableException(String message) {
        super(message);
    }
}

// Flight Class
class Flight {
    private String id;
    private String origin;
    private String destination;
    private LocalDate departureDate;
    private int availableSeats;
    private final ReentrantLock lock = new ReentrantLock(); // For thread-safety

    public Flight(String id, String origin, String destination, LocalDate departureDate, int availableSeats) {
        this.id = id;
        this.origin = origin;
        this.destination = destination;
        this.departureDate = departureDate;
        this.availableSeats = availableSeats;
    }

    public String getId() {
        return id;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    /**
     * Reserves a seat on the flight.
     *
     * @return true if the seat was reserved successfully, false otherwise.
     * @throws NoSeatsAvailableException if no seats are available.
     */
    public void reserveSeat() throws NoSeatsAvailableException {
        lock.lock(); // Acquire the lock for thread-safety
        try {
            if (availableSeats > 0) {
                availableSeats--;
                System.out.println(Thread.currentThread().getName() + " reserved a seat on Flight " + id + ". Remaining seats: " + availableSeats);
            } else {
                throw new NoSeatsAvailableException("No seats available on Flight " + id);
            }
        } finally {
            lock.unlock(); // Release the lock
        }
    }

    @Override
    public String toString() {
        return "Flight{" +
               "id='" + id + '\'' +
               ", origin='" + origin + '\'' +
               ", destination='" + destination + '\'' +
               ", departureDate=" + departureDate +
               ", availableSeats=" + availableSeats +
               '}';
    }
}

// Reservation System Class
class ReservationSystem {
    private List<Flight> flights;

    public ReservationSystem() {
        this.flights = new ArrayList<>();
    }

    public void addFlight(Flight flight) {
        this.flights.add(flight);
    }

    /**
     * Searches for flights based on origin and destination.
     *
     * @param origin The origin city.
     * @param destination The destination city.
     * @return A list of flights matching the criteria.
     */
    public List<Flight> searchFlights(String origin, String destination) {
        List<Flight> foundFlights = new ArrayList<>();
        for (Flight flight : flights) {
            if (flight.getOrigin().equalsIgnoreCase(origin) && flight.getDestination().equalsIgnoreCase(destination)) {
                foundFlights.add(flight);
            }
        }
        return foundFlights;
    }

    public static void main(String[] args) {
        ReservationSystem system = new ReservationSystem();

        // Add some flights
        system.addFlight(new Flight("FL001", "New York", "Los Angeles", LocalDate.of(2025, 7, 10), 5));
        system.addFlight(new Flight("FL002", "Chicago", "Miami", LocalDate.of(2025, 7, 12), 2));
        system.addFlight(new Flight("FL003", "New York", "Los Angeles", LocalDate.of(2025, 7, 15), 1));
        system.addFlight(new Flight("FL004", "San Francisco", "Seattle", LocalDate.of(2025, 7, 10), 0)); // No seats

        System.out.println("--- Searching Flights ---");
        List<Flight> nyToLaFlights = system.searchFlights("New York", "Los Angeles");
        if (nyToLaFlights.isEmpty()) {
            System.out.println("No flights found from New York to Los Angeles.");
        } else {
            System.out.println("Flights from New York to Los Angeles:");
            nyToLaFlights.forEach(System.out::println);
        }

        List<Flight> chicagoToDallas = system.searchFlights("Chicago", "Dallas");
        if (chicagoToDallas.isEmpty()) {
            System.out.println("\nNo flights found from Chicago to Dallas.");
        }

        System.out.println("\n--- Reserving Seats (Single Thread) ---");
        Flight flightToReserve = nyToLaFlights.get(0); // FL001
        try {
            System.out.println("Attempting to reserve seat on " + flightToReserve.getId());
            flightToReserve.reserveSeat();
            System.out.println("Successfully reserved a seat.");
        } catch (NoSeatsAvailableException e) {
            System.err.println("Reservation failed: " + e.getMessage());
        }

        System.out.println("\n--- Reserving Seats (Multi-Threaded Test) ---");
        Flight popularFlight = system.searchFlights("New York", "Los Angeles").get(1); // FL003, 1 seat
        System.out.println("Flight " + popularFlight.getId() + " has " + popularFlight.getAvailableSeats() + " seats.");

        Runnable reservationTask = () -> {
            try {
                popularFlight.reserveSeat();
            } catch (NoSeatsAvailableException e) {
                System.err.println(Thread.currentThread().getName() + " failed to reserve seat: " + e.getMessage());
            }
        };

        Thread t1 = new Thread(reservationTask, "Passenger 1");
        Thread t2 = new Thread(reservationTask, "Passenger 2");
        Thread t3 = new Thread(reservationTask, "Passenger 3");

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\n--- Checking flight with no seats ---");
        Flight noSeatsFlight = system.searchFlights("San Francisco", "Seattle").get(0); // FL004, 0 seats
        try {
            System.out.println("Attempting to reserve seat on " + noSeatsFlight.getId());
            noSeatsFlight.reserveSeat();
        } catch (NoSeatsAvailableException e) {
            System.err.println("Reservation failed (as expected): " + e.getMessage());
        }

        System.out.println("\nFinal state of flights:");
        system.flights.forEach(System.out::println);
    }
}