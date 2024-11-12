package assessment;

public class Pet {
    private static int count = 10000;
    private int id;
    private String name;
    private String type;
    private String registrationDate;
    private String dateOfBirth;
    private Owner owner;


    public Pet(String name, String type, String registrationDate, String dateOfBirth, Owner owner) {
        setName(name);
        setType(type);
        setRegistrationDate(registrationDate);
        setDateOfBirth(dateOfBirth);
        setOwner(owner);
        idCount();
        setId(count);
    }

    private static void idCount() {
        count++;
    }

    private int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = new Owner(owner.getName(), owner.getAddress(),owner.getPhone());
    }
     public String toString() {
        return "ID: " + getId() + "  Name: " + getName() + "  Type: " + getType() + "  Registration Date: " + getRegistrationDate() + "  Date of Birth: " + getDateOfBirth() + "\nOwner Details: " + getOwner();
     }
}

