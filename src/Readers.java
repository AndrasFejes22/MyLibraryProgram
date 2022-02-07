import java.util.List;

public class Readers {

    private String name;
    private String id;//alphanumerical string
    private String address;
    private int age;
    private int lateFee;
    private int loanedBooks;


    public Readers(String name, String id, String address, int age) {
        super();
        this.name = name;
        this.id = id;
        this.address = address;
        this.age = age;
        lateFee = 0;
        loanedBooks = 0;
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
        char chr = 0;
        int cnt = 0;
        for (int i = 0; i < name.length(); i++) {
            if (!(Character.isLetter(name.charAt(i))) && !(Character.isWhitespace(name.charAt(i)))) {
                cnt++;
                //System.out.println(name.charAt(i));
                chr = name.charAt(i);
            }
        }
        //System.out.println("cnt:" + cnt);
        if(cnt == 0){
            this.name = name;
            System.out.println("The name has been changed to " + name);
        }else {
            System.out.println("Incorrect name! There is a '"+ chr + "' in the name. The name has not been changed!");
        }
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

    public int getLateFee() {
        return lateFee;
    }

    public void setLateFee(int lateFee) {
        this.lateFee = lateFee;
    }

    public int getLoanedBooks() {
        return loanedBooks;
    }

    public void setLoanedBooks(int loanedBooks) {
        this.loanedBooks = loanedBooks;
    }

    @Override
    public String toString() {
        return "Reader: " +'\n' +
                "name = " + name + ", " +'\n'+
                "id = " + id + ", " +'\n'+
                "address = " + address + ", " +'\n'+
                "age = " + age + ", " +'\n'+
                "lateFee = " + lateFee +", " +'\n'+
                "loanedBooks = " + loanedBooks ;
    }
    /*
    @Override
    public int compareTo(Readers o) {
        // TODO Auto-generated method stub
        return 0;
    }
    */


}
