package collections;
import collections.Cliente;
import collections.ClienteDAO;

import javax.swing.*;

/**
 * Created by alexwh on 9/17/14.
 */
public class CadastrarCliente {

    public static void main(String[] args) {
        new CadastrarCliente();
    }

    public Cliente cadastro(){
        Cliente e = new Cliente();
        e.setNome(JOptionPane.showInputDialog(null, "Digite nome: "));
        e.setEmail(JOptionPane.showInputDialog(null, "Digite email: "));
        e.setIdade(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite idade: ")));
        e.setTelefone(JOptionPane.showInputDialog(null, "Digite telefone: "));
        e.setEnd(JOptionPane.showInputDialog(null, "Digite Endereço: "));
        return e;
    }

    public CadastrarCliente(){
        ClienteDAO dao = new ClienteDAO();
        boolean cond = true;
        while (cond) {
            int menu = Integer.parseInt(JOptionPane.showInputDialog(null, "Cadastro de Clientes. Selecione uma das opções: " +
                    " 1- Adicionar Cliente | 2- Consultar Cliente | 3- Alterar Cliente | 4- Deletar Cliente | 5 Listar Todos "));

            switch (menu) {
                case 1: dao.inserir(cadastro());break;
                case 2: dao.consultar(JOptionPane.showInputDialog(null, "Digite nome do cliente."), JOptionPane.showInputDialog(null, "Digite email do cliente."));break;
                case 3: dao.alterar(dao.consultar(JOptionPane.showInputDialog(null, "Digite nome do cliente."), JOptionPane.showInputDialog(null, "Digite email do cliente.")));break;
                case 4: dao.deletar(dao.consultar(JOptionPane.showInputDialog(null, "Digite nome do cliente."), JOptionPane.showInputDialog(null, "Digite email do cliente.")));break;
                case 5: dao.listarTodos(); break;
            }

            cond = Boolean.parseBoolean(JOptionPane.showInputDialog(null, "Deseja continuar? (true | false)"));
        }
    }

}
