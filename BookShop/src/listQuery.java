
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class listQuery {

    public boolean insertList(list cont) {
        boolean BookIsAdd = true;
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;

        try {
            ps = con.prepareStatement("INSERT INTO `addbook`( `ProductID`,`BookName`, `Price`, `Quantity`, `Pic`) VALUES (?,?,?,?,?)");
            // ps.setInt(1, cont.getCid());
            ps.setString(1, cont.getPID());
            ps.setString(2, cont.getBNM());
            ps.setString(3, cont.getPrice());
            ps.setString(4, cont.getQuan());
            ps.setBytes(5, cont.getBookPic());
            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "New Book Add");
                BookIsAdd = true;
            } else {
                JOptionPane.showMessageDialog(null, "Failed to Add");
                BookIsAdd = false;
            }

        } catch (SQLException ex) {
            Logger.getLogger(listQuery.class.getName()).log(Level.SEVERE, null, ex);
        }

        return BookIsAdd;
    }

    public void updateList(list cont, boolean withimage) {

        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        String updatequery = "";
        if (withimage == true) { //if user want to change the image
            updatequery = "UPDATE `addbook` SET `BookName`= ?,`Price`= ?,`Quantity`= ?,`Pic`= ? WHERE (`ProductID`= ?)";

            try {
                ps = con.prepareStatement(updatequery);

                //  ps.setString(1, cont.getPID());
                ps.setString(1, cont.getBNM());
                ps.setString(2, cont.getPrice());
                ps.setString(3, cont.getQuan());
                ps.setBytes(4, cont.getBookPic());
                ps.setString(5, cont.getPID());
                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "Book Updated");

                } else {
                    JOptionPane.showMessageDialog(null, "Failed to Update");
                }

            } catch (SQLException ex) {
                Logger.getLogger(listQuery.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {// if user don't want to change it
            updatequery = "UPDATE `addbook` SET `BookName`=?,`Price`=?,`Quantity`=? WHERE (`ProductID`= ?)";

            try {
                ps = con.prepareStatement(updatequery);

                ps.setString(1, cont.getBNM());
                ps.setString(2, cont.getPrice());
                ps.setString(3, cont.getQuan());
                ps.setString(4, cont.getPID());

                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "Book Updated");

                } else {
                    JOptionPane.showMessageDialog(null, "Failed to Update");
                }

            } catch (SQLException ex) {
                Logger.getLogger(listQuery.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void deleteList(String pid) {

        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        // String updatequery = "";

        try {
            ps = con.prepareStatement("DELETE FROM `addbook` WHERE `ProductID`=?");
            ps.setString(1, pid);
            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Book Deleted");

            } else {
                JOptionPane.showMessageDialog(null, "Failed to Delete");
            }

        } catch (SQLException ex) {
            Logger.getLogger(listQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // insert OrderList
    public boolean insertOrderList(olist cont) {
        boolean OrderIsAdd = true;
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;

        try {
            ps = con.prepareStatement("INSERT INTO `orderlist`( `Name`,`Phone`, `ProductID`, `Quantity`, `Address`) VALUES (?,?,?,?,?)");

            ps.setString(1, cont.getYnameF());
            ps.setString(2, cont.getPhoneF());
            ps.setString(3, cont.getPidF());
            ps.setString(4, cont.getQuantityF());
            ps.setString(5, cont.getAddressF());
            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Ordered");
                OrderIsAdd = true;
            } else {
                JOptionPane.showMessageDialog(null, "Failed");
                OrderIsAdd = false;
            }

        } catch (SQLException ex) {
            Logger.getLogger(listQuery.class.getName()).log(Level.SEVERE, null, ex);
        }

        return OrderIsAdd;
    }

    //crete a list of book
    public ArrayList<list> bookList() {
        ArrayList<list> clist = new ArrayList<list>();
        Connection con = MyConnection.getConnection();
        Statement st;
        ResultSet rs;

        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT `BookName`,`ProductID`, `Price`, `Quantity`, `Pic` FROM `addbook`");
            list ct;
            while (rs.next()) {

                ct = new list(
                        rs.getString("ProductID"),
                        rs.getString("BookName"),
                        rs.getString("Price"),
                        rs.getString("Quantity"),
                        rs.getBytes("Pic"));

                clist.add(ct);
            }

        } catch (SQLException ex) {
            Logger.getLogger(listQuery.class.getName()).log(Level.SEVERE, null, ex);
        }

        return clist;
    }

    public ArrayList<list> bookList1(String valueToSeach) {
        ArrayList<list> clist = new ArrayList<list>();
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;

        try {
            //String valueToSeach="";

            ps = con.prepareStatement("SELECT * FROM `addbook` WHERE (`ProductID`) LIKE ?");
            ps.setString(1, "%" + valueToSeach + "%");
            ResultSet rs = ps.executeQuery();
            list ct;

            while (rs.next()) {

                ct = new list(
                        rs.getString("ProductID"),
                        rs.getString("BookName"),
                        rs.getString("Price"),
                        rs.getString("Quantity"),
                        rs.getBytes("Pic"));

                clist.add(ct);

            }

        } catch (SQLException ex) {
            Logger.getLogger(listQuery.class.getName()).log(Level.SEVERE, null, ex);
        }

        return clist;
    }

    // homepage Search    
    public ArrayList<list> bookList2(String valueToSeach) {
        ArrayList<list> clist = new ArrayList<list>();
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;

        try {
            //String valueToSeach="";

            ps = con.prepareStatement("SELECT * FROM `addbook` WHERE (`BookName`) LIKE ?");
            ps.setString(1, "%" + valueToSeach + "%");
            ResultSet rs = ps.executeQuery();
            list ct;

            while (rs.next()) {

                ct = new list(
                        rs.getString("ProductID"),
                        rs.getString("BookName"),
                        rs.getString("Price"),
                        rs.getString("Quantity"),
                        rs.getBytes("Pic"));

                clist.add(ct);

            }

        } catch (SQLException ex) {
            Logger.getLogger(listQuery.class.getName()).log(Level.SEVERE, null, ex);
        }

        return clist;
    }

    public ArrayList<ulist> userList() {
        ArrayList<ulist> clist = new ArrayList<ulist>();
        Connection con = MyConnection.getConnection();
        Statement st;
        ResultSet rs;

        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT `FirstN`,`LastN`,`Phone`,`Username`,`Password` FROM `register`");
            ulist ct;
            while (rs.next()) {

                ct = new ulist(
                        rs.getString("FirstN"),
                        rs.getString("LastN"),
                        rs.getString("Phone"),
                        rs.getString("Username"),
                        rs.getString("Password"));

                clist.add(ct);
            }

        } catch (SQLException ex) {
            Logger.getLogger(listQuery.class.getName()).log(Level.SEVERE, null, ex);
        }

        return clist;
    }

    public ArrayList<olist> orderList() {
        ArrayList<olist> clist = new ArrayList<olist>();
        Connection con = MyConnection.getConnection();
        Statement st;
        ResultSet rs;

        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT `Name`,`Phone`,`ProductID`,`Quantity`,`Address` FROM `orderlist`");
            olist ct;
            while (rs.next()) {

                ct = new olist(
                        rs.getString("Name"),
                        rs.getString("Phone"),
                        rs.getString("ProductID"),
                        rs.getString("Quantity"),
                        rs.getString("Address"));

                clist.add(ct);
            }

        } catch (SQLException ex) {
            Logger.getLogger(listQuery.class.getName()).log(Level.SEVERE, null, ex);
        }

        return clist;
    }

}
