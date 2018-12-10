package sda.training.linkedListHash;

public class Patient {
    public String Name;
    public String Pesel;

    public String toHumanReadableString() {
        return "{ " + Name + ", " + Pesel + "}";
    }
}
