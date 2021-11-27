
public class ulist {

    private Integer cid;
    private String fname;
    private String lname;
    private String user;
    private String phone;
    private String pass;

    //alt+insert key
    //generate getter & setter
    public ulist() {
    }

    public ulist(String fname, String lname, String phone, String user, String pass) {
        //this.cid = cid;

        this.fname = fname;
        this.lname = lname;
        this.phone = phone;
        this.user = user;
        this.pass = pass;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getfname() {
        return fname;
    }

    public void setfname(String fname) {
        this.fname = fname;
    }

    public String getlname() {
        return lname;
    }

    public void setlname(String lname) {
        this.lname= lname;
    }

    public String getuser() {
        return user;
    }

    public void setuser(String user) {
        this.user = user;
    }

    public String getphone() {
        return phone;
    }

    public void setphone(String phone) {
        this.phone = phone;
    }

    public String getpass() {
        return pass;
    }

    public void setpass(String pass) {
        this.pass = pass;
    }

}
