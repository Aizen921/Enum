public enum TipoForma {
    SOLIDA ("Solida"),

    PIANA ("Piana");

    private final String tipoForma;

    TipoForma(String tipoForma) {
        this.tipoForma = tipoForma;
    }

    public String getTipoForma() {
        return tipoForma;
    }

    @Override
    public String toString() {
        return "TipoForma{" +
                "tipoForma='" + tipoForma + '\'' +
                '}';
    }
}
