package sk.tuke.rec_view_1;

public class DbModel {
    String iconName;
    String iconName3;
    String iconName1;
    int image;


    public DbModel(String iconName, String iconName3, String iconName1, int image) {
        this.iconName = iconName;
        this.iconName3 = iconName3;
        this.iconName1 = iconName1;
        this.image = image;
    }

    public String getIconName() {
        return iconName;
    }

    public String getIconName3() {
        return iconName3;
    }

    public String getIconName1() {
        return iconName1;
    }

    public int getImage() {
        return image;
    }
}
