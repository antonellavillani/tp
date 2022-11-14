public class ObjetoTransportable {
    private double peso;
    private Dimension dimension;
    private String name;
    private boolean fragil;

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFragil() {
        return fragil;
    }

    public void setFragil(boolean fragil) {
        this.fragil = fragil;
    }

    ObjetoTransportable(
            String nombre,
            double peso,
            Dimension dimension,
            boolean fragil
    ){
        setName(nombre);
        setPeso(peso);
        setDimension(dimension);
        setFragil(fragil);
    }
}
