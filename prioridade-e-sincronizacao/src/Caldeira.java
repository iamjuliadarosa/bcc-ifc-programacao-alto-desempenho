
public class Caldeira {
    private int temperatura = 1000;
    private boolean ligada = false;
    private boolean limpa = true;

    public synchronized void ligar() {
        if (!ligada) {
            ligada = true;
            limpa = false;
            System.out.println("Caldeira ligada.");
        }
    }

    public synchronized void alimentar() {
        if (ligada) {
            temperatura += (int) (Math.random() * 200);
            System.out.println("Caldeira alimentada. Temp: " + temperatura);
        }
    }

    public synchronized void limpar() {
        if (!ligada) {
        	limpa= true;
            System.out.println("Caldeira limpa.");
        }
    }

    public synchronized void desligar() {
        if (temperatura >= 1600) {
            ligada = false;
            temperatura = 1000;
            System.out.println("Caldeira desligada! Temperatura crítica.");
        }
    }

    public int getTemperatura() {
        return temperatura;
    }

    public boolean isLigada() {
        return ligada;
    }
    public boolean isLimpa() {
    	return limpa;
    }
}