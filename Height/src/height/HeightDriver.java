package height;

public class HeightDriver {

    public static void main(String[] args) {
        Height myHeight = new Height();
        myHeight.setHeight(72.0, "in");
        myHeight.print();
        myHeight.setHeight(180.0);
        myHeight.print();
    }
}
