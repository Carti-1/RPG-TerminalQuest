package entidades;

import java.util.Random;

public class Monstro extends Personagem{
	public Monstro(String nome, int vida, int forca, int defesa) {
		super(nome, vida, forca, defesa);
		setMaxvida(vida);
	}
	
	@Override
	public int atacar() {
		Random dado = new Random();
		int sorte = dado.nextInt(5); 
		int ataque = getForca() + sorte;
		return ataque;
	}

}
