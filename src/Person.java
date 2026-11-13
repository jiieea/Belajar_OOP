public class Person {
    public String name;// kosong

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String newName) { // params pijar
        this.name = newName; // update attr name; pijar
    }

    public void printName() {
        System.out.println(name);
    }
}