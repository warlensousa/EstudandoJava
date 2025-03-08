package OrientacaoObj;
interface Navegavel {

    void navegar();

    default void ancorar() {
        System.out.println("Barco ancorou!");
    }

    
    
     
} 