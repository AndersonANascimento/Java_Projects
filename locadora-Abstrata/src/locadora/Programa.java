package locadora;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        int opcao;
        Dvd dvd;
        Cds cds;
        Scanner scan = new Scanner(System.in);
        
        while (true) {            
            System.out.println(" ");
            System.out.println(" ----------------------------------- ");
            System.out.println("Digite 0 para SAIR ou a opção abaixo:");
            System.out.println("1 - Cadastrar DVD");
            System.out.println("2 - Emprestar DVD");
            System.out.println("3 - Devolver DVD");
            System.out.println("4 - Cadastrar CDs");
            System.out.println("5 - Vender CD");
            System.out.println("6 - Imprimir CD");
            System.out.println("Opção: ");
            opcao = scan.nextInt();
            System.out.println(" ----------------------------------- ");
            System.out.println(" ");
            
            if (opcao == 0)
                System.exit(0);
            
            switch(opcao) {
                case 1:
                    dvd = Dvd.getInstance();
                    dvd.cadastrar();
                    break;
                case 2:
                    dvd = Dvd.getInstance();
                    dvd.emprestar();
                    break;
                case 3:
                    dvd = Dvd.getInstance();
                    dvd.devolver();
                    break;
                case 4:
                    cds = Cds.getInstance();
                    cds.cadastrar();
                    break;
                case 5:
                    cds = Cds.getInstance();
                    cds.vender();
                    break;
                case 6:
                    cds = Cds.getInstance();
                    cds.imprimir();
                    break;
            }
        }
    }
}
