package cadastrarCaneta;

import java.util.Scanner;

public class Home {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int menu;
        Caneta caneta = null; //INICIA O OBJETO CANETA VAZIO

        do{

            System.out.println("-----------MENU---------");
            System.out.println("Escolha  uma opção: ");
            System.out.println("[1] - Cadastrar Caneta\n[2] - Status Caneta\n[3] - Editar Caneta");
            menu = scn.nextInt();

            if(menu == 1){

                caneta = new Caneta(); //CRIA O OBJETO CANETA SE O USUARIO ENTRA NA OPCAO 1

                System.out.println("----------CADASTRAR CANETA----------");
                System.out.print("Insira a marca da caneta: ");
                String marca = scn.next();
                System.out.print("Insira o modelo da caneta: ");
                String modelo = scn.next();
                System.out.print("Insira a cor da caneta: ");
                String cor = scn.next();
                System.out.print("Insira a ponta da caneta:  (Ex: 0,5) ");
                float ponta = scn.nextFloat();
                System.out.print("A caneta está tampada? (Ex: true/false) ");
                boolean tampada = scn.nextBoolean();

                caneta.setMarca(marca); //UTILIZA OS SET DA CLASSE CANETA PARA INSERIR OS VALORES AOS ATRIBUTOS
                caneta.setModelo(modelo);
                caneta.setCor(cor);
                caneta.setPonta(ponta);
                caneta.setTampada(tampada);
                System.out.println("Caneta Cadastrada!");

            } else if (menu == 2) {

                System.out.println("----------STATUS----------"); //VERIFICA SE EXISTE ALGUMA CANETA CADASTRADA, SE TIVER, RETORNA OS ATRIBUTOS JA CADASTRADOS
                if(caneta == null){
                    System.out.println("Não existe caneta cadastrada");
                }else{
                    caneta.status();
                }

            } else if (menu == 3) {

                System.out.println("----------EDITAR CANETA----------"); // VERIFICA SE EXISTE ALGUMA CANETA CADASTRADA, SE TIVER, DISPONIBILIZA A POSSIBILIDADE DE EDITAR OS DADOS
                if(caneta == null){
                    System.out.println("Não existe caneta cadastrada");
                }else{
                    System.out.print("Insira a marca da caneta: ");
                    String marca = scn.next();
                    System.out.print("Insira o modelo da caneta: ");
                    String modelo = scn.next();
                    System.out.print("Insira a cor da caneta: ");
                    String cor = scn.next();
                    System.out.print("Insira a ponta da caneta:  (Ex: 0,5) ");
                    float ponta = scn.nextFloat();
                    System.out.print("A caneta está tampada? (Ex: true/false) ");
                    boolean tampada = scn.nextBoolean();

                    caneta.setMarca(marca);
                    caneta.setModelo(modelo);
                    caneta.setCor(cor);
                    caneta.setPonta(ponta);
                    caneta.setTampada(tampada);
                    System.out.println("Caneta Editada!");
                }

            } else{
                System.out.println("Opção Invalida");
            }
        }while (menu != 0);


    }



}
