// Corrida na Selva
// Todos os anos, na província de Misiones, no norte da Argentina, acontece um evento
// conhecido como "Corrida na Selva”. É uma competição onde os melhores maratonistas e
// corredores da América Latina se encontram para desafiar suas habilidades esportivas.
// A competição tem 3 categorias dependendo de sua dificuldade:
// ● Circuito pequeno: 2 km pela selva e riachos.
// ● Circuito médio: 5 km pela selva, riachos e lama.
// ● Circuito Avançado: 10 km pela selva, riachos, lama e escalada.
// Cada participante só pode se inscrever em uma categoria e precisa, para tal inscrição,
// fornecer as seguintes informações: RG, nome, sobrenome, idade, número de celular, número
// de emergência e grupo sanguíneo. A cada inscrito, por sua vez, é atribuído um número de
// participante consecutivo em relação à inscrição anterior; Por exemplo, se um participante se
// inscrever e o anterior for o número 36, será atribuído o número 37.

// Para concluir com a inscrição, deve ser calculado o valor a ser pago por cada participante.
// Para isso, são levados em consideração os seguintes valores:
// ● Inscrição no circuito pequeno: Menores de 18 anos R$1.300. Acima de 18 anos R$
// 1.500.
// ● Inscrição no Circuito Médio: Menores de 18 anos R$ 2.000. Acima de 18 anos R$
// 2.300.
// ● Inscrição no Circuito Avançado: A inscrição não é permitida para menores de 18
// anos. Maiores de 18 anos R$ 2.800

// Com base nesses dados fornecidos, os organizadores da corrida afirmaram que precisam de um
// aplicativo que seja capaz de:
// a) Inscrever um novo participante em uma categoria. (Observe que cada categoria tem uma
// lista de entradas diferente).
// b) Mostra na tela todos os cadastrados em uma determinada categoria com seus
// respectivos dados e número de registro.
// c) Cancelar a inscrição de um participante de uma categoria.
// d) Determine o valor que cada participante deve pagar ao se inscrever. Por exemplo: se o
// participante se inscrever na categoria Circuito Pequeno e tiver 21 anos, o valor a ser
// pago é de R$ 1.500. 

package praticasIntegradoras.pratica1;

import java.util.HashMap;
import java.util.Scanner;

public class pratica2 {

  public static Participant participantSubscription (Scanner scanner) {
    System.out.println("Informe o RG: ");
    String rg = scanner.next();
    System.out.println("Informe seu nome: ");
    String name = scanner.next();
    System.out.println("Informe seu sobrenome: ");
    String surname = scanner.next();
    System.out.println("Informe seu sobrenome: ");
    String age = scanner.next();
    System.out.println("Informe seu número de celular: ");
    String cell = scanner.next();
    System.out.println("Informe o numero de celular emergencial: ");
    String cellEmergency = scanner.next();
    System.out.println("Informe seu tipo sanguíneo: ");
    String bloodGroup = scanner.next();
    System.out.println("Informe a categoria de circuit (Pequeno, Médio, Avançado): ");
    String circuit = scanner.next();

    if (age < 18 && circuit.equals('Avancado')) {
      retun null;
    }
  }

  





  public static void main(String[] args) {   

  Scanner scanner = new Scanner(System.in);

  int menu = 0;
  Integer globalId = 1;
  HashMap<Integer, Participant> participantList = new HashMap<Integer, Participant>();


  // Menu
  do {
    System.out.println("------------ MENU ------------");
    System.out.println("1 - Inscrever participante;");
    System.out.println("2 - Mostrar todos participantes inscritos;");
    System.out.println("3 - Cancelar a incricao de um participante;");
    System.out.println("0 - Sair");
    System.out.println("------------------------------");
    System.out.println("Informe a sua opcao: ");
    menu = scanner.nextInt();

    switch (menu) {
        case 1:
                System.out.println(", sua inscricao foi aprovada! Você é o corredor de n. " + globalId + ".");
                
        case 2:
            System.out.println("Lista de participantes por ordem de inscricao: ");            
            break;
        case 3:
            System.out.println("Informe o número de inscricao do participante que você deseja cancelar a participacao: ");
               System.out.println("Participante removido");            
                System.out.println("Participante nao encontrado ou ja foi removido.");
            
        case 0:
            System.out.println("Programa encerrado. ");
    }
  } while(menu != 0);

  }
}