
public class AlimentarCaldeira extends Thread {
    private Caldeira caldeira;

    public AlimentarCaldeira(Caldeira caldeira) {
        this.caldeira = caldeira;
        this.setPriority(Thread.MIN_PRIORITY);
    }

    public void run() {
        while (caldeira.isLigada()) {
            caldeira.alimentar();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}