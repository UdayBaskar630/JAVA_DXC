package LinkedList;

import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;

class LinkedList_Concatenate
{
    public static List<Object> concatenateLists(List<Object> listOne, List<Object> listTwo) 
    
    {
        
        LinkedList<Object> concatenatedList = new LinkedList<Object>();

       
        concatenatedList.addAll(listOne);

        
        Iterator<Object> it = ((LinkedList<Object>) listTwo).descendingIterator();
        while (it.hasNext())
        {
            concatenatedList.add(it.next());
        }

        return concatenatedList;
    }

    public static void main(String args[])
    {
        List<Object> listOne = new LinkedList<Object>();
        listOne.add("Hello");
        listOne.add(102);
        listOne.add(25);
        listOne.add(38.5);

        List<Object> listTwo = new LinkedList<Object>();
        listTwo.add(150);
        listTwo.add(200);
        listTwo.add('A');
        listTwo.add("Welcome");

        List<Object> concatenatedList = concatenateLists(listOne, listTwo);

        System.out.println("Concatenated linked list:");
        for (Object value : concatenatedList)
        {
            System.out.print(value + " ");
        }
    }
}
