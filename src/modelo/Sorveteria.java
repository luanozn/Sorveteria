package modelo;

import java.util.HashMap;
import java.util.Map;

public class Sorveteria {

    public static int saborMaisPopular(int[] votos){
        int apareceuMaisVezes = 0, maisVotado = -1;
        HashMap<Integer, Integer> votosComQuantidade = new HashMap<>();
        for(int voto : votos){
            if(votosComQuantidade.containsKey(voto))
                votosComQuantidade.put(voto, votosComQuantidade.get(voto) + 1);
            else
                votosComQuantidade.put(voto, 1);
        }

        for(Map.Entry<Integer, Integer> item : votosComQuantidade.entrySet()){
            if(item.getValue().compareTo(apareceuMaisVezes) > 0) {
                apareceuMaisVezes = item.getValue();
                maisVotado = item.getKey();
            }
        }

        return maisVotado;
    }
}
