package id.ac.polinema.recyclerview.models;

public class TeamLogo {
    String logo;
    String name;
    public TeamLogo(String logo, String name) {
        this.logo = logo;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getLogo() {
        return logo;
    }

}
