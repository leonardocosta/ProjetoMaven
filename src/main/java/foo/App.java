package foo;

/**
 * Hello world!
 *
 */
public class App {
	
	private String nome;
	private boolean status;
	
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
    }
   

	public int pontuacao(int pontos) {
		return pontos;
		
	}

	public boolean idade(int idade) {
		boolean aceito;
		if(idade> 20){
			return true;
		}
		else{
			return false;
		}
	}
	
	
	public String getNome(){
		
		return nome;
	}


	public void adicionaNome(String nome) {
		this.nome = nome;
		
	}


	public boolean getStatusJogo() {
		return status;
		
	}


	public void StatusJogo(boolean status) {
		this.status = status;
		
	}
}
