package services;

public class ProgrammingCourse extends Service {

    private boolean isFullTime;
    private String languages;
    private String startingDate;

    public ProgrammingCourse(String name, double price, boolean isFullTime, String languages, String startingDate) {
        super(name, price);
        this.isFullTime = isFullTime;
        this.languages = languages;
        this.startingDate = startingDate;
    }
}
