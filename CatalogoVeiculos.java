import java.util.ArrayList;
import java.util.LinkedList;

public class CatalogoVeiculos {

    LinkedList<Veiculo> cv = new LinkedList<>();

    public void acrescentaVeiculo (Veiculo a){
        cv.add(a);
    }

    public Veiculo ConsultaPorPlaca (String placa){
        for (Veiculo v : cv){
            if (placa.equals(v.getPlaca())) {
                return v;
            }
        }
        return null;
    }

    public <List>ArrayList<Veiculo> ConsultaPorMarca (String marca){
        ArrayList<Veiculo> vm = new ArrayList<>(); 
        for (Veiculo v : cv){
            if (marca.equals(v.getMarca())){
                vm.add(v);
            }
        }
        if (vm.isEmpty()){
            return null;
        }
        return vm;
    }

    public <List>ArrayList<Veiculo> ConsultaporAno (int ano){
        ArrayList<Veiculo> va = new ArrayList<>();
        for (Veiculo v : cv){
            if (ano == v.getAno()){
                va.add(v);
                return va;
            }
        }
        return null;
    }

    // public <List>ArrayList<Veiculo> ConsultaPorTipo (String tipo){
    //     //lógica Pedro
    //     }
    // }

}
