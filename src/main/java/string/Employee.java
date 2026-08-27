package string;

import java.util.Date;

public final class Employee {

    // Private Final Field
    private final int id;
    private final Date joiningDate;

    // Parameterized Constructor
    public Employee(int id, Date joiningDate) {
        this.id = id;
        this.joiningDate = new Date(joiningDate.getTime());
    }

    // Getter + No Setter
    public int getId() {
        return id;
    }
    public Date getJoiningDate() {
        return new Date(joiningDate.getTime());
    }
}
