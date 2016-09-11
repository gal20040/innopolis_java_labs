package UI_2016.fall.ru.Assignment1.ShuntingYard;

enum Type {
    STACK("stack"),
    QUEUE("queue");

    private final String text;

    Type(final String text) {this.text = text;}

    @Override
    public String toString() {return text;}
}