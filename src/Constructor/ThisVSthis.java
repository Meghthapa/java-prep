package Constructor;

/**
 * Created by meght on 4/3/2018.
 */
public class ThisVSthis {

    private String firstname;
    private String lastname;

    public ThisVSthis(){
      this("Megh","Thapa");
    }
    public ThisVSthis(String firstname,String lastname){
        this.firstname = firstname;
        //String lastname= "lastname";
        this.lastname = lastname;
    }

    public  void setFirstname(String firstname){
        this.firstname=firstname;
    }

    public String getFirstname(){
        return firstname;
    }
    public String getfullName(){
        return firstname + lastname;
    }
    public static void main(String[] args) {

    }
}
