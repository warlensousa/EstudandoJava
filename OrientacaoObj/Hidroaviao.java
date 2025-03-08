package OrientacaoObj;
public class Hidroaviao extends Barco implements Pilotavel {
    

    @Override
    public void pilotar() {
        System.out.println("Pilotando Hidroavião e depois vai nevegar ele");
        
    }
}