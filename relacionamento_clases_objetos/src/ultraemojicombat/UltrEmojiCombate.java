package ultraemojicombat;

public class UltrEmojiCombate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lutador lutador[] = new Lutador[6];
		
		lutador[0]  = new Lutador( "Pretty Boy", "Fraça", 31, 1.75f, 90.9f, 11, 2,1);
		
		 lutador[1] = new Lutador("Putcript",  "Brasl", 29, 1.68f, 90.9f, 12, 2, 3);
		
		 lutador [2] = new Lutador("Dead Code", "Australia", 35, 1.93f, 91.6f, 13, 0, 1);
		 
		 lutador[3] = new Lutador("UFOCOBOL", "EUA", 39, 1.81f, 150.5f, 12, 2, 4);
		 
		 //lutador[0].status();
		 //lutador[1].status();
		 
		 lutador[0].apresentar();
		 lutador[1].apresentar();
		 
		 Luta ufc = new Luta();
		 ufc.marcarLuta(lutador[0], lutador[1]);
		 ufc.lutar();
		 //lutador[0].status();
		//lutador[1].status();
	}

}
