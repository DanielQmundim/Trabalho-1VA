package Ex1;
public class Aluno {

	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	public double nota4;
	public double media;
	private String sala;
	
	Aluno(String nome, String sala, double nota1,double nota2, double nota3, double nota4){
		this.nome = nome;
		this.sala = sala;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota2 = nota3;
		this.nota2 = nota4;
		
	}
	
	public String getnome() {
		return this.nome;
	}
	public String getsala() {
		return this.sala;
	}
	public double getnota1() {
		return this.nota1;
	}
	public double getnota2() {
		return this.nota2;
	}
	public double getnota3() {
		return this.nota3;
	}
	public double getnota4() {
		return this.nota4;
	}
	public double getmedia() {
		return this.media;
	}
	
	public void setnome(String nome) {
		this.nome = nome;
	}
	public void setsala(String sala) {
		this.sala = sala;
	}
	public void setnota1(double nota1) {
		this.nota1 = nota1;
	}
	public void setnota2(double nota2) {
		this.nota2 = nota2;
	}
	public void setnota3(double nota3) {
		this.nota3 = nota3;
	}
	public void setnota4(double nota4) {
		this.nota4 = nota4;
	}
	public void setmedia(double nota1, double nota2, double nota3, double nota4) {
		this.media = ((nota1+nota2+nota3+nota4)/4);
		
		
	}

}

