public class Main {
    public static void main(String[] args) {
        Testa lista=new Testa();
        lista.aggiungiNodoAllaFine();
        lista.aggiungiNodoAllaFine();
        lista.aggiungiNodoAllaFine();
        System.out.println("elementi:"+lista.getNumeroelementi());
        lista.settaLetteraDataPosizione(1, 'A');
        lista.settaLetteraDataPosizione(3,'C');
        lista.settaLetteraDataPosizione(2,'A');
        lista.stampaNodi();
        lista.contaLettereDataLettera('A');
    }
}