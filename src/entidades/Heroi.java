package entidades;

import java.util.Random;

public class Heroi extends Personagem implements Curavel{
	private int nivel, exp;
	
	public Heroi(String nome, int vida, int forca, int defesa) {
		super(nome, vida, forca, defesa);
		this.nivel = 1;
		this.exp = 0;
		setMaxvida(vida);
	}
	
	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}
	
	public void ganharExp(int exp) {
		this.exp += exp;
		if (this.exp >= 100) {
			this.nivel++;
			this.exp -= 100;
			this.forca += 5;
			this.defesa += 5;
			this.maxvida += 20;
			this.vida = this.maxvida; //Vida cheia ao subir de nível
			System.out.println(getNome() + " subiu para o nível " + this.nivel + "!");
		}
	}
	
	@Override
	public int atacar() { 
		Random dado = new Random();
		int sorte = dado.nextInt(10);
		int ataque = getForca() + sorte;
		return ataque;
	}

	@Override
	public void curar(int quantidade) {
		this.vida += quantidade;
		if (this.vida > this.maxvida) {
			this.vida = this.maxvida;
		}
		System.out.println(getNome() + " foi curado em " + quantidade + " pontos de vida.");
		
	}


}
