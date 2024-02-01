import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class booking {
    String passengerName;
    int busNo;
    Date date;

    booking() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Passenger Name : ");
        passengerName = sc.next();
        System.out.println("Enter Bus No : ");
        busNo = sc.nextInt();
        System.out.println("Enter Date (dd-MM-yyyy) : ");
        String dateInput = sc.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        sc.close();
        try {
            dateFormat.parse(dateInput);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    int booked = 0;

    public boolean isAvailable(ArrayList<bus> buses, ArrayList<booking> book) {
        int capacity = 0;
        for (bus b : buses) {
            if (b.getBusNo() == busNo) {
                capacity = b.getCapacity();
            }

            for (booking bb : book) {
                if (bb.busNo == busNo && bb.date.equals(date)) {
                    booked++;
                }
            }

        }

        return booked < capacity ? true : false;
    }
}
