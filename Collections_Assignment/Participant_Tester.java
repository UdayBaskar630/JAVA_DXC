package Collections_Assignment;



import java.util.*;

public class Participant_Tester 
{

    public static List<Participant_Tester> generateListOfFinalists(Participant_Tester[] finalists) 
    {

      

        List<Participant_Tester> list = new ArrayList<>();

        for (Participant_Tester p : finalists)
        {
            list.add(p);
        }

        return list;
     }

    public static List<Participant_Tester> getFinalistsByTalent(List<Participant_Tester> finalists, String talent)
    {

        List<Participant_Tester> list = new ArrayList<>();

        for (Participant_Tester l : finalists){
            if (l.getParticipantTalent().equals(talent)){
               list.add(l);
            }
        }
        return list;

}

    public static void main(String[] args) 
    {
        Participant_Tester finalist1 = new Participant_Tester();
        Participant_Tester finalist2 = new Participant_Tester();
        Participant_Tester finalist3 = new Participant_Tester();
        Participant_Tester finalist4 = new Participant_Tester();

        Participant_Tester[] finalists = { finalist1, finalist2, finalist3, finalist4 };

        List<Participant_Tester> finalistsList = generateListOfFinalists(finalists);

        System.out.println("Finalists");
        for (Participant_Tester finalist : finalistsList)
            System.out.println(finalist);

        String talent = "Singing";
        System.out.println("Finalists in " + talent + " category");

        List<Participant_Tester> finalistsCategoryList = getFinalistsByTalent(finalistsList, talent);
        for (Participant_Tester finalist : finalistsCategoryList)
            System.out.println(finalist);
    }

}
