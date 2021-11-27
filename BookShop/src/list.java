public class list {

    private Integer cid;
    private String BNM;
    private String PID;
    private String Quan;
    private String price;
    private byte[] BookPic;

    //alt+insert key
    //generate getter & setter
    public list() {
    }

    public list(String PID, String BNM, String Quan, String price, byte[] BookPic) {
        //this.cid = cid;

        this.PID = PID;
        this.BNM = BNM;
        this.Quan = Quan;
        this.price = price;
        this.BookPic = BookPic;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getBNM() {
        return BNM;
    }

    public void setBNM(String BNM) {
        this.BNM = BNM;
    }

    public String getPID() {
        return PID;
    }

    public void setPID(String PID) {
        this.PID = PID;
    }

    public String getQuan() {
        return Quan;
    }

    public void setQuan(String Quan) {
        this.Quan = Quan;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public byte[] getBookPic() {
        return BookPic;
    }

    public void setBookPic(byte[] BookPic) {
        this.BookPic = BookPic;
    }

}
