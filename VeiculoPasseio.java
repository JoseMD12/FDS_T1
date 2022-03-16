public class VeiculoPasseio extends Veiculo{
    double consumoKmLt = 0;
    
    public VeiculoPasseio(String placa, String modelo, String marca, int ano, double valor, double consumoKmLt){
        super(placa,modelo,marca,ano,valor);
        this.consumoKmLt = consumoKmLt;
    }

    public double getConsumoKmLt() {
        return consumoKmLt;
    }
    public void setConsumoKmLt(double consumoKmLt) {
        this.consumoKmLt = consumoKmLt;
    }

    @Override
    public String toString(){
        return super.toString() + ", consumo Km/L = " + consumoKmLt;
    }
}
