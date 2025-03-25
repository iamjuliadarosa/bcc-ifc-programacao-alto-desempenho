
public class main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		atividade04 contBaixa = new atividade04("Baixa Prioridade", Thread.MIN_PRIORITY);
		atividade04 contAlta = new atividade04("Alta Prioridade", Thread.MAX_PRIORITY);

        contBaixa.start();
        contAlta.start();

        contBaixa.join();
        contAlta.join();

        System.out.println("Main finalizado.");
	}
}