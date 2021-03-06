package UI_2016.fall.ItP.InterfaceUniverse.Classes;

import UI_2016.fall.ItP.InterfaceUniverse.Interfaces.ByTheMannerOfMoving.Walk;
import UI_2016.fall.ItP.InterfaceUniverse.Interfaces.Persons.Droid;
import UI_2016.fall.ItP.InterfaceUniverse.Interfaces.Persons.Person;

public class Droid3POSeries extends Droid implements Walk {
    private String className = "дроид серии 3PO";
    @Override
    public void demonstrateOneself() {System.out.println("Я - " + this.className + ".");}

    public Droid3POSeries(String name, String typeOfIntelligence, Person master, String famousPhrase) {
        super(name, typeOfIntelligence, master, famousPhrase);
    }
}