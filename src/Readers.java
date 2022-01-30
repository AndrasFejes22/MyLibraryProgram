import java.util.List;

public class Readers {

    private String name;
    private String id;//alphanumerical string
    private String address;
    private int age;

    public Readers(String name, String id, String address, int age) {
        super();
        this.name = name;
        this.id = id;
        this.address = address;
        this.age = age;
    }

    public Readers(String name) {
        super();
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Readers [name=" + name + ", id=" + id + ", address=" + address + ", age=" + age + "]";
    }
    /*
    @Override
    public int compareTo(Readers o) {
        // TODO Auto-generated method stub
        return 0;
    }
    */


}
