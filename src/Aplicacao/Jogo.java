package Aplicacao;

import java.util.Random;
import java.util.Scanner;
import entidades.Heroi;
import entidades.Monstro;

public class Jogo {
	
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bem-vindo ao Terminal Quest!");
		
		System.out.print("Digite o nome do seu herói: ");
		String nomeHeroi = sc.nextLine();
		
		Heroi meuheroi = new Heroi(nomeHeroi, 100, 20, 10);
		
		System.out.println("Herói criado:" + meuheroi.getNome());
		
		boolean jogoAtivo = true;
		
		while(jogoAtivo && meuheroi.estaVivo()) {
			
			System.out.println("/n---Acampamento---");
			System.out.println("1. Explorar Dungeon");
			System.out.println("2. Descansar (Recuperar vida)");
			System.out.println("3. Ver status do herói");
			System.out.println("4. Sair");
			System.out.println("Digite a opção: ");
			int opcao = sc.nextInt();
			
			switch(opcao) {	
			case 1: 
				batalhar(meuheroi, gerarMonstroAleatorio());
				break;
			case 2:
				meuheroi.curar(10);
				System.out.println(meuheroi.getNome() + " descansou e recuperou vida.");
				break;
			case 3:
				System.out.println("\n---Status do Herói---");
				System.out.println("Nome: " + meuheroi.getNome());
				System.out.println("Vida: " + meuheroi.getVida() + "/" + meuheroi.getMaxvida());
				System.out.println("Força: " + meuheroi.getForca());
				System.out.println("Defesa: " + meuheroi.getDefesa());
				System.out.println("Nível: " + meuheroi.getNivel());
				System.out.println("Experiência: " + meuheroi.getExp() + "/100");
				System.out.println("---------------------");
				break;
			case 4:
				jogoAtivo = false;
				System.out.println("Obrigado por jogar Terminal Quest!");
				System.out.println("Até a próxima aventura, " + meuheroi.getNome() + "!");
				break;
		
			}
			
		}
			
			
		
		sc.close();
		

	}

	
	public static void batalhar(Heroi heroi, Monstro monstro) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Um " + monstro.getNome() + " apareceu!");
		
		while(heroi.estaVivo() && monstro.estaVivo()) {
			System.out.println("\n" + heroi.getNome() + " - Vida: " + heroi.getVida());
			System.out.println(monstro.getNome() + " - Vida: " + monstro.getVida());
			System.out.println("1. Atacar");
			System.out.println("2. Fugir");
			System.out.println("/nEscolha sua ação: ");
			
			int escolha = sc.nextInt();
			
			if (escolha == 1) {		
				//Turno do Herói
			    int danoDoHeroi = heroi.atacar();
			    monstro.receberDano(danoDoHeroi);

			    //Turno do Monstro
			    if (monstro.estaVivo()) {
			    	System.out.println("\nO " + monstro.getNome() + " contra-ataca!");
			        int danoMonstro = monstro.atacar();
			        heroi.receberDano(danoMonstro);
			        
			        if (!heroi.estaVivo()) {
			            System.out.println(heroi.getNome() + " foi derrotado pelo " + monstro.getNome() + ", a dungeon venceu!");
			        }
			       
			    }
			    // Resultados da batalha
			    else {
			        System.out.println(heroi.getNome() + " derrotou o " + monstro.getNome() + "!");
			        heroi.ganharExp(50);
			        System.out.println(heroi.getNome() + " ganhou 50 pontos de experiência.");
			    	} 
				}
				else if (escolha == 2) {
				System.out.println("Você fugiu da batalha!");
				break;
				}
				else {
				System.out.println("Opção inválida! Perdeu o turno de bobeira!");
					}
			
			} 
		}
		
		public static Monstro gerarMonstroAleatorio() {
			Random rand = new Random();
			int tipo = rand.nextInt(3);
			switch(tipo) {
			case 0:
				return new Monstro("Goblin", 50, 15, 5);
			case 1:
				return new Monstro("Orc", 80, 20, 10);
			case 2:
				return new Monstro("Troll", 120, 25, 15);
			default:
				return new Monstro("Goblin", 50, 15, 5);
							
		}
	}
}
