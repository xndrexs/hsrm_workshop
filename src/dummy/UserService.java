package dummy;

/**
 * Kontext: Wir befinden uns in einer Service-Klasse, welche
 * Daten von einer Schnittstelle verarbeiten soll. Die Daten
 * handeln von User-Objekten.
 */

/**
 * Refactored Example
 */

import dummy.Guest;
import dummy.User;
import dummy.UserRole;

import java.util.*;

/**
 * this service is used to receive data and run various operations
 */
public class UserService {

    private static final int ANNUAL_SALARY_STUDENT = 12000;
    private static final int ANNUAL_SALARY_JUNIOR = 40000;
    private static final int ANNUAL_SALARY_SENIOR = 50000;
    private static final int ANNUAL_SALARY_ARCHITECT = 80000;

    private List<Guest> allowedGuests;
    private Map<UUID, User> users;
    private int userInteractionsCounter;
    private int authentificationTimer;

    public UserService () {
        this.users = new HashMap<>();
        this.userInteractionsCounter = 0;
    }

    public User findUser(User user) {
        triggerInteraction();
        return this.users.get(user.getUUID());
    }

    public void addUser(User user) {
        this.users.put(user.getUUID(), user);
        triggerInteraction();
    }

    public void removeAllUsers() {
        this.users.clear();
        triggerInteraction();
    }

    public void setAnnualSalary(User user) {
        switch (user.getRole()) {
            case STUDENT: {
                user.setAnnualSalary(ANNUAL_SALARY_STUDENT);
                break;
            }
            case JUNIOR: {
                user.setAnnualSalary(ANNUAL_SALARY_JUNIOR);
                break;
            }
            case SENIOR: {
                user.setAnnualSalary(ANNUAL_SALARY_SENIOR);
                break;
            }
            case ARCHITECT: {
                user.setAnnualSalary(ANNUAL_SALARY_ARCHITECT);
                break;
            }
            default: {
                user.setAnnualSalary(0);
            }
        }
        triggerInteraction();
    }

    public void addToGuestList(Guest guest) {
        this.allowedGuests.add(guest);
    }

    public void setEntryTimerForGuests(int time) {
        this.authentificationTimer = time;
    }

    private void triggerInteraction() {
        this.userInteractionsCounter++;
    }

}
