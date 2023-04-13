public class Nodo {
    private Lettera L=null;
    private Nodo n=null;
    public Nodo(){

    }
    public Nodo(Lettera l,Nodo n){
        setL(l);
        setN(n);
    }
    public Nodo(Lettera l){
        setL(l);
    }

    public void setL(Lettera l) {
        L = l;
    }

    public void setN(Nodo n) {
        this.n = n;
    }

    public Nodo getN() {
        return n;
    }

    public Lettera getL() {
        return L;
    }
}
