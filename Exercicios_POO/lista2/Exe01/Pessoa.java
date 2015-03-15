package lista2.Exe01;

/**
 * Created by WhiteHorse on 21/09/2014.
 */


import java.util.Date;

public class Pessoa {

    private String nome, telefone;
    private Date data_nasc;

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public String getTelefone(){
        return telefone;
    }

    public void setData_nasc(Date data_nasc){
        this.data_nasc = data_nasc;
    }
    public Date getData_nasc(){
        return data_nasc;
    }




}
