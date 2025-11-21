package entidades;

public abstract class Personagem {
	private String nome;
	protected int vida, maxvida, forca, defesa;
	

	public Personagem(String nome, int vida, int forca, int defesa) {
		super();
		this.nome = nome;
		this.vida = vida;
		this.forca = forca;
		this.defesa = defesa;
	}
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getVida() {
		return vida;
	}


	public void setVida(int vida) {
		this.vida = vida;
	}


	public int getMaxvida() {
		return maxvida;
	}


	public void setMaxvida(int maxvida) {
		this.maxvida = maxvida;
	}


	public int getForca() {
		return forca;
	}


	public void setForca(int forca) {
		this.forca = forca;
	}


	public int getDefesa() {
		return defesa;
	}


	public void setDefesa(int defesa) {
		this.defesa = defesa;
	}


	public boolean estaVivo() {
		if (vida > 0){
			return true;
		}
		else {
			return false;
		}
	}
	
	public abstract int atacar();
	
	public void receberDano(int dano) {
		int danoFinal = dano - getDefesa();
		if(danoFinal < 0) {
			danoFinal = 0;
		}
		vida -= danoFinal;
		if(vida < 0) {
			vida = 0;
		}
		
		System.out.println(getNome() + " recebeu " + danoFinal + " de dano!");
		System.out.println("Vida restante: " + this.vida);
	}
	
}
