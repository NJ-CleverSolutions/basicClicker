
public class User {

    public String name;
    public String saveName;

    public User(String name, String saveName) {
        this.name = name;
        this.saveName = saveName;
    }

    public String getName() {
        return name;
    }

    public String saveName() {
        return saveName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSaveName(String saveName) {
        this.saveName = saveName;
    }
}
