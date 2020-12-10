
public class User {

    public String name;
    public String companyName;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCompanyName(String company)
    {
        this.companyName = company;
    }
}
