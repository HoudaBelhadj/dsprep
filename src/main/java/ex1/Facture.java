package ex1;

public class Facture {
    double f=0;
    double getFraisTransport(double montant){
        if(montant<600){
            f=45;
        }
        else{
            f=0;
        }
        return f;
    }
}
