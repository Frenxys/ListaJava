public class Testa {
    private Nodo primo=null;
    private int numeroelementi=0;
    public Testa(){

    }
    public void stampaNodi(){
        Nodo n=primo;
        System.out.println("NODI:");
        for(int i=1; i<numeroelementi+1; i++){
            System.out.println(i+" nodo)= "+n.getL());
            n=n.getN();
        }
    }
    public void contaLettereDataLettera(char lettera){
        int numero=0;
        Nodo n=primo;
        while(n.getN()!=null){
            if(n.getL()!=null){
                if(n.getL().getLettera()==lettera){
                    numero++;
                }
            }

            n=n.getN();
        }
        System.out.println("ci sono "+numero+" nodi con la lettera:"+lettera);
    }
    public void settaLetteraDataPosizione(int pos,char lettera){ //il nodo primo è considerato come posizione 1
        Nodo n=primo;
        for(int i=1; i<pos; i++){
            n=n.getN();
        }
        n.setL(new Lettera(lettera));
    }

    public void aggiungiNodoAllaFine(){
        if(primo!=null){
            Nodo n=primo;
            while(n.getN()!=null){
                n=n.getN();
            }
            n.setN(new Nodo());

        }else{
            primo=new Nodo();
        }
        numeroelementi++;
    }

    public Nodo getPrimo() {
        return primo;
    }

    public int getNumeroelementi() {
        return numeroelementi;
    }
}
