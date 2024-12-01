package oop.lab7;
import java.util.Comparator;

public class AccountComparator implements Comparator<Account> {

    @Override
    public int compare(Account a1, Account a2) {
        // Compare by balance
        int result1 = Double.compare(a1.getBalance(), a2.getBalance());
        if (result1 != 0) {
            return result1;
        }
        // Compare by name
        int result2 = a1.getName().compareTo(a2.getName());
        if (result2 != 0) {
            return result2;
        }
        // Compare by open date
        int result3 = a1.getOpenDate().compareTo(a2.getOpenDate());
        return result3;
    }
}
