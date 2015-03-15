package lista2.Exe01;

/**
 * Created by WhiteHorse on 21/09/2014.
 */

import javax.swing.*;


public class Aluno extends Pessoa {


    private float nota1, nota2, nota3, media = (nota1 + nota2 + nota3)/3;
    private int frequencia = ((int) Math.random() * 100);

    public void setNota1(float nota1){
        this.nota1 = nota1;
    }
    public float getNota1(){
        return nota1;
    }

    public void setNota2(float nota2){
        this.nota2 = nota2;
    }
    public float getNota2(){
        return nota2;
    }

    public void setNota3(float nota3){
        this.nota3 = nota3;
    }
    public float getNota3(){
        return nota3;
    }

    public float getMedia(){
        return media;
    }

    public int getFrequencia(){
        return frequencia;
    }

    protected void checar(){
        if ((frequencia > 75) && (media >= 7))
            JOptionPane.showMessageDialog(null, "Aluno: " + getNome() + " Aprovado!");
        if ((frequencia < 75) || (media < 7))
            JOptionPane.showMessageDialog(null, "Aluno: " + getNome() + " Reprovado!");

    }


}