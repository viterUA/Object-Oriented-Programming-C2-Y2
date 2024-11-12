package assessment;

public class Owner {
    private String name;
    private String address;
    private String phone;

    public Owner(String name, String address, String phone) {
        setName(name);
        setAddress(address);
        setPhone(phone);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null)
            this.name = "No name specified";
        else
            this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String toString() {
        return "Name: " + getName() + "  Address: " + getAddress() + "  Phone: " + getPhone();
    }
}
