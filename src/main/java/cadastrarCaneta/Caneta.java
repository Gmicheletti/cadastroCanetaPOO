package cadastrarCaneta;

import java.util.Objects;

public class Caneta implements Controlador { //IMPLEMENTS CONTROLADOR É COMO SE MENCIONA QUE ELE UTILIZA METODOS DA INTERFACE CONTROLADOR
    //INSERIR OS ATRIBUTOS
    private String marca;
    private String modelo;
    private String cor;
    private float ponta;
    private boolean tampada;



    public Caneta(){ //INSERIR O CONSTRUTOR PADRAO, QUE É VAZIO

    }

    //INSERIR OS METODOS DA INTERFACE CONTROLADOR
    @Override
    public void escrever() {
        if(tampada == true){
            System.out.println("Caneta Tampada, não posso escrever!");
        }else {
            System.out.println("Escrevendo");
        }
    }

    @Override
    public void tampar() {
        if(tampada == true){
            tampada = false;
        }else {
            tampada = true;
        }
    }

    @Override
    public void addEditAtributos() {
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setCor(cor);
        this.setPonta(ponta);
        this.setTampada(tampada);
    }

    @Override
    public void status() { //GETS QUE RETORNAM OS DADOS DA CANETA E ENVIAM PARA A CLASSE HOME
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Cor: " + getCor());
        System.out.println("Ponta: " + getPonta());
        System.out.println("Tampada? " + geTampada());
    }


    //INSERIR OS GETS E SETS PARA TODOS OS ATRIBUTOS CRIADOS LA NO INICIO
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public boolean geTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }




    // INSERIR O EQUALS E HASCODE

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Caneta caneta = (Caneta) o;
        return Objects.equals(marca, caneta.marca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca);
    }


    // INSERIR O TOSTRING
    @Override
    public String toString() {
        return "Caneta{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                ", ponta=" + ponta +
                ", tampada=" + tampada +
                '}';
    }
}



