import javax.swing.*;

public class Carros {
    //variavel
    //tipos de dado primitivo
    public int ano;
    public float velocidade;
    //tipo de dado é uma classe
    public String marca,modelo;
    //Metodos
    //Métodos construtores
    //sem parâmetro
    public Carros(){
        this.marca="Vazia";
        this.modelo="Vazio";
    }

    public Carros(int ano,float velocidade,String marca,String modelo){
        this.ano=ano;
        this.velocidade=velocidade;
        this.marca=marca;
        this.modelo=modelo;
    }

    public void acelerar(float x){
        this.velocidade+=x;
    }
    public void freiar(float x){
        if(this.velocidade-x>0){
            this.velocidade-=x;
        }
        else{
            this.velocidade=0.0f;
        }
    }
    public void ExibirDetalhes(){
        //This repretena o objeto que chama o metodo
       JOptionPane.showMessageDialog(null,"\nModelo: "+this.modelo + "\nMarca: "+this.marca + "\nAno: "+this.ano + "\nVelocidade: "+this.velocidade);

    }
}
