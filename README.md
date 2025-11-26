# ⚔️ Terminal Quest

> Um RPG de texto desenvolvido em Java para praticar os principios da Programação Orientada a Objetos (POO).

## 📖 Sobre o Projeto
**Terminal Quest** é um jogo de aventura via linha de comando (CLI) onde o jogador cria um herói e explora uma dungeon. O projeto foi desenvolvido para consolidar conceitos, focando em uma arquitetura limpa e escalável.

### Destaques do Código:
* **Sistema de Progressão:** O herói ganha XP ao vencer batalhas. Ao atingir 100 XP, sobe de nível, cura a vida totalmente e ganha atributos permanentes (+Força, +Defesa, +Vida Máxima).
* **Combate Estratégico:** Cálculo de dano baseado em (Força + Sorte) - Defesa Inimiga.
* **Inimigos Variados:** Geração aleatória de monstros (Goblins, Orcs e Trolls) com dificuldades progressivas.
* **Sistema de Recuperação:** Implementação de interface para mecânicas de cura (descanso no acampamento).

## 🚀 Tecnologias e Conceitos
* **Java** (JDK 17+)
* **POO:**
    * **Herança:** Classes `Heroi` e `Monstro` estendem a superclasse `Personagem`.
    * **Polimorfismo:** Sobrescrita do método `atacar()` para lógicas de dano diferentes entre herói e monstros.
    * **Abstração:** Uso de classe abstrata `Personagem` para definir o template de todas as entidades.
    * **Interfaces:** Uso da interface `Curavel` para desacoplar a lógica de recuperação de vida.
    * **Encapsulamento:** Atributos protegidos (`protected`) e privados com acesso via Getters/Setters.
 
## 🧩 Estrutura do Projeto
O código segue a organização por pacotes:

* `Aplicacao`
    * `Jogo.java`: Classe principal contendo o *Game Loop*, menus e lógica de combate e geração aleatória de monstros.
* `entidades`
    * `Personagem.java`: Classe base abstrata com template para todos os tipos de personagem que herdam atributos da classe, metodo abstrato para atacar e lógica de receberDano.
    * `Heroi.java`: Lógica do jogador, incluindo sistema de XP, níveis e cura.
    * `Monstro.java`: atributos simples dos inimigos e logica de ataque com base em sorte.
    * `Curavel.java`: Interface para comportamentos de cura.
---

## 🛠️ Como Executar
Como o projeto utiliza pacotes (`package`), é necessário compilar e rodar a partir da pasta raiz (`src`):

1.  **Clone o repositório:**
    ```bash
    git clone [https://github.com/Carti-1/terminal-quest.git](https://github.com/Carti-1/terminal-quest.git)
    cd terminal-quest/src
    ```

2.  **Compile o código:**
    ```bash
    javac Aplicacao/Jogo.java entidades/*.java
    ```

3.  **Execute o jogo:**
    ```bash
    java Aplicacao.Jogo
    ```
    ## Preview
    <img width="576" height="149" alt="image" src="https://github.com/user-attachments/assets/13133ca0-c836-418c-ad21-666e0291a959" />
    <img width="577" height="177" alt="image" src="https://github.com/user-attachments/assets/9dd74833-3557-4344-8d3a-a774968ef486" />
    <img width="576" height="116" alt="image" src="https://github.com/user-attachments/assets/3f8ab8c4-bce3-446c-9829-8aa518c193ed" />



Desenvolvido para fins de estudo em Java. ☕
