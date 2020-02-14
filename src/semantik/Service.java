package semantik;

/**
 * Kontext: Wir befinden uns in einer Service-Klasse, welche
 * Daten von einer Schnittstelle verarbeiten soll. Die Daten
 * handeln von User-Objekten.
 */

/**
 * Bad Example
 */

import dummy.Guest;
import dummy.User;
import dummy.UserRole;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * this service is used to receive data and run various operations
 */
public class Service {

    private ArrayList<Guest> list1;
    private Map<UUID, User> list;
    private int counter;
    private int timer;

    public Service () {
        this.list = new HashMap<>();
        this.counter = 0;
    }

    public User user(User user) {
        this.counter++;
        return this.list.get(user.getUUID());
    }

    public void add(User user) {
        this.counter++;
        this.list.put(user.getUUID(), user);
    }

    /**
     * removes all users from inventory
     */
    public void delete() {
        this.counter++;
        this.list.clear();
    }

    public void setSalary(User user) {
        this.counter++;
        if (user.getRole() == UserRole.STUDENT) {
            user.setAnnualSalary(12000);
        } else if (user.getRole() == UserRole.JUNIOR) {
            user.setAnnualSalary(40000);
        } else if (user.getRole() == UserRole.SENIOR) {
            user.setAnnualSalary(50000);
        } else if (user.getRole() == UserRole.ARCHITECT) {
            user.setAnnualSalary(80000);
        }
    }

    /**
     * adds a guest to be allowed to access the portal
     * @param guest
     */
    public void add1(Guest guest) {
        this.list1.add(guest);
    }

    public void timer(int time) {
        this.timer = time;
    }

}
