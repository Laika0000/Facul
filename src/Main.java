//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Carros obj1=new Carros(2015, 0.0f, "Chevrolet", "Onyx");
        obj1.ExibirDetalhes();
        obj1.acelerar(60);
        obj1.ExibirDetalhes();
        obj1.freiar(50);
        obj1.ExibirDetalhes();

        Carros obj2=new Carros(2018,0.0f,"Volks","Gol");
        obj2.acelerar(30);
        obj2.ExibirDetalhes();

        Carros obj3= new Carros();
        obj3.ExibirDetalhes();
    }
}