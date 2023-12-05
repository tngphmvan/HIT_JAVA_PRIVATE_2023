package buoi7_btvn;

public abstract class Person implements Displayable{

    private int id;
    private String name;
    private static int nextID = 0;

    public Person() {
    }

    
    public Person(String name) {
        this.id = ++nextID;
        this.name = name;
    }

    public int getId() {
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

    @Override
    public abstract void displayInfor();
}
