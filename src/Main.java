
public class Main {
    public static void main(String[] args) {
        Forma rettangolo1 = new Rettangolo(7.5, 4.5,TipoForma.SOLIDA);
        rettangolo1.calcolaArea();
        Forma triangolo1 = new Triangolo(3.5, 6,TipoForma.PIANA);
        triangolo1.calcolaArea();
        System.out.println(triangolo1 + TipoForma.SOLIDA.getTipoForma());

    }
}