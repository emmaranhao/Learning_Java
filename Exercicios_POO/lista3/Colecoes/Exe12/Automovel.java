package lista3.Colecoes.Exe12;

import javax.swing.*;
import java.util.ArrayList;

/**
 * Created by WhiteHorse on 24/09/2014.
 */
public class Automovel {

    private String cor, marca, modelo;
    private int ano;
    private ArrayList<Automovel> listaAuto = new ArrayList<Automovel>();

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    public void criarAuto(){
        Automovel a = new Automovel();
        a.setModelo(JOptionPane.showInputDialog("Digite modelo: "));
        a.setCor(JOptionPane.showInputDialog("Digite cor: "));
        a.setMarca(JOptionPane.showInputDialog("Digite marc: "));
        a.setAno(Integer.parseInt(JOptionPane.showInputDialog("Digite modelo: ")));
        listaAuto.add(a);
    }

    public void imprimirListaAuto(){
        for (Automovel a : listaAuto){
            JOptionPane.showMessageDialog(null, "Marca: " + a.getMarca() + " Modelo: " + a.getModelo() + " Cor: " + a.getCor()
            + " Ano: " + a.getAno());
        }
    }

    public static void main(String[] args) {
        new Automovel().run();
    }

    public void run(){
        criarAuto();
        imprimirListaAuto();
    }

}
