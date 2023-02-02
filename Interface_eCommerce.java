package Assignment;
class PurchaseDetails
{
    private String purchaseId;
    private String paymentType;
    private double taxPercentage;

    public PurchaseDetails(String purchaseId, String paymentType)
    {
        this.purchaseId = purchaseId;
        this.paymentType = paymentType;
    }

    public double calculateTax(double price)
    {
        if (paymentType.equals("Debit Card"))
        {
            taxPercentage = 0.02;
        }
        else if (paymentType.equals("Credit Card"))
        {
            taxPercentage = 0.03;
        }
        else
        {
        	taxPercentage= 0.04;
        }
        double taxAmount = price * taxPercentage;
        return price + taxAmount;
    }

    public String getPurchaseId()
    {
        return purchaseId;
    }

    public void setPurchaseId(String purchaseId)
    {
        this.purchaseId = purchaseId;
    }

    public String getPaymentType()
    {
        return paymentType;
    }

    public void setPaymentType(String paymentType)
    {
        this.paymentType = paymentType;
    }
}

class Seller
{
    private String location;
    private double taxPercentage;

    public Seller(String location)
    {
        this.location = location;
    }

    public double calculateTax(double price)
    {
        if (location.equals("Middle East"))
        {
            taxPercentage = 0.15;
        } else if (location.equals("Europe"))
        {
            taxPercentage = 0.25;
        }
           else if (location.equals("Canada"))
           {
                taxPercentage = 0.22;
           } 
           else
           {
            taxPercentage = 0.12;
           }
        return price * taxPercentage;
    }

    public String getLocation()
    {
        return location;
    }

    public void setLocation(String location)
    {
        this.location = location;
    }
}


public class Interface_eCommerce
{
	   public static void main(String args[])
	   { 
		   System.out.println("Purchase Details\n***************"); 
		   PurchaseDetails purchaseDetails = new PurchaseDetails("P1001","Credit Card");
		   System.out.println("Total purchase amount: " + Math.round(purchaseDetails.calculateTax(100)*100)/100.0);
		  
		   
		   
		   System.out.println("Seller Details\n***************");
		   Seller seller = new Seller("Middle East");
		   System.out.println("Tax to be paid by the seller: " + Math.round(seller.calculateTax(100)*100)/100.0);
		     
	   }

}
