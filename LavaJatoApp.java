import javax.swing.JOptionPane;

public class LavaJatoApp {
    public static void main(String[] args) throws Exception {
    
        Lava_Jato Lava_Jato = new Lava_Jato();
           Object[] opcoes = { "ADD Veiculos", "Em Espera", "Terminados", "Alterar", "Sair" };
             int escolha = 0;
             int auto = 0;

                   do {
                     escolha = JOptionPane.showOptionDialog(null, "Bem Vindo ", "Estetica Automotiva Do Marcao", JOptionPane.DEFAULT_OPTION,
                        JOptionPane.WARNING_MESSAGE, null, opcoes, opcoes[1]);
            switch (escolha) {
                 case 0:
                
                 MMD MMD = new MMD();
                    MMD.setNome(JOptionPane.showInputDialog(null, "Nome do Motorista: "));
                       MMD.setMarcaModelo(JOptionPane.showInputDialog(null, "Marca e Modelo do carro: "));
                       MMD.setCor(JOptionPane.showInputDialog(null, "Cor do Veículo: "));
                    MMD.setPlaca(JOptionPane.showInputDialog(null, "Placa do Veículo: "));
                  Lava_Jato.incluir(MMD);
                break;
            case 1:
                  JOptionPane.showMessageDialog(null, Lava_Jato.verLista());
                break;
                   case 2:
                   auto = Integer.parseInt(JOptionPane.showInputDialog(null,
                        Lava_Jato.verLista() + "Excluir: "));
                    Lava_Jato.excluir(auto);
                break;
            case 3:
                 auto = Integer.parseInt(JOptionPane.showInputDialog(null,
                    Lava_Jato.verLista() + "Alterar:  "));

                         MMD MMDAlterar = new MMD();
                            MMDAlterar.setNome(JOptionPane.showInputDialog(null, "Dono do Veículo: "));
                               MMDAlterar.setMarcaModelo(JOptionPane.showInputDialog(null, "Digite a Marca e o Modelo do carro: "));
                                 MMDAlterar.setCor(JOptionPane.showInputDialog(null, "Digite a Cor do carro: "));
                                    MMDAlterar.setPlaca(JOptionPane.showInputDialog(null, "Digite a Placa do Veículo: "));
                                        Lava_Jato.atualizar(auto, MMDAlterar);
                break;
            default:
                break;
            }
        } while (escolha != 4);

    }
}