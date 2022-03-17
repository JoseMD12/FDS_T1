import java.util.LinkedList;

public class App {
    public static void main(String [] args){
        CatalogoVeiculos cv = new CatalogoVeiculos();

        VeiculoPasseio vPasseio1 = new VeiculoPasseio("JAR8C62", "HB20", "Hyundai", 2022, 50000, 14);
        VeiculoPasseio vPasseio2 = new VeiculoPasseio("IYX4612", "Compass", "Jeep", 2019, 130000, 16);

        VeiculoPassageiros vPassageiros1 = new VeiculoPassageiros("JAM4H20", "Onibus", "Marcopolo", 2015, 220000, 160);
        VeiculoPassageiros vPassageiros2 = new VeiculoPassageiros("IWA8452", "Onibus", "Marcopolo", 2016, 270000, 180);

        cv.add(vPassageiros1);
        cv.add(vPassageiros2);
        cv.add(vPasseio1);
        cv.add(vPasseio2);

        String placa = "JAR8C62";
        System.out.println("Consulta pela placa: " + placa);
        cv.consultaPorPlaca(placa);

        String marca = "Marcopolo";
        LinkedList<Veiculo> listaMarca = cv.consultaPorMarca(marca);
        System.out.println("\nConsulta pela marca: " + marca);
        for(Veiculo v: listaMarca){
            System.out.println("\n" + v);
        }

        int ano = 2019;
        LinkedList<Veiculo> listaAno = cv.consultaPorAno(ano);
        System.out.println("\nConsulta pelo ano: " + ano);
        for(Veiculo v: listaAno){
            System.out.println("\n" + v);
        }

        String tipo = "PASSEIO";
        LinkedList<Veiculo> listaTipo = cv.consultaPorTipo(tipo);
        System.out.println("\nConsulta pelo tipo: " + tipo);
        for(Veiculo v: listaTipo){
            System.out.println("\n" + v);
        }
    }
}
