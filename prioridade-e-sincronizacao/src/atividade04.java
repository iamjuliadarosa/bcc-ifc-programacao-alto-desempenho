public class atividade04 extends Thread {
    private String nome;

    public atividade04(String nome, int prioridade) {
        this.nome = nome;
        this.setPriority(prioridade);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(nome + ": " + i);
            try {
                if (Math.random() > 0.7) Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}