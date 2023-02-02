package Assignment;

class Applicant
{
    private String name;
    private String jobProfile;
    private int age;
 
    public Applicant(String name, String jobProfile, int age)
    {
        this.name = name;
        this.jobProfile = jobProfile;
        this.age = age;
    }
 
    public String getName()
    {
        return name;
    }
 
    public String getJobProfile() 
    {
        return jobProfile;
    }
 
    public int getAge()
    {
        return age;
    }
}
 
class InvalidNameException extends Exception
{
    
	private static final long serialVersionUID = 1L;

	public InvalidNameException(String message)
    {
        super(message);
    }
}
 
class InvalidJobProfileException extends Exception
{
   
	private static final long serialVersionUID = 1L;

	public InvalidJobProfileException(String message)
    {
        super(message);
    }
}
 
class InvalidAgeException extends Exception
{
    
	private static final long serialVersionUID = 1L;

	public InvalidAgeException(String message)
    {
        super(message);
    }
}
 
class Validator
{
    public boolean validateName(String name)
    {
        return name != null && !name.isEmpty();
    }
 
    public boolean validateJobProfile(String jobProfile)
    {
        return jobProfile != " " && (jobProfile.equalsIgnoreCase("Associate") || 
               jobProfile.equalsIgnoreCase("Clerk") || 
               jobProfile.equalsIgnoreCase("Executive") || 
               jobProfile.equalsIgnoreCase("Officer"));
    }
 
    public boolean validateAge(int age)
    {
        return age >= 18 && age <= 30;
    }
 
    public void validate(Applicant applicant) throws InvalidNameException, InvalidJobProfileException, InvalidAgeException 
    {
        if (!validateName(applicant.getName()))
        {
            throw new InvalidNameException("Name cannot be null or empty");
        }
        if (!validateJobProfile(applicant.getJobProfile())) 
        {
            throw new InvalidJobProfileException("Invalid job profile");
        }
        if (!validateAge(applicant.getAge()))
        {
            throw new InvalidAgeException("Age must be between 18 and 30");
        }
    }
}
 
public class Exception_Bank_Exam 
{
    public static void main(String[] args)
    {
        Applicant applicant1 = new Applicant("Jenny", "Clerk", 25);
        Applicant applicant2 = new Applicant(null, "Clerk", 27);
        Applicant applicant3 = new Applicant("Jenny", "Assistant", 25);
        Applicant applicant4 = new Applicant("Jenny", "Clerk", 31);
        Validator validator = new Validator();
       
        //For Applicant one with all valid Details
        try 
        {
            validator.validate(applicant1);
            System.out.println("Application submitted successfully!");
            System.out.println("         ");
        } 
        catch (InvalidNameException | InvalidJobProfileException | InvalidAgeException e)
        {
            System.out.println(e.getMessage());
            System.out.println("         ");
        }
        
      //For Applicant Two with null name 
        try 
        {
            validator.validate(applicant2);
            System.out.println("Application submitted successfully!");
            System.out.println("         ");
        } 
        catch (InvalidNameException | InvalidJobProfileException | InvalidAgeException e)
        {
            System.out.println(e.getMessage());
            System.out.println("         ");
        }
        
        //For Applicant three with Invalid Job Role
        try 
        {
            validator.validate(applicant3);
            System.out.println("Application submitted successfully!");
            System.out.println("         ");
        } 
        catch (InvalidNameException | InvalidJobProfileException | InvalidAgeException e)
        {
            System.out.println(e.getMessage());
            System.out.println("         ");
        }
        
        
        //For Applicant four with Invalid Age
        try 
        {
            validator.validate(applicant4);
            System.out.println("Application submitted successfully!");
            System.out.println("         ");
        } 
        catch (InvalidNameException | InvalidJobProfileException | InvalidAgeException e)
        {
            System.out.println(e.getMessage());
            System.out.println("         ");
        }
    }
}