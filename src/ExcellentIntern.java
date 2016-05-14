public class ExcellentIntern
{
    private final boolean ALWAYSONTIME;
    private final boolean TEAMPLAYER;
    private final boolean HARDWORKING;
    private final boolean QUICKLEARNER;

    public ExcellentIntern()
    {
        ALWAYSONTIME = true;
        TEAMPLAYER = true;
        HARDWORKING = true;
        QUICKLEARNER = true;
    }

    public boolean getAlwaysOnTime()
    {
        return ALWAYSONTIME;
    }

    public boolean getTeamPlayer()
    {
        return TEAMPLAYER;
    }

    public boolean getHardWorking()
    {
        return HARDWORKING;
    }

    public boolean getQuickLearner()
    {
        return QUICKLEARNER;
    }

    public String toString()
    {
        return String.valueOf("\nAlways on Time: " + ALWAYSONTIME +
                              "\nTeam Player: " + TEAMPLAYER +
                              "\nHard Working: " + HARDWORKING +
                              "\nQuick Learner: " + QUICKLEARNER);
    }
}
