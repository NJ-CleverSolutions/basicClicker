public class Agent {

    public String name;
    public String company;
    public User user;

    public Agent() {

    }

    public Agent(String name) {

        if (name.equals("Bling Bling")) {
            createBling();
        } else if (name.equals("Trendy Minds")) {
            createTrindyMinds();
        } else if (name.equals("Workshape")) {
            createWorkshape();
        } else if (name.equals("Reboot")) {
            createReboot();
        } else {
            createKelly();
        }
    }

    public void createUser() {

    }

    public void createBling() {
        setName("Bling Bling");
        setCompany("Luxury Property Management");
    }

    public void createTrindyMinds() {
        setName("Trindy Minds");
        setCompany("Black Point Businesses");
    }

    public void createWorkshape() {
        setName("Workshape");
        setCompany("Wealthy Wharf Wingman");
    }

    public void createReboot() {
        setName("Reboot");
        setCompany("Coldwell Computers & Sons");
    }

    public void createKelly() {
        setName("Koupon Karen");
        setCompany("Half-Price Homes");
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
