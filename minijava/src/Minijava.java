import java.io.*;
import java_cup.runtime.Symbol;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author willa
 */
public class Minijava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {           
            
            /*Comandos (no prompt):
            java -jar jflex-full-1.8.2.jar scanner.flex
            java -jar java-cup-11b.jar -parser Parser -symbols Tokens parser.cup
            */
            
            Runtime r = Runtime.getRuntime();
            Process p;
            //posicionando na pasta src e chamar o flex por linha de comando
            //vai gerar a classe Scanner.java
            /*p = r.exec(new String[]{"java", "-jar", "..\\jflex-full-1.9.1.jar", "..\\scanner.flex"}, null, new File("src\\"));
            System.out.println(p.waitFor());//se ok, a saída será 0*/
            
            //vai gerar as classes Parser.java e Tokens.java
            /*p = r.exec(new String[]{"java","-jar", "..\\java-cup-11b.jar", "-parser", "Parser", "-symbols", "Tokens", "..\\parser.cup"}, null, new File("src\\"));
            System.out.println(p.waitFor());//se ok, a saída será 0*/
            
            
            /*Scanner scanner = new Scanner(new FileReader("entrada.txt"));
            System.out.println("Análise Léxica: Lista de Tokens:");
            Symbol s = scanner.next_token();
            while(s.sym != Tokens.EOF){
                System.out.printf("<%d, %s>\n", s.sym, s.value);
                s = scanner.next_token();
            }
            
            */
            //criando o parser passando o scanner
            Scanner scanner = new Scanner(new FileReader("entrada.txt"));
            Parser parser = new Parser(scanner);        
            parser.parse();
        }
        catch(Exception e) { System.out.println(e.getMessage());}
    }
    
}
