package view;

import javax.swing.JOptionPane;
import controller.HistoricoController;
import model.PilhaString;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 PilhaString historico = new PilhaString(); // pilha
	        HistoricoController c = new HistoricoController();

	        int opcao = 0;

	        while (opcao != 4) {

	            try {

	                opcao = Integer.parseInt(JOptionPane.showInputDialog(
	                    "MENU\n"
	                    + "1 - Inserir site\n"
	                    + "2 - Remover último site\n"
	                    + "3 - Consultar último site\n"
	                    + "4 - Sair"
	                ));

	                switch (opcao) {

	                    case 1:
	                        String url = JOptionPane.showInputDialog("Digite o site:");
	                        c.inserir(historico, url);
	                        break;

	                    case 2:
	                        String removido = c.remover(historico);
	                        System.out.println("Removido: " + removido);
	                        break;

	                    case 3:
	                        String ultimo = c.consultar(historico);
	                        System.out.println("Último site: " + ultimo);
	                        break;

	                    case 4:
	                        System.out.println("Encerrando...");
	                        break;

	                    default:
	                        System.out.println("Opção inválida!");
	                }

	            } catch (Exception e) {
	                System.out.println("Erro: " + e.getMessage());
	            }
	        }
	    }
  }
	
	

