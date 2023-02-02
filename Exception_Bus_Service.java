package Assignment;

class InvalidDestinationException extends Exception
{
    
	private static final long serialVersionUID = 1L;

	public InvalidDestinationException(String message) {
        super(message);
    }
}

class InvalidTripPackageException extends Exception
{
  
	private static final long serialVersionUID = 1L;

	public InvalidTripPackageException(String message) {
        super(message);
    }
}

class InvalidCouponCodeException extends Exception 
{
   
	private static final long serialVersionUID = 1L;

	public InvalidCouponCodeException(String message) {
        super(message);
    }
}

class BusBooking
{
    private int bookingId;
    private String destination;
    private String tripPackage;
    private int totalAmount;

    public BusBooking(int bookingId, String destination, String tripPackage)
    {
        this.bookingId = bookingId;
        this.destination = destination;
        this.tripPackage = tripPackage;
        this.totalAmount = 0;
    }

    public boolean validateCouponCode(String couponCode, int numberOfMembers) throws InvalidCouponCodeException
    {
       
        if (((couponCode == "BIGBUS") &&(numberOfMembers <= 10)) && ((couponCode == "MAGICBUS") &&(numberOfMembers <= 15)))
        {
        	return true;
        	
        }
        else 
        {
        	throw new InvalidCouponCodeException("Invalid coupon code");
        }
        
    }

    public String bookTrip(String couponCode, int numberOfMembers) throws InvalidDestinationException, InvalidTripPackageException, InvalidCouponCodeException 
    {
      
        String[] validDestinations = {"Washington DC", "Philadelphia", "Orlando", "Boston", "Atlanta"};
        boolean isDestinationValid = false;
        for (String dest : validDestinations)
        {
            if (destination.equals(dest))
            {
                isDestinationValid = true;
                break;
            }
        }
        if (!isDestinationValid)
        {
            throw new InvalidDestinationException("Invalid destination");
        }

        
        if (!tripPackage.equals("Regular") && !tripPackage.equals("Premium"))
        {
            throw new InvalidTripPackageException("Invalid package");
        }

        
        boolean isCouponCodeValid = validateCouponCode(couponCode, numberOfMembers);
        if (!isCouponCodeValid)
        {
            throw new InvalidCouponCodeException("Invalid coupon code");
        }

       
        if (tripPackage.equals("Regular"))
        {
            totalAmount = 500 * numberOfMembers;
        } 
        else if (tripPackage.equals("Premium"))
        {
            totalAmount = 800 * numberOfMembers;
        }

        return "Booking successful";
    }

    public int getBookingId()
    {
        return bookingId;
    }

    public void setBookingId(int bookingId)
    {
        this.bookingId = bookingId;
    }

    public String getDestination()
    {
        return destination;
    }

    public void setDestination(String destination)
    {
        this.destination = destination;
    }

    public String getTripPackage() 
    {
        return tripPackage;
    }

    public void setTripPackage(String tripPackage)
    {
        this.tripPackage = tripPackage;
    }

    public int getTotalAmount()
    {
        return totalAmount;
    }
}

public class Exception_Bus_Service 
{
    public static void main(String[] args)
    {
        BusBooking busBooking = new BusBooking(101, "Orlando", "Regular");
        
        try
        {
            String result = busBooking.bookTrip("BIGBUS", 1);
            System.out.println(result);
        } 
        catch (InvalidDestinationException | InvalidTripPackageException | InvalidCouponCodeException e) {
            System.out.println(e.getMessage());
        }
    }
}


