public class Mudanza {
    private int idMudanza;
    private int distancia;
    private Camion camion;
    private Bulto bultos[];

    public Mudanza(int idMudanza, int distancia, Camion camion, Bulto bultos[]) {
        this.idMudanza = idMudanza;
        this.distancia = distancia;
        this.camion = camion;
        this.bultos = bultos;
    }

    public double calcularCoste() {
        double costeTotal = distancia * 2;

        for (int i = 0; i < bultos.length; i++) {
            costeTotal += bultos[i].getPeso() * 1;

            if (bultos[i].isFragil()) {
                costeTotal += 4;
            }
        }

        return costeTotal;
    }

    public int getIdMudanza() {
        return idMudanza;
    }

    public void setIdMudanza(int idMudanza) {
        this.idMudanza = idMudanza;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public Camion getCamion() {
        return camion;
    }

    public void setCamion(Camion camion) {
        this.camion = camion;
    }

    public Bulto[] getBultos() {
        return bultos;
    }

    public void setBultos(Bulto[] bultos) {
        this.bultos = bultos;
    }
}
