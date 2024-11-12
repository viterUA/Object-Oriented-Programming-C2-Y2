package assessment;

import java.util.Arrays;

public class VetShop {
    private String name;
    private String address;
    private String phone;
    private String[] vets = new String[20];
    private Pet[] pets = new Pet[500];
    private Appointment[] appointments = new Appointment[2000];

    public VetShop(String name, String address, String phone) {
        setName(name);
        setAddress(address);
        setPhone(phone);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
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

    public String[] getVets() {
        return Arrays.copyOf(vets, vets.length);
    }

    public Pet[] getPets() {
        return Arrays.copyOf(pets, pets.length);
    }


    public Appointment[] getAppointments() {

        return Arrays.copyOf(appointments, appointments.length);
    }

    public void addVet(String vets) {

    }

    /*public void Pet addPet(Pet[] pets) {
        this.pets = new Pet(pets.getName(), pets.getType(),pets.getRegistrationDate(),pets.getDateOfBirth(),pets.getOwner());
    }*/

    public void addAppointment(Appointment appointment) {
        if(appointments.equals(""))
            appointments = null;
        else
            this.appointments[appointments.length-1] = appointment;
    }

   /* private String[] getBookedVets(String vets, int number) {

    }*/

    public String toString() {
        String text = "Name: " + getName() + "  Address: " + getAddress() + "  Phone: " + getPhone() + "\n\n Vets: ";

        for(int i = 0; i < getVets().length; i++)
            text += vets[i] + ", ";


        text += "\n\n Pets: ";

        for(int i = 0; i < getPets().length; i++)
            text += pets[i] + ", ";

        text += "\n\n Appointments: ";

        for(int i = 0; i < getAppointments().length; i++)
            text += appointments[i] + ", ";

        return text;
    }
}
