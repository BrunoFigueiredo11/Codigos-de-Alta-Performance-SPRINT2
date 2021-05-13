package sprint2;

public class FilaMensagens {

	public final int N=50;
	Mensagem dados[] = new Mensagem[N];
	int ini, fim, cont;
	
	public void init() {
		ini = fim = cont = 0;
	}
	
	public boolean isEmpty() {
		return cont == 0;
	}
	
	public boolean isFull() {
		return cont == N;
	}
	
	public void enqueue(Mensagem valor) {
		if (isFull())
			System.out.println("Fila cheia");
		else {
			dados[fim] = valor;
			cont++;
			fim = (fim + 1) % N;
		}
	}
	
	public Mensagem dequeue() {
		Mensagem valor = dados[ini];
		ini = (ini + 1) % N;
		cont--;
		return valor;
	}
	
	public Mensagem first() {
		return dados[ini];
	}

	
	public int getN() {
		return N;
	}

	public int getCont() {
		return cont;
	}

}
