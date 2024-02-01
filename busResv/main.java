import java.util.*;

class main {
    public static void main(String[] args) {
        try {
            ArrayList<bus> buses = new ArrayList<bus>();
            ArrayList<booking> book = new ArrayList<booking>();
            buses.add(new bus(1, true, 2));
            buses.add(new bus(2, false, 2));
            buses.add(new bus(3, true, 2));
            Scanner sc = new Scanner(System.in);
            for (bus b : buses) {
                b.displayBusInfo();
            }
            int userOpt = 1;
            while (userOpt == 1) {
                System.out.println("Enter 1 to Booking 2 to Exit");
                userOpt = sc.nextInt();
                if (userOpt == 1) {
                    booking booked = new booking();
                    if (booked.isAvailable(buses, book)) {
                        book.add(booked);
                        System.out.println("Booking is Confirmed");
                    } else {
                        System.err.println("Try Another Date ");
                    }
                }

            }
            sc.close();
        } catch (Exception e) {

        }

    }

}
