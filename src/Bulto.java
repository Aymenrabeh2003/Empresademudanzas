public class Bulto {

    private int idBulto;
    private double volumen;
    private double peso;
    private boolean fragil;

    public Bulto(int id, double volumen, double peso, boolean fragil){
        this.idBulto = id;
        this.volumen = volumen;
        this.peso = peso;
        this.fragil = fragil;
    }

    public int getIdBulto() {
        return idBulto;
    }

    public void setIdBulto(int idBulto) {
        this.idBulto = idBulto;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isFragil() {
        return fragil;
    }

    public void setFragil(boolean fragil) {
        this.fragil = fragil;
    }
}
