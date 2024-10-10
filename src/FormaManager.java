import java.util.ArrayList;
import java.util.List;

public class FormaManager {
    private List<Forma> formas = new ArrayList<>();
    private CorFactory corFactory = new CorFactory();

    public void addForma(String nome, String posicao, int tamanho) {
        Cor cor = corFactory.getCor(nome);
        Forma forma = new Forma(cor, posicao, tamanho);
        formas.add(forma);
    }
    public void mostrar(){
        for(Forma forma: formas){
            System.out.println(forma);
        }
    }
}
