import java.util.*;

 class Room {
   String roomNumber;
   double price;
   boolean isAvailable;

    public Room(String roomNumber, double price) {
        this.roomNumber = roomNumber;
        this.price = price;
        this.isAvailable = true;
    }

    public void displayInfo();

    public boolean isAvailable() {
        return isAvailable;
    }

    public void bookRoom() {
        isAvailable = false;
    }

    public void releaseRoom() {
        isAvailable = true;
    }

    public double getPrice() {
        return price;
    }
}


class SingleRoom extends Room {
    public SingleRoom(String roomNumber, double price) {
        super(roomNumber, price);
    }

 
    public void displayInfo() {
        System.out.println("Single Room - Room Number: " + roomNumber + ", Price: $" + price + ", Available: " + isAvailable);
    }
}


class DoubleRoom extends Room {
    public DoubleRoom(String roomNumber, double price) {
        super(roomNumber, price);
    }

    public void displayInfo() {
        System.out.println("Double Room - Room Number: " + roomNumber + ", Price: $" + price + ", Available: " + isAvailable);
    }
}


class SuiteRoom extends Room {
    public SuiteRoom(String roomNumber, double price) {
        super(roomNumber, price);
    }

  
    public void displayInfo() {
        System.out.println("Suite Room - Room Number: " + roomNumber + ", Price: $" + price + ", Available: " + isAvailable);
    }
}


class Hotel {
    private List<Room> rooms;

    public Hotel() {
        rooms = new ArrayList<>();
        rooms.add(new SingleRoom("101", 100));
        rooms.add(new DoubleRoom("102", 150));
        rooms.add(new SuiteRoom("201", 250));
        rooms.add(new SingleRoom("103", 100));
        rooms.add(new DoubleRoom("104", 150));
    }

    public void displayAvailableRooms() {
        System.out.println("Available Rooms:");
        for (int i = 0; i < rooms.size(); i++) {
            Room room = rooms.get(i);
            if (room.isAvailable()) {
                room.displayInfo();
            }
        }
    }

    public void bookRoom(String roomNumber) {
        for (int i = 0; i < rooms.size(); i++) {
            Room room = rooms.get(i);
            if (room.roomNumber.equals(roomNumber) && room.isAvailable()) {
                room.bookRoom();
                System.out.println("Room " + roomNumber + " has been booked successfully.");
                return;
            }
        }
        System.out.println("Room " + roomNumber + " is not available.");
    }

    public void releaseRoom(String roomNumber) {
        for (int i = 0; i < rooms.size(); i++) {
            Room room = rooms.get(i);
            if (room.roomNumber.equals(roomNumber) && !room.isAvailable()) {
                room.releaseRoom();
                System.out.println("Room " + roomNumber + " has been released successfully.");
                return;
            }
        }
        System.out.println("Room " + roomNumber + " is not currently booked.");
    }
}


public class HotelReservationSystem {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nHotel Reservation System");
            System.out.println("1. View Available Rooms");
            System.out.println("2. Book a Room");
            System.out.println("3. Release a Room");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    hotel.displayAvailableRooms();
                    break;
                case 2:
                    System.out.print("Enter room number to book: ");
                    String bookRoomNumber = scanner.nextLine();
                    hotel.bookRoom(bookRoomNumber);
                    break;
                case 3:
                    System.out.print("Enter room number to release: ");
                    String releaseRoomNumber = scanner.nextLine();
                    hotel.releaseRoom(releaseRoomNumber);
                    break;
                case 4:
                    System.out.println("Exiting the system. Thank you!");
                    break;
                default:
                    System.out.println("Enter valid Choice,Please try again!");
                    break;
            }
        }while (choice != 4);

        scanner.close();
     }
  }
                    
