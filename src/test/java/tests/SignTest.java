
package tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class SignTest {
    @Test
    public void testCadastro() throws InterruptedException{
        //Teste desenvolvido em tela maximizada
        System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.get("https://www.organizze.com.br/");
        
        System.out.println("começou");
        navegador.findElement(By.linkText("Comece já!")).click();
        navegador.findElement(By.name("email")).sendKeys( "test3.great@hotmail.com");
        navegador.findElement(By.name("password")).sendKeys( "testaut2020");
        navegador.findElement(By.name("passwordConfirmation")).sendKeys( "testaut2020");
        navegador.findElement(By.name("termsOfuse")).click();
        
        Thread.sleep(3000);

        navegador.findElement(By.cssSelector(".btn.btn-primary.btn-rounded")).click();
        
        Thread.sleep(20000);
        
        navegador.quit();
        System.out.println("Teste Concluido com sucesso");
        
        
        
    }
}
