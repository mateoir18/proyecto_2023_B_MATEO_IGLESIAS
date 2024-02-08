package series;



public class Start {
    public static void main(String[] args) {
        Serie[] series = new Serie[5];
        Videojuego[] videojuegos = new Videojuego[5];

        
        for (int i = 0; i < 5; i++) {
            series[i] = new Serie("Serie " + i, i, "Genero " + i, "Creador " + i);
            videojuegos[i] = new Videojuego("Videojuego " + i, i, "Genero " + i, "Compania " + i);
        }

    
        series[0].entregar();
        videojuegos[0].entregar();

        
        int entregados = 0;
        for (int i = 0; i < 5; i++) {
            if (series[i].isEntregado()) {
                entregados++;
            }
            if (videojuegos[i].isEntregado()) {
                entregados++;
            }
        }
        System.out.println("Hay " + entregados + " entregados.");

       
        for (int i = 0; i < 5; i++) {
            if (series[i].isEntregado()) {
                series[i].devolver();
            }
            if (videojuegos[i].isEntregado()) {
                videojuegos[i].devolver();
            }
        }

        
        FicheroWriter writer = new FicheroWriter();
        writer.writeToFile(series, videojuegos);
    }
}
