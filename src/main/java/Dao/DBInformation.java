package Dao;

public class DBInformation {

    private static final String url = "jdbc:mysql://sql.freedb.tech:3306/freedb_bd_phn2025";
    private static final String user = "freedb_bobo43";
    private static final String password = "EvwZFqc#BGWU3r$";

    public DBInformation(){};
    public String getUrl() {
        return url;
    }
    public String getUser() {
        return user;
    }
    public String getPassword() {
        return password;
    }
}
