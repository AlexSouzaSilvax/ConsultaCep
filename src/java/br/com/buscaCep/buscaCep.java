package br.com.buscaCep;

import javax.swing.JOptionPane;

/**
 *
 * @author alex
 */
public class buscaCep {

    public static void main(String[] args) {

        WebServiceCep webServiceCep = WebServiceCep.searchCep(JOptionPane.showInputDialog("Informe seu Cep:"));

        if (webServiceCep.wasSuccessful()) {

            JOptionPane.showMessageDialog(null, "Cep: " + webServiceCep.getCep()
                    + "\nLogradouro: " + webServiceCep.getLogradouroFull()
                    + "\nBairro: " + webServiceCep.getBairro()
                    + "\nCidade: "
                    + webServiceCep.getCidade() + " - " + webServiceCep.getUf());

        } else {
            JOptionPane.showMessageDialog(null, "Erro numero: " + webServiceCep.getResulCode());

            JOptionPane.showMessageDialog(null, "Descriçao do erro: " + webServiceCep.getResultText());
        }
    }
}
