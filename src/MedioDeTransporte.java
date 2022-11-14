import java.util.ArrayList;

public class MedioDeTransporte {
    private ArrayList<ObjetoTransportable> transportables;
    private double capacidadMaxima;
    private double capacidad;
    private Dimension dimension;
    private int cantidadMaxima;

    //para usar el arraylist y que no tire error: crear un constructor

    MedioDeTransporte(
            double capacidadMaxima,
            Dimension dimension,
            int cantidadMaxima
            ){
        setTransportables(new ArrayList<ObjetoTransportable>());
        setCapacidad(0);
        setCapacidadMaxima(capacidadMaxima);
        setCapacidadMaxima(capacidadMaxima);
        setDimension(dimension);
    }

    MedioDeTransporte(
            double capacidadMaxima,
            Dimension dimension,
            int cantidadMaxima,
            double capacidad
    ){
        setTransportables(new ArrayList<ObjetoTransportable>());
        setCapacidad(capacidad);
        setCapacidadMaxima(capacidadMaxima);
        setCapacidadMaxima(capacidadMaxima);
        setDimension(dimension);
    }



    public ArrayList<ObjetoTransportable> getTransportables() {
        return transportables;
    }

    public void setTransportables(ArrayList<ObjetoTransportable> transportables) {
        this.transportables = transportables;
    }

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    public int getCantidadMaxima() {
        return cantidadMaxima;
    }

    public void setCantidadMaxima(int cantidadMaxima) {
        this.cantidadMaxima = cantidadMaxima;
    }

    public void cargar(ObjetoTransportable transportable) {
        if (getTransportables().size() >= getCantidadMaxima()) return;
        getTransportables().add(transportable);
    }
}
