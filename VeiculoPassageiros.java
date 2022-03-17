public class VeiculoPassageiros extends Veiculo{
    int nroPassageiros;

    public VeiculoPassageiros(String placa, String modelo, String marca, int ano, double valor, int nroPassageiros){
        super(placa, modelo, marca, ano, valor);
        this.nroPassageiros = nroPassageiros;
    }

    public int getNroPassageiros() {
        return nroPassageiros;
    }

    @Override
    public String toString(){
        return "Veiculo Passageiros" + super.toString() + ", número de passageiros = " + nroPassageiros + "]";
    }
}
