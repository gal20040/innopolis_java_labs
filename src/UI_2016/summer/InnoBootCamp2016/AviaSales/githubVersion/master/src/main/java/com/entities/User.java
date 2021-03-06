//package com.entities;
//
//import java.util.ArrayList;
//
////import com.db.Database;
//
//public class User {
//
//    private String login;
//    private String password;
//    private String firstName;
//    private String lastName;
//    private ArrayList<Flight> tickets;
//    private String passport;
//
//    public User() {
//
//    }
//
//    public User(String login, String password) {
//        this.login = login;
//        this.password = password;
//    }
//
//    public User(String login, String password, String firstName, String lastName, String passport) {
//        this.login = login;
//        this.password = password;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.passport = passport;
//    }
//
//    public boolean buyTicket(Flight flight) {
//        // После покупки билетов надо обновлять список билетов
//        return false;
//    }
//
//    public String getLogin() {
//        return login;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public ArrayList<Flight> getTickets() {
//        return tickets;
//    }
//
//    public String getPassport() {
//        return passport;
//    }
//
//    public void setLogin(String login) {
//        this.login = login;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public void setTickets(ArrayList<Flight> tickets) {
//        this.tickets = tickets;
//    }
//
//    public void setPassport(String passport) {
//        this.passport = passport;
//    }
//}