
public class LigarCaldeira extends Thread {
    private Caldeira caldeira;

    public LigarCaldeira(Caldeira caldeira) {
        this.caldeira = caldeira;
        this.setPriority(Thread.MIN_PRIORITY);
    }

    public void run() {
        caldeira.ligar();
    }
}
