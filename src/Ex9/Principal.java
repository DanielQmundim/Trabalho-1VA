package Ex9;
public class Principal {
	public static void main(String[] args) {
		Televisao tv = new Televisao();
		tv.ligarTv();
		// subir 5 canais
		for (int i = 0; i < 5; i++) {
			tv.subirCanal();
		}
		// colocar o volume no máx
		while (tv.getVolume() < 10) {
			tv.aumentarVolume();
		}
		tv.mostarStatus();
		// descer até o 1 canal
		while(tv.getCanal() != 1){
			tv.descerCanal();
		}
		// reduzir 2 pontos volume
		for (int i = 0; i < 2; i++) {
			tv.reduzirVolume();
		}
		tv.mostarStatus();
	}
}