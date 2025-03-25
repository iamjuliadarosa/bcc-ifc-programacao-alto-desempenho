
public class DesligarCaldeira extends Thread {
    private Caldeira caldeira;

    public DesligarCaldeira(Caldeira caldeira) {
        this.caldeira = caldeira;
        this.setPriority(Thread.MAX_PRIORITY);
    }

    public void run() {
        while (caldeira.isLigada()) {
            if (caldeira.getTemperatura() >= 1600) {
                caldeira.desligar();
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}