package Assignment;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_Web_Address
{
	
	public static boolean checkWebAddressValidity(String webAddress)
	{
	  String pattern = "^(https?://)(www\\.)?[a-zA-Z0-9]+\\.[a-zA-Z]{2,3}$";
	  Pattern p = Pattern.compile(pattern);
	  Matcher m = p.matcher(webAddress);
	  return m.matches();
	}
	
	public static void main(String[] args)
	{
	  String webAddress1 = "http://www.company.com";
	  System.out.println("The web address is " + (checkWebAddressValidity(webAddress1) ? "valid!" : "invalid!"));
	  String webAddress2 = "https://company.in";
	  System.out.println("The web address is " + (checkWebAddressValidity(webAddress2) ? "valid!" : "invalid!"));
	}
}