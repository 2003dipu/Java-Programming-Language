import java.util.HashMap;

public class IDandPasswords {

    HashMap<String, String> logininfo = new HashMap<String,String>();

    IDandPasswords(){

        logininfo.put("Dipu", "Kichuri");
        logininfo.put("Liton", "Ripon");
        logininfo.put("Shuvon", "Sourov123");
    }
    
    protected HashMap getLoginInfo(){
        return logininfo;
    }
}
