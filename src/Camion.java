public class Camion {

    private String matricula;
    private double volumenRemolque;
    private double pesoMaxDeTransporte;

    public Camion(String matricula, double volumenRemolque, double pesoMaxDeTransporte){

        this.matricula = matricula;
        this.volumenRemolque = volumenRemolque;
        this.pesoMaxDeTransporte = pesoMaxDeTransporte;

    }

    public boolean sePuedePoner(Bulto bulto){
        return bulto.getPeso() < getPesoMaxDeTransporte();
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getVolumenRemolque() {
        return volumenRemolque;
    }

    public void setVolumenRemolque(double volumenRemolque) {
        this.volumenRemolque = volumenRemolque;
    }

    public double getPesoMaxDeTransporte() {
        return pesoMaxDeTransporte;
    }

    public void setPesoMaxDeTransporte(double pesoMaxDeTransporte) {
        this.pesoMaxDeTransporte = pesoMaxDeTransporte;
    }
}
