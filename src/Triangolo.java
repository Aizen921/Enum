public class Triangolo extends Forma{
    private double base;
    private double altezza;
    Triangolo(double base, double altezza,TipoForma tipo){
        this.base = base;
        this.altezza = altezza;

    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    @Override
    public void calcolaArea() {
        super.calcolaArea();
        System.out.println(getBase() * getAltezza() /2);
    }

    @Override
    public String toString() {
        return "Triangolo{" +
                "base=" + base +
                ", altezza=" + altezza +
                '}';
    }
}
