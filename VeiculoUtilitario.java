public class VeiculoUtilitario extends Veiculo{
    int capCargaTon = 0;
    int nroEixos = 0;
    
    public VeiculoUtilitario(String placa, String modelo, String marca, int ano, double valor, int capCargaTon, int nroEixos){
        super(placa,modelo,marca,ano,valor);
        this.capCargaTon = capCargaTon;
        this.nroEixos = nroEixos;
        tipo = "VeiculoUtilitario";
    }

    public int getCapCargaTon() {
        return capCargaTon;
    }

    public int getNroEixos() {
        return nroEixos;
    }

    @Override
    public String toString(){
        return "Veiculo Utilitario" + super.toString() + ", Capacidade de carga = " + capCargaTon + " ton, qntd eixos = " + nroEixos + "]";
    }
}
