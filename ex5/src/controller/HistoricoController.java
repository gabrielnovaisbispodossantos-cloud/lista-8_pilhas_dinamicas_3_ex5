package controller;

import model.PilhaString;

public class HistoricoController {

	public HistoricoController() {
		// TODO Auto-generated constructor stub
		super();
	}
	private boolean validaEndereco(String url) {

        // verifica se começa com http://
        if (!url.startsWith("http://")) {
            return false;
        }

        // remove "http://"
        String resto = url.substring(7);

        // verifica se começa com www.
        if (!resto.startsWith("www.")) {
            return false;
        }

        // verifica se tem domínio (ponto depois)
        if (!resto.contains(".")) {
            return false;
        }

        return true;
    }

    // inserir endereço
	
    public void inserir(PilhaString historico, String url) throws Exception {

        if (!validaEndereco(url)) {
            throw new Exception("Endereço inválido!");
        }

        historico.push(url); // empilha endereço
        System.out.println("Site adicionado!");
    }

    // ===============================
    // 🔹 REMOVER ÚLTIMO
    // ===============================
    public String remover(PilhaString historico) throws Exception {

        if (historico.isEmpty()) {
            throw new Exception("Histórico vazio!");
        }

        return historico.pop(); // remove topo
    }

    //consultar ultimo 
    
    public String consultar(PilhaString historico) throws Exception {

        if (historico.isEmpty()) {
            throw new Exception("Histórico vazio!");
        }

        return historico.top(); // retorna sem remover
    }
}
