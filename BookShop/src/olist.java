
public class olist {
   
    private String pidF;
    private String phoneF;
    private String quantityF;
    private String ynameF;
    private String addressF;
    
    
        public olist() {
    }

    public olist(String ynameF, String phoneF, String pidF, String quantityF, String addressF) {
        //this.cid = cid;

        this.pidF = pidF;
        this.phoneF = phoneF;
        this.quantityF = quantityF;
        this.ynameF = ynameF;
        this.addressF = addressF;
    }
 //right button click & generate getter setter
    
    public String getPidF() {
        return pidF;
    }

    public void setPidF(String pidF) {
        this.pidF = pidF;
    }

    public String getPhoneF() {
        return phoneF;
    }

    public void setPhoneF(String phoneF) {
        this.phoneF = phoneF;
    }

    public String getQuantityF() {
        return quantityF;
    }

    public void setQuantityF(String quantityF) {
        this.quantityF = quantityF;
    }

    public String getYnameF() {
        return ynameF;
    }

    public void setYnameF(String ynameF) {
        this.ynameF = ynameF;
    }

    public String getAddressF() {
        return addressF;
    }

    public void setAddressF(String addressF) {
        this.addressF = addressF;
    }

    
}
