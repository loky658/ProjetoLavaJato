import java.util.ArrayList;

public class Lava_Jato {
    private ArrayList<MMD> MMD;

    
    public Lava_Jato() {
         MMD = new ArrayList<>();
    }
       public void incluir(MMD c) {
            MMD.add(c);
    }
            public void atualizar(int id, MMD c) {
                MMD.set(id, c);
    }
                public void excluir(int id) {
                  MMD.remove(id);
    }
                     public String verLista() {
                         String texto = "";
                            int i = 0;
                               for (MMD c : MMD) {
                          texto += "[" + i + "] Nome: " + c.getNome() + "\n" + "Mar/Mod: " 
                            + c.getMarcaModelo() + "\n" + "Cor: " + c.getCor() + "\n" + "Placa: " + c.getPlaca() + "\n" + "\n";
                          i++;
        }
               return texto;
    }

}