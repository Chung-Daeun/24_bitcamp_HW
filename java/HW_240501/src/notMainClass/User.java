package notMainClass;

public class User {
    private long id;
    private String username;
    private String password;

    public void setter(long id, String username, String password){
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public long getId(){
        return this.id;
    }

    public String getUsername(){
        return this.username;
    }

    public String getPassword(){
        return this.password;
    }
}
