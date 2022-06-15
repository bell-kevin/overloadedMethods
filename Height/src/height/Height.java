package height;

class Height {

    double height;
    String units;

    public void setHeight(double height) {
        this.height = height;
        this.units = "cm";
    }

    public void setHeight(double height, String units) {
        this.height = height;
        this.units = units;
    }

    public void print() {
        System.out.println(this.height + " " + this.units);
    }
}
