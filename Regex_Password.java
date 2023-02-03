package Assignment;
public class Regex_Password
{

    public static boolean checkPasswordValidity(String password) 
    {
        String pattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%&*_]).{8,20}";
        return password.matches(pattern);
    }

    public static void main(String[] args)
    {
        String password1 = "P@s@W0rd";
        String password2 = "Password";
        System.out.println("The password1 is " + (checkPasswordValidity(password1) ? "valid!" : "invalid!"));
        System.out.println("The password2 is " + (checkPasswordValidity(password2) ? "valid!" : "invalid!"));
    }
}