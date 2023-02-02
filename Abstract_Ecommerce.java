package Assignment;

class Payment 
{
    private int customerId;
    public Payment(int customerId)
    {
        this.customerId = customerId;
    }

    public int getCustomerId()
    {
        return customerId;
    }

    public void setCustomerId(int customerId)
    {
        this.customerId = customerId;
    }
}

class DebitCardPayment extends Payment
{
    private static int counter = 1000;
    private String paymentId;
    private double serviceTaxPercentage;
    private double discountPercentage;

    public DebitCardPayment(int customerId)
    {
        super(customerId);
        paymentId = "D" + counter++;
    }

    public String getPaymentId() 
    {
        return paymentId;
    }

    public double payBill(double amount) 
    {
        if (amount <= 500)
        {
            serviceTaxPercentage = 0.025;
            discountPercentage = 0.01;
        }
        else if (amount > 500 && amount <= 1000)
        {
            serviceTaxPercentage = 0.04;
            discountPercentage = 0.02;
        }
        else
        {
            serviceTaxPercentage = 0.05;
            discountPercentage = 0.03;
        }
        double serviceTax = (amount * serviceTaxPercentage);
        double discount = (amount * discountPercentage);
        return (amount + serviceTax - discount);
    }
}

class CreditCardPayment extends Payment
{
    private static int counter = 1000;
    private String paymentId;
    private double serviceTaxPercentage ;

    public CreditCardPayment(int customerId)
    {
        super(customerId);
        paymentId = "C" + counter++;
    }

    public String getPaymentId()
    {
        return paymentId;
    }

    public double payBill(double amount)
    {
    	if (amount <= 500)
        {
            serviceTaxPercentage = 0.03;
            
        }
        else if (amount > 500 && amount <= 1000)
        {
            serviceTaxPercentage = 0.05;
          
        }
        else
        {
            serviceTaxPercentage = 0.06;
         
        }
        double serviceTax = (amount * serviceTaxPercentage);
        return (amount + serviceTax);
    }
}

public class Abstract_Ecommerce 
{
    public static void main(String[] args)
    {
        DebitCardPayment debitCardPayment = new DebitCardPayment(12345);
        System.out.println("Debit Card Payment ID: " + debitCardPayment.getPaymentId());
        System.out.println("Debit Card Payment Amount: " + debitCardPayment.payBill(500.0));

        CreditCardPayment creditCardPayment = new CreditCardPayment(67890);
        System.out.println("Credit Card Payment ID: " + creditCardPayment.getPaymentId());
        System.out.println("Credit Card Payment Amount: " + creditCardPayment.payBill(1000.0));
    }
}