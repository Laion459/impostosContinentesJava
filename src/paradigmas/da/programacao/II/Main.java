package paradigmas.da.programacao.II;

public class Main {

    public static void main(String[] args) {

	America america = new America("América", 20);
    Europa europa = new Europa("Europa", 55);
    Asia asia = new Asia("Asia", 21);

    CalculadoraImposto calculadoraImposto = new CalculadoraImposto(100f, "calculadora");

    System.out.println("#### -CALCULADORA DE IMPOSTOS:- #### ");
    System.out.println();

    System.out.println("    *** Calcula América: *** " + calculadoraImposto.calculaImposto("América", 999));
    System.out.println("    *** Calcula Europa: *** " + calculadoraImposto.calculaImposto("Europa", 999));
    System.out.println("    *** Calcula Asia: *** " + calculadoraImposto.calculaImposto("Asia", 999));

    // Aqui só testes para brincar
    System.out.println();
    CalculadoraImposto calculadoraImpostoAmerica = new CalculadoraImposto(1000f, "América");
    CalculadoraImposto calculadoraImpostoEuropa = new CalculadoraImposto(1000f, "Europa");
    CalculadoraImposto calculadoraImpostoAsia = new CalculadoraImposto(1000f, "Asia");

    System.out.println("    - América: " + america.getNome());
    System.out.println("    - Pupulação: " + america.getPopulacao());

    System.out.println("    - Europa: " + europa.getNome());
    System.out.println("    - Pupulação: " + europa.getPopulacao());

    System.out.println("    - Asia: " + asia.getNome());
    System.out.println("    - Pupulação: " + asia.getPopulacao());

    System.out.println("    - Calcula imposto " + calculadoraImpostoAmerica.calculaImposto("América", 1000));
    System.out.println("    - Pais: " + america.getNome() + "   - População: " + america.getPopulacao());
    System.out.println("");

    System.out.println("    - Nome: " + calculadoraImpostoAsia.getNome());
    System.out.println("    - Preço: 400,00 = " + calculadoraImpostoAsia.calculaImposto("Asia" , 400f));


    }
}
