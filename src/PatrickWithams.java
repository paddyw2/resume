public class PatrickWithams extends ExcellentIntern
{
    private String name;
    private String email;
    private String cell;
    private String bio;
    private String experience;

    public PatrickWithams()
    {
        super();
        name = "Patrick Withams";
        email = "pwithams@gmail.com";
        cell = "587-830-1321"; 
        bio = "I'm a current computer science student at the University of Calgary. I have extensive knowledge of Java, Python, Bash, HTML, CSS, JavaScript. I'm equally at home using Vim, Tmux, and the command line, or in front of a GUI IDE, such as Eclipse or Intellij. I have basic knowledge in C, C++, and Ruby, and I'm always looking to learn more!";
        experience = "Prior to studying computer science formally, I worked as a web developer and graphic designer at various companies. I also have another degree in Philosphy and English Literature.";
    }

    public String getName()
    {
        return name;
    }

    public String getEmail()
    {
        return email;
    }

    public String getCell()
    {
        return cell;
    }

    public String getBio()
    {
        return bio;
    }

    public String getExperience()
    {
        return experience;
    }

    public String getNiceToHaves()
    {
        return super.toString();
    }

    public String toString()
    {
        return String.valueOf("Name: " + name +
                              "Email: " + email +
                              "Cell: " + cell +
                              "Bio: " + bio +
                              "Experience: " + experience +
                              "Nice to Haves: " + getNiceToHaves());
    }
}

