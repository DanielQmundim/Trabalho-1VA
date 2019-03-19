package Ex1;

public class Principal {
	public static void main (String[] args) {
	
		Aluno AL = new Aluno ("João", "H100",60, 60, 50, 30);
		AL.setmedia(60,60,50,30);
		System.out.println(AL.getmedia());
		
	}
}