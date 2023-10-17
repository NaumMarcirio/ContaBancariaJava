import java.util.Scanner;

public class contaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite seu nome Completo: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o tipo da conta: ");
        String tipoConta = scanner.nextLine();
        System.out.println("Digite o saldo da conta: ");
        Double saldoConta = scanner.nextDouble();

        System.out.println(String.format("""
                **************************************
                
                Dados Iniciais do Cliente
                
                Nome Completo: %s
                Tipo Conta: %s
                Saldo Conta: %.2f
                
                **************************************
                
                """,nome,tipoConta,saldoConta));

        String menu = ("""
                OPERAÇÕES 
                
                1 - Consultar Saldos
                2 - Receber Valor
                3 - Tranferir Valor
                4 - Sair                                  
                """);


        int opcao = 0;

        while(opcao != 4){
            System.out.println(menu);
            opcao = scanner.nextInt();

            switch(opcao){
                case 1:
                    System.out.println(String.format("O Saldo Atual da conta é: %.2f", saldoConta));
                    break;
                case 2:
                    System.out.println("Qual o Valor que você deseja Receber: ");
                    Double valorRecebido = scanner.nextDouble();
                    saldoConta += valorRecebido;
                    System.out.println(String.format("O Saldo Atual da conta é: %.2f", saldoConta));
                    break;
                case 3:
                    System.out.println("Qual o Valor que você deseja Transferir: ");
                    double valorParaTranferir = scanner.nextDouble();
                    if(valorParaTranferir > saldoConta){
                        System.out.println("SALDO INSUFICIENTE NA CONTA PARA TRANSFERÊNCIA");
                        break;
                    }else{
                        saldoConta -= valorParaTranferir;
                        System.out.println(String.format("O Saldo Atual da conta é: %.2f", saldoConta));
                        break;
                    }
                case 4:
                    break;
                default:
                    System.out.println("OPÇÃO INVÁLIDA !!!");
                    break;
            }



        }

    }
}
