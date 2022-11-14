public class Main {
    public static void main(String[] args) {
        MedioDeTransporte camionDisponible = new MedioDeTransporte(
                500.0,
                new Dimension(2.5, 1.5, 4),
                3
        );

        //crear sillas
        ObjetoTransportable sillaDeMadera = new ObjetoTransportable(
                "Silla de madera",
                2.0,
                new Dimension(0.4,1, 0.4),
                false
        );

        ObjetoTransportable sillaDeMetal = new ObjetoTransportable(
                "Silla de metal",
                4.0,
                new Dimension(0.4,1, 0.4),
                false
        );


        //crear televisor
        ObjetoTransportable televisor = new ObjetoTransportable(
                "Televisor",
                8.0,
                new Dimension(1.4, 1, 0.2),
                true
        );

        ObjetoTransportable televisorViejo = new ObjetoTransportable(
                "Televisor viejo",
                8.0,
                new Dimension(1.4, 1, 0.2),
                true
        );

        //cargar los objetos
        camionDisponible.cargar(sillaDeMadera);
        camionDisponible.cargar(sillaDeMetal);
        camionDisponible.cargar(televisor);
        camionDisponible.cargar(televisorViejo);

    }
}
