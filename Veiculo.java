public abstract class Veiculo {
    String placa = "";
    String modelo = "";
    String marca = "";
    int ano = 0;
    double valor = 0;

    public Veiculo(String placa, String modelo, String marca, int ano, double valor){
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.valor = valor;
    }

    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public int getAno() {
        return ano;
    }

    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString(){
        return "Veiculo [placa = " + placa + ", modelo = " + modelo +
         ", marca = " + marca + ", ano = " + ano + ", valor = R$" + valor;
    }
}