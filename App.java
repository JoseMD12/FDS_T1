public class App {
    public static void main(String [] args){
        CatalogoVeiculos cv = new CatalogoVeiculos();

        VeiculoPasseio vPasseio1 = new VeiculoPasseio("JAR8C62", "HB20", "Hyundai", 2022, 50000, 14);
        VeiculoPasseio vPasseio2 = new VeiculoPasseio("IYX4612", "Compass", "Jeep", 2019, 130000, 16);

        VeiculoPassageiros vPassageiros1 = new VeiculoPassageiros("JAM4H20", "Onibus", "Marcopolo", 2015, 220000, 160);
        VeiculoPassageiros vPassageiros2 = new VeiculoPassageiros("IWA8452", "Onibus", "Marcopolo", 2016, 270000, 180);

        cv.acrescentaVeiculo(vPassageiros1);
        cv.acrescentaVeiculo(vPassageiros2);
        cv.acrescentaVeiculo(vPasseio1);
        cv.acrescentaVeiculo(vPasseio2);

        String placa = "JAR8C62";
        System.out.println("Consulta pela placa: " + placa);
        System.out.println(cv.ConsultaPorPlaca(placa) + "\n");

        String marca = "Marcopolo";
        System.out.println("\nConsulta pela marca: " + marca);
        System.out.println(cv.ConsultaPorMarca(marca) + "\n");

        int ano = 2019;
        System.out.println("\nConsulta pelo ano: " + ano);
        System.out.println(cv.ConsultaporAno(ano) + "\n");

        String tipo = "VeiculoPasseio";
        System.out.println("\nConsulta pelo tipo: " + tipo);
        System.out.println(cv.ConsultaPorTipo(tipo) + "\n");
    }
}
