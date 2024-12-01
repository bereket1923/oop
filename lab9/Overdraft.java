package oop.lab9;

//create an Exception class Called Overdraft which is a type of RuntimeException

public class Overdraft extends RuntimeException {
    public Overdraft(){
        super();
    }
    public Overdraft(String message) {// available balance less than withdrawal
        super(message);//Notifications or alerts are often sent to customers in case of overdraft events.
    }
}
