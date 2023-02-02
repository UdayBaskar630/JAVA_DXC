package DXC;
class Movie_Ticket1 {
    int movieId;
    int noOfSeats;
    double costPerTicket;

    public Movie_Ticket1(int movieId, int noOfSeats) {
        this.movieId = movieId;
        this.noOfSeats = noOfSeats;

        // set costPerTicket based on movieId
        if (movieId == 111) {
            costPerTicket = 7;
        } else if (movieId == 112) {
            costPerTicket = 8;
        } else if (movieId == 113) {
            costPerTicket = 8.5;
        } else {
            System.out.println("Invalid Ticket ID");
        }
    }

    public double calculateTotalAmount() {
        double tax = 0.02;
        double totalAmount = noOfSeats * costPerTicket;
        totalAmount += totalAmount * tax;
        return Math.round(totalAmount);
    }
}

class Movie_Ticket {
    public static void main(String[] args) {
        Movie_Ticket1 ticket1 = new Movie_Ticket1(112, 3);
        System.out.println("Total Amount: " + ticket1.calculateTotalAmount());
        

        Movie_Ticket1 ticket2 = new Movie_Ticket1(114, 3);
        System.out.println("Total Amount: " + ticket2.calculateTotalAmount());
        
        Movie_Ticket1 ticket3 = new Movie_Ticket1(113, 7);
        System.out.println("Total Amount: " + ticket3.calculateTotalAmount());
     
    }
}
