package assessment;

public class Appointment {
    private String date;
    private int hour;
    private String vet;
    private Pet pet;
    private char status;
    private static int counter = 1;

    public Appointment(String date, int hour, String vet, Pet pet) {
        setDate(date);
        setHour(hour);
        setVet(vet);
        setPet(pet);
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public String getVet() {
        return vet;
    }

    public void setVet(String vet) {
        this.vet = vet;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public char getStatus() {
        return status = 'A';
    }

    public static int getCounter() {
        return counter++;
    }

    public String toString() {
        return "Date: " + getDate() + "  Hour: " + getHour() + "  Vet: " + getVet() + "  Pet: " + getPet() + "  Status: " + getStatus();
    }
}
