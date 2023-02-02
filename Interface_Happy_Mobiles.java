package Assignment;

class Mobile
{
    private String name;
    private String brand;
    String operatingSystemName;
    String operatingSystemVersion;

    public Mobile(String name, String brand, String operatingSystemName, String operatingSystemVersion)
    {
        this.name = name;
        this.brand = brand;
        this.operatingSystemName = operatingSystemName;
        this.operatingSystemVersion = operatingSystemVersion;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getBrand() 
    {
        return brand;
    }

    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public String getOperatingSystemName()
    {
        return operatingSystemName;
    }

    public void setOperatingSystemName(String operatingSystemName) 
    {
        this.operatingSystemName = operatingSystemName;
    }

    public String getOperatingSystemVersion() 
    {
        return operatingSystemVersion;
    }

    public void setOperatingSystemVersion(String operatingSystemVersion)
    {
        this.operatingSystemVersion = operatingSystemVersion;
    }
}

class SmartPhone extends Mobile
{
    private String networkGeneration;

    public SmartPhone(String name, String brand, String operatingSystemName, String operatingSystemVersion,
                      String networkGeneration) 
    {
        super(name, brand, operatingSystemName, operatingSystemVersion);
        this.networkGeneration = networkGeneration;
    }

    public String getNetworkGeneration()
    {
        return networkGeneration;
    }

    public void setNetworkGeneration(String networkGeneration)
    {
        this.networkGeneration = networkGeneration;
    }

    public boolean testCompatibility() 
    {
        if (operatingSystemName.equals("Saturn"))
        {
            if (networkGeneration.equals("3G"))
            {
                return operatingSystemVersion.equals("1.1") || operatingSystemVersion.equals("1.2") || operatingSystemVersion.equals("1.3");
            }
            else if (networkGeneration.equals("4G"))
            {
                return operatingSystemVersion.equals("1.2") || operatingSystemVersion.equals("1.3");
            }
            else if (networkGeneration.equals("5G"))
            {
                return operatingSystemVersion.equals("1.3");
            }
        }
        else if (operatingSystemName.equals("Gara"))
        {
            if (networkGeneration.equals("3G"))
            {
                return operatingSystemVersion.equals("EXRT.1") || operatingSystemVersion.equals("EXRT.2") || operatingSystemVersion.equals("EXRT.3");
            } 
            else if (networkGeneration.equals("4G"))
            {
                return operatingSystemVersion.equals("EXRT.2") || operatingSystemVersion.equals("EXRU.1");
            }
            else if (networkGeneration.equals("5G"))
            {
                return operatingSystemVersion.equals("EXRU.1");
            }
        }

        return false;
    }
}
class Interface_Happy_Mobiles 
{

	public static void main(String[] args)
	{
		
		SmartPhone phone1 = new SmartPhone("KrillinM20", "Nebula", "Saturn", "1.3", "5G");
		SmartPhone phone2 = new SmartPhone("FriezaA8", "Quasar", "Gara", "EXRU.1", "3G");
	    System.out.println("Compatibility of First Mobile : " + phone1.testCompatibility());
	    System.out.println("Compatibility of Second Mobile " + phone2.testCompatibility());

	}

}
