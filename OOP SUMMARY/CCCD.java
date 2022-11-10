public class CCCD {
    private String name;
    private int yob; // year of birth
    private String sex; 
    private String placeOfOrigin;

    public CCCD(String name, int yob, String sex, String placeOfOrigin) {
        this.name = name;
        this.yob = yob;
        this.sex = sex;
        this.placeOfOrigin = placeOfOrigin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPlaceOfOrigin() {
        return placeOfOrigin;
    }

    public void setPlaceOfOrigin(String placeOfOrigin) {
        this.placeOfOrigin = placeOfOrigin;
    }

    public void print() {
        // System.out.println("xxx");
        System.out.printf("%-15s| %4d | %-3s | %-10s\n", name, yob, sex, placeOfOrigin);
    }
    
}