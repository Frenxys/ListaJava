public class Lettera {
    private char lettera;
    public Lettera(char lettera){
        setLettera(lettera);
    }

    public void setLettera(char lettera) {
        this.lettera = lettera;
    }

    public char getLettera() {
        return lettera;
    }

    @Override
    public String toString() {
        return String.valueOf(lettera);
    }
}
