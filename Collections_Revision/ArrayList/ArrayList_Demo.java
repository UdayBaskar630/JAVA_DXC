
package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Demo {

	public static void main(String[] args)
	{
		List <String> food = new ArrayList<String>();
		food.add("Idly");
		food.add("Dosa");
		food.add("Upma");
		food.add("Puri");
		food.add(3,"Pongal");
		
		System.out.println("Food Items in the Menu are:"+food);

	}

}
