package OrientacaoObj;
public class Carro {
    
    // Propriedade da classe;
    private String modelo;

    // Construtor;
    public Carro(String modelo) {  // (parametro passado no objeto instanciado)
        this.modelo = modelo;  // this.modelo = puxa propriedade acima;
    }


    // Método usado para modificar uma propriedade (privada ou nao)
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Método usado para puxar a propriedade;
    public String getModelo() {
        return this.modelo;
    }


    // Métodos da classe;
    public void carroDoAno() {
        System.out.println(this.modelo + " ele é o carro do Ano");
    }

    public String localizacao() {
        return this.modelo + " ta viajando por SP";
        
    }

    // meotodo privado ou seja so posso acessar ele dentro da classe;
    private void acelerar() {
        System.out.println("Acelerando o carro " + this.modelo);
    }


    public void acessandoMetodoPrivadoAcelerar() {
        acelerar();
    }




}
