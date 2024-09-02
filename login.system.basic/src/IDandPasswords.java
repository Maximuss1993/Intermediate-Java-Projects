import java.util.HashMap;

public class IDandPasswords {
    // instatiating hash map to store loginfo
    HashMap<String, String> logininfo = new HashMap<String, String>();

    //Constructor
     IDandPasswords(){
        logininfo.put("Marko", "12345");
        logininfo.put("Marija", "123456");
        logininfo.put("Vuk", "1234567");

    }

    // getter for IDandPasswords instance
    protected HashMap getLoginInfo(){
        return logininfo;
    }
}
