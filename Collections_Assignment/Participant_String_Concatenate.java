package Collections_Assignment;



public class Participant_String_Concatenate 
{

    private String participantName;
    private String participantTalent;
    private double participantScore;

    public Participant_String_Concatenate(String participantName, String participantTalent, double participantScore)
    {
        this.participantName = participantName;
        this.participantTalent = participantTalent;
        this.participantScore = participantScore;
    }

    public String getParticipantName()
    {
        return participantName;
    }

    public void setParticipantName(String participantName) 
    {
        this.participantName = participantName;
    }

    public String getParticipantTalent()
    {
        return participantTalent;
    }

    public void setParticipantTalent(String participantTalent) 
    {
        this.participantTalent = participantTalent;
    }

    public double getParticipantScore()
    {
        return participantScore;
    }

    public void setParticipantScore(double participantScore)
    {
        this.participantScore = participantScore;
    }

    @Override
    public String toString()
    {
        return "Participant Name: "+getParticipantName()+", Participant Talent: "+getParticipantTalent()+", Participant Score: "+getParticipantScore();
    }

}

