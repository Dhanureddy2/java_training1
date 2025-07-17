package lists;

public class UserDetails {
    String  Fname;
    String  Lname;
    String loc;

    public UserDetails(String fname, String lname, String loc) {
        Fname = fname;
        Lname = lname;
        this.loc = loc;
    }

    public String getFname() {
        return Fname;
    }

    public String getLname() {
        return Lname;
    }

    public String getLoc() {
        return loc;
    }
}
