import java.util.Scanner;    

public class ContaTerminal  {

    public static void main(String[] args) {
        Double saldo = 237.48;

        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = scannerObj.nextLine();
        System.out.println("Digite a sua agência: ");
        String agencia = scannerObj.nextLine();
        System.out.println("Digite o número da sua agência ");
        Integer numero = scannerObj.nextInt();
        
        System.out.println("Olá " + nome + " da agência " + agencia + " com o número " + numero + ". O seu saldo é: R$" + saldo + "!");

        scannerObj.close();
    }
}
