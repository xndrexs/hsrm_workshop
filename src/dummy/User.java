package dummy;

import java.util.UUID;

public class User {
    private String name;
    private UUID id = UUID.randomUUID();
    private int salary;
    private UserRole role;

    public User() {
        this.salary = 2500;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getUUID() {
        return this.id;
    }

    public void setSalary(int startValue) {
        this.salary = startValue;
    }

    public UserRole getRole() {
        return this.role;
    }

}
