public class MovieStar {
    private String name;
    private String mostFamousRole;
    private String highestSalary;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMostFamousRole() {
        return mostFamousRole;
    }

    public void setMostFamousRole(String mostFamousRole) {
        this.mostFamousRole = mostFamousRole;
    }

    public String getHighestSalary() {
        return highestSalary;
    }

    public void setHighestSalary(String highestSalary) {
        this.highestSalary = highestSalary;
    }

    public MovieStar(String name, String mostFamousRole, String highestSalary) {
        this.name = name;
        this.mostFamousRole = mostFamousRole;
        this.highestSalary = highestSalary;
    }
}
