
public class LimparCaldeira extends Thread {
    private Caldeira caldeira;

    public LimparCaldeira(Caldeira caldeira) {
        this.caldeira = caldeira;
        this.setPriority(Thread.MIN_PRIORITY);
    }

    public void run() {
        while (true) {
            if (!caldeira.isLigada() && !caldeira.isLimpa()) {
                caldeira.limpar();
            }else if(!caldeira.isLigada() && caldeira.isLimpa()){
            	System.out.println("Thread de limpeza encerrando...");
                return;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}