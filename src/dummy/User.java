package dummy;

import java.util.UUID;

public class User {
    private String name;
    private UUID id = UUID.randomUUID();
    private int annualSalary;
    private UserRole role;

    public User() {
        this.annualSalary = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getUUID() {
        return this.id;
    }

    public void setAnnualSalary(int annualSalary) {
        this.annualSalary = annualSalary;
    }

    public UserRole getRole() {
        return this.role;
    }

}
