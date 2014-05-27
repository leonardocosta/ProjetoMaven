package foo;

import org. junit.*;

public class AppTest {
	
	  App p = new App();
	@Test
    public void testApp()
    {
        Assert.assertTrue( true );
    }
    @Test
	public void TestPontuacao() {
		int resultado = p.pontuacao(10);
		Assert.assertEquals("Deve ser igual", resultado, 10);
	}
    @Test
  	public void TestIdade() {
  		boolean idade = p.idade(10);
  		Assert.assertFalse("deve torna falso",idade);
  	}
    
    @Test
    public void TestNome(){
    	p.adicionaNome("julio");
    	String n = p.getNome();
    	Assert.assertEquals(n, "julio");
    	
    	p.adicionaNome("Marcos");
    	String n2 = p.getNome();
    	Assert.assertEquals(n2, "julio");
    }
    @Test
    public void TestFimJogo(){
    	p.StatusJogo(false);
    	Assert.assertFalse(p.getStatusJogo());
    }
       
   

}
