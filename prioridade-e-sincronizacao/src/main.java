
public class main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*
		atividade04 contBaixa = new atividade04("Baixa Prioridade", Thread.MIN_PRIORITY);
		atividade04 contAlta = new atividade04("Alta Prioridade", Thread.MAX_PRIORITY);

        contBaixa.start();
        contAlta.start();

        contBaixa.join();
        contAlta.join();

        System.out.println("Main finalizado.");
        //*/
		///*
		Caldeira caldeira = new Caldeira();

        LigarCaldeira ligar = new LigarCaldeira(caldeira);
        AlimentarCaldeira alimentar = new AlimentarCaldeira(caldeira);
        LimparCaldeira limpar = new LimparCaldeira(caldeira);
        DesligarCaldeira desligar = new DesligarCaldeira(caldeira);

        ligar.start();
        alimentar.start();
        desligar.start();
        limpar.start();
        
        ligar.join();
        alimentar.join();
        desligar.join();
        limpar.join();

        System.out.println("Main finalizado.");
        //*/
	}
}