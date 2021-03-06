package ultraemojicombat;

import java.util.Random;

public class Luta {
	private Lutador desafiado;
	private Lutador desafiante;
	private int round;
	private boolean aprovado;
	
	public void marcarLuta(Lutador l1, Lutador l2) {
		if(l1.getCategoria() ==  l2.getCategoria() &&  l1 != l2) {
			this.aprovado = true;
			this.desafiado = l1;
			this.desafiante = l2;
			
		}else {
			this.aprovado = false;
			this.desafiado = null;
			this.desafiante = null;
		}
	}
	
	public void lutar() {
		if(this.aprovado) {
			System.out.println("### DESAFIADO ###");
			this.desafiado.apresentar();
			System.out.println("## DESAFIANTE ###");
			this.desafiante.apresentar();
			
			Random aleatorio =  new Random();
			int vencedor = aleatorio.nextInt(3);
			switch(vencedor) {	
			    case 0:
			    	System.out.println("EMPATE!!!!  ");
			    	this.desafiado.empatarLuta();
			    	this.desafiante.empatarLuta();
			    	break;
			    case 1:
			    	this.desafiado.ganharLluta();
			    	this.desafiante.perderLuta();
			    	System.out.println("Vitoria do " + this.desafiado.getNome());
			    	break;
			    case 2:
			    	
			    	this.desafiante.ganharLluta();
			    	this.desafiante.perderLuta();
			    	System.out.println(" vitoria do " + this.desafiante.getNome());
			    	break;
			
			}
		}else { 
			System.out.println("Sem luta!");
		}
		
	}

	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public int getRound() {
		return round;
	}

	public void setRound(int round) {
		this.round = round;
	}

	public boolean isAprovado() {
		return aprovado;
	}

	public void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}
	
}
