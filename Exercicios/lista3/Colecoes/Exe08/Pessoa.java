package lista3.Colecoes.Exe08;

import javax.swing.*;
import java.util.ArrayList;

/**
 * Created by WhiteHorse on 24/09/2014.
 */
public class Pessoa {

    private String nome;
    private int rg, cpf;
    private final int QTD = 5;
    private ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getRg() {
        return rg;
    }
    public void setRg(int rg) {
        this.rg = rg;
    }
    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public void cadastrarPessoa(){
        for (int i = 0; i < QTD; i++){
            Pessoa pessoa = new Pessoa();
            pessoa.setNome(JOptionPane.showInputDialog("Digite nome: "));
            pessoa.setRg(Integer.parseInt(JOptionPane.showInputDialog("Digite RG: ")));
            pessoa.setCpf(Integer.parseInt(JOptionPane.showInputDialog("Digite CPF: ")));
            listaPessoas.add(pessoa);
        }
    }

    public void imprimirLista(){
        for (Pessoa p : listaPessoas ){
            JOptionPane.showMessageDialog(null, "Nome: " + p.getNome() + " RG: " + p.getRg() + " CPF: " + p.getCpf());
        }
    }

    public static void main(String[] args) {
        new Pessoa().run();
    }

    public void run(){
        cadastrarPessoa();
        imprimirLista();
    }
}
