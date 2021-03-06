package UI_2016.fall.ItP.UniversityInformationSystem.enums;

public enum CoreElective {
    CORE("Core"),
    ELECTIVE("Elective");

    private final String text;

    CoreElective(final String text) {this.text = text;}

    @Override
    public String toString() {return text;}
}