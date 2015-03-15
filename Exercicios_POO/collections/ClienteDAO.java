package collections;

import javax.swing.*;
import java.util.ArrayList;

/**
 * Created by alexwh on 9/17/14.
 */
public class ClienteDAO {

    ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();

    public void inserir(Cliente e){
        listaClientes.add(e);
    }

    public Cliente consultar(String nome, String email){
        for (Cliente e : listaClientes){
            if ((nome.equalsIgnoreCase(e.getNome())) || (email.equalsIgnoreCase(e.getEmail()))){
                JOptionPane.showMessageDialog(null, "Cliente encontrado!");
                imprimir(e);
                return e;
            }
        }
        JOptionPane.showMessageDialog(null, "Cliente não encontrado!");
        return null;
    }

    public void alterar(Cliente e){
        int ask = (Integer.parseInt(JOptionPane.showInputDialog(null, "O que deseja alterar do cliente " + e.getNome() +
                " 1- Nome | 2- End | 3- Email | 4- Telefone | 5- Idade")));
        switch(ask){
            case 1: e.setNome(JOptionPane.showInputDialog(null, "Digite o novo nome: ")); break;
            case 2: e.setEnd(JOptionPane.showInputDialog(null, "Digite o novo Endereço: ")); break;
            case 3: e.setEmail(JOptionPane.showInputDialog(null, "Digite o novo Email: ")); break;
            case 4: e.setTelefone(JOptionPane.showInputDialog(null, "Digite o novo Telefone: ")); break;
            case 5: e.setIdade(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o novo Idade: "))); break;

        }
    }

    public void deletar(Cliente e){
        if (JOptionPane.showConfirmDialog(null, "Deseja realmente deletar o cliente " + e.getNome())== 0) ;
            listaClientes.remove(listaClientes.indexOf(e));
    }

    public void imprimir(Cliente e){
        JOptionPane.showMessageDialog(null, "Nome : " + e.getNome() + " Endereço: " + e.getEnd() + " Email: " + e.getEmail()
                                        + " Idade: " + e.getIdade() + " Telefone: " + e.getTelefone());
    }

    public void listarTodos(){
        for (Cliente e : listaClientes){
            imprimir(e);
        }
    }
}
