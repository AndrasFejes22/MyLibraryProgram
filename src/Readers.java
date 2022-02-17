import java.util.regex.Pattern;

public class Readers {

    private String name;
    private String id;//alphanumerical string
    private String city;
    private int age;
    private String lateFee;
    private String loanedBooks;


    public Readers(String name, String id, String city, int age) {
        super();
        this.name = name;
        this.id = id;
        this.city = city;
        this.age = age;
        lateFee = "0";
        loanedBooks = "0";
    }

    public Readers(){}

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

    public String getCity() {
        return city;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        /*
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
        */

        String pattern ="^(?=.{3,21}$)[A-Z][a-zA-Z\\.]+([\\s]{1,2}[a-zA-Z]+){1,3}"; //^Matches the beginning of the input. //works:="^(?=.{3,17}$)[a-zA-Z]+([\\s][a-zA-Z]+)*";
        //String pattern ="^(?=.{3,17}$)[a-zA-Z]+([\\s][a-zA-Z]+)*"; //^Matches the beginning of the input. //works:="^(?=.{3,17}$)[a-zA-Z]+([\\s][a-zA-Z]+)*";
        //[A-Z] first letter must be capital
        //Letter, dot. and spaces are allowed
        //positive lookahead:^(?=.{1,21}$) number of characters: nin 3, max 21
        //[\s]{1,2} double space is allowed
        //$	Matches the end of the input
        //[a-zA-Z]+ length of blocks
        //([\s]{1,2}[a-zA-Z]+){3} number of blocks with space, only 3 spaces are allowed
        //* Matches previous element zero or more times.
        if(Pattern.matches(pattern, name)){
            this.name = name;
            System.out.println("The name has been changed to " + name);
        }else {
            System.out.println("Incorrect name! The name has not been changed!");
        }
    }

    public void setId(String id) {
        String pattern ="^[a-zA-Z0-9]{6}$"; //pl VMX4AH :)
        if(Pattern.matches(pattern, id)){
            this.id = id;
            System.out.println("The ID has been changed to " + id);
        }else {
            System.out.println("Incorrect ID! The ID has not been changed!");
        }

    }

    public void setCity(String city) {
        String pattern ="[A-Z][a-z]*";
        if(Pattern.matches(pattern, city)){
            this.city = city;
            System.out.println("The city has been changed to " + city);
        }else {
            System.out.println("Incorrect city! The city has not been changed!");
        }
    }

    public void setAge(int age) {//

        System.out.println("stringValue: "+String.valueOf(age));
        String pattern ="^[1-9][0-9]*$";
        if(Pattern.matches(pattern, String.valueOf(age))){
            this.age = age;
            System.out.println("The age has been changed to " + age);
        }else {
            System.out.println("Incorrect age! The age has not been changed!");
        }
    }

    public String getLateFee() {
        return lateFee;
    }

    public void setLateFee(String lateFee) {//this.lateFee = lateFee;
        String pattern ="^[1-9][0-9]*$";
        if(Pattern.matches(pattern, String.valueOf(lateFee))){
            this.lateFee = lateFee;
            System.out.println("The lateFee has been changed to " + lateFee);
        }else {
            System.out.println("Incorrect lateFee! The age has not been changed!");
        }
    }

    public String getLoanedBooks() {
        return loanedBooks;
    }

    public void setLoanedBooks(String loanedBooks) {//this.loanedBooks = loanedBooks;
        String pattern ="^[0-9]{1}$";
        if(Pattern.matches(pattern, String.valueOf(loanedBooks))){
            this.loanedBooks = loanedBooks;
            System.out.println("The loanedBooks has been changed to " + loanedBooks);
        }else {
            System.out.println("Incorrect loanedBooks! The loanedBooks has not been changed!");
        }
    }

    @Override
    public String toString() {
        return "Reader: " +'\n' +
                "name = " + name + ", " +'\n'+
                "id = " + id + ", " +'\n'+
                "address = " + city + ", " +'\n'+
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
