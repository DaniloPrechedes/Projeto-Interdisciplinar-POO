package projetointerdisciplinar;
import java.awt.*;
import java.io.*;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.*;

public class ProjetoInterdisciplinar {

    private ArrayList figuras = new ArrayList();

    public static void main(String[] args) {
        new ProjetoInterdisciplinar();
    }

    public ProjetoInterdisciplinar() {
        carregar("C:/temp/figuras.dat", figuras);
        menu();
    }

    public void menu() {
        int option = 0;
        do {
            {
                option = Integer.parseInt(JOptionPane.showInputDialog(null, "Selecione a opção:\n"
                        + "1 - Equação 2° Grau\n"
                        + "2 - Cilindro\n"
                        + "3 - Cone\n"
                        + "4 - Paralelepipedo\n"
                        + "5 - Quadrado\n"
                        + "6 - Triangulo\n"
                        +"7 - Exibir figuras\n"
                        + "0 - Sair", "Selecione", JOptionPane.WARNING_MESSAGE));
                switch (option) {
                    case 1:
                        equacao2grau();
                        break;
                    case 2:
                        clindro();
                        break;
                    case 3:
                        cone();
                        break;
                    case 4:
                        paralelepipedo();
                        break;
                    case 5:
                        quadrado();
                        break;
                    case 6:
                        triangulo();
                        break;
                    case 7:
                        exibirFiguras();
                        break;
                    case 0:
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida", "Inválido", JOptionPane.ERROR_MESSAGE);
                        break;
                }
            }
        } while (option != 0);
        salvar("C:/temp/figuras.dat", figuras);
    }

    public void equacao2grau() {
        float a, b, c;
        JOptionPane.showMessageDialog(null, "Calcule a fórmula de Baskhara");
        a = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor de A: ", "A", JOptionPane.QUESTION_MESSAGE));
        b = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor de B: ", "B", JOptionPane.QUESTION_MESSAGE));
        c = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor de C: ", "C", JOptionPane.QUESTION_MESSAGE));
        figuras.add(new Equacao2grau(a, b, c));

    }

    public void clindro() {
        float x, y, altura, raio;
        JOptionPane.showMessageDialog(null, "Calcule o volume do Cone");
        x = Float.parseFloat(JOptionPane.showInputDialog(null, "Valor de X", "X", JOptionPane.QUESTION_MESSAGE));
        y = Float.parseFloat(JOptionPane.showInputDialog(null, "Valor de Y", "Y", JOptionPane.QUESTION_MESSAGE));
        altura = Float.parseFloat(JOptionPane.showInputDialog(null, "Valor da Altura", "Altura", JOptionPane.QUESTION_MESSAGE));
        raio = Float.parseFloat(JOptionPane.showInputDialog(null, "Valor do raio", "Raio", JOptionPane.QUESTION_MESSAGE));
        figuras.add(new Cilindro(altura, raio, x, y));

    }

    public void cone() {
        float x, y, altura, raio;
        JOptionPane.showMessageDialog(null, "Calcule o volume do Cone");
        x = Float.parseFloat(JOptionPane.showInputDialog(null, "Valor de X", "X", JOptionPane.QUESTION_MESSAGE));
        y = Float.parseFloat(JOptionPane.showInputDialog(null, "Valor de Y", "Y", JOptionPane.QUESTION_MESSAGE));
        altura = Float.parseFloat(JOptionPane.showInputDialog(null, "Valor da Altura", "Altura", JOptionPane.QUESTION_MESSAGE));
        raio = Float.parseFloat(JOptionPane.showInputDialog(null, "Valor do raio", "Raio", JOptionPane.QUESTION_MESSAGE));
        figuras.add(new Cone(altura, raio, x, y));

    }

    public void paralelepipedo() {
        float x, y, altura, comprimento, largura;
        JOptionPane.showMessageDialog(null, "Calcule o volume do Paralelepipedo");
        x = Float.parseFloat(JOptionPane.showInputDialog(null, "Valor de X", "X", JOptionPane.QUESTION_MESSAGE));
        y = Float.parseFloat(JOptionPane.showInputDialog(null, "Valor de Y", "Y", JOptionPane.QUESTION_MESSAGE));
        altura = Float.parseFloat(JOptionPane.showInputDialog(null, "Valor da Altura", "Altura", JOptionPane.QUESTION_MESSAGE));
        comprimento = Float.parseFloat(JOptionPane.showInputDialog(null, "Valor do comprimento", "Comprimento", JOptionPane.QUESTION_MESSAGE));
        largura = Float.parseFloat(JOptionPane.showInputDialog(null, "Valor da largura", "Largura", JOptionPane.QUESTION_MESSAGE));
        figuras.add(new Paralelepipedo(comprimento, largura, altura, x, y));

    }

    public void quadrado() {
        float x, y, ladoa, ladob;
        JOptionPane.showMessageDialog(null, "Calcule a Área e o Perimetro do Quadrado");
        x = Float.parseFloat(JOptionPane.showInputDialog(null, "Valor de X", "X", JOptionPane.QUESTION_MESSAGE));
        y = Float.parseFloat(JOptionPane.showInputDialog(null, "Valor de Y", "Y", JOptionPane.QUESTION_MESSAGE));
        ladoa = Float.parseFloat(JOptionPane.showInputDialog(null, "Valor do Lado A", "Lado A", JOptionPane.QUESTION_MESSAGE));
        ladob = Float.parseFloat(JOptionPane.showInputDialog(null, "Valor do Lado B", "Lado B", JOptionPane.QUESTION_MESSAGE));
        figuras.add(new Quadrado(ladoa, ladob, x, y));

    }

    public void triangulo() {
        float x, y, altura, base;
        JOptionPane.showMessageDialog(null, "Calcule a Área e o Perimetro do Triangulo");
        x = Float.parseFloat(JOptionPane.showInputDialog(null, "Valor de X", "X", JOptionPane.QUESTION_MESSAGE));
        y = Float.parseFloat(JOptionPane.showInputDialog(null, "Valor de Y", "Y", JOptionPane.QUESTION_MESSAGE));
        altura = Float.parseFloat(JOptionPane.showInputDialog(null, "Valor do Lado A", "Lado A", JOptionPane.QUESTION_MESSAGE));
        base = Float.parseFloat(JOptionPane.showInputDialog(null, "Valor do Lado B", "Lado B", JOptionPane.QUESTION_MESSAGE));
        figuras.add(new Triangulo(altura, base, x, y));

    }
    
    public void exibirFiguras(){
        String cadastradas="";
        JOptionPane.showMessageDialog(null,"Figuras Cadastradas","Figuras",JOptionPane.QUESTION_MESSAGE);
        for(int i=0;i<figuras.size();i++){
            cadastradas+=(figuras.get(i).toString())+"\n";
        }
        //JOptionPane.showMessageDialog(null,"Figuras\n"+cadastradas,"Figuras",JOptionPane.QUESTION_MESSAGE);
        
        JTextArea textArea = new JTextArea("Figuras\n"+cadastradas);
JScrollPane scrollPane = new JScrollPane(textArea);  
textArea.setLineWrap(true);  
textArea.setWrapStyleWord(true); 
scrollPane.setPreferredSize( new Dimension( 500, 500 ) );
JOptionPane.showMessageDialog(null, scrollPane, "dialog test with textarea",JOptionPane.YES_NO_OPTION);
    }
    
    public boolean salvar (String filename, ArrayList arrlist) {
            //Este método gravará no arquivo filename o conteúdo de arrlist
            try{
                FileOutputStream fos = new FileOutputStream(filename); 
                ObjectOutputStream out = new ObjectOutputStream(fos);
                for (int i=0; i<arrlist.size(); i++) {
                    out.writeObject( arrlist.get(i) );  //gravamos o objeto no arquivo
                }
                out.close();
                fos.close();
            } catch(Exception ex){
                   JOptionPane.showMessageDialog(null, "Erro salvando objetos... " + ex.getMessage());
                   return false; //se deu algum erro, retornaremos false
            }
            return true; //deu tudo certo, retornaremos true
    } //fim do método salvar

    public boolean carregar (String filename, ArrayList arrlist) {
            //Este método carrega os objetos serializados gravados em 'filename' no vetor arrlist
            FileInputStream fis;
            ObjectInputStream in;       
            try{
                fis = new FileInputStream(filename);
                in = new ObjectInputStream(fis);
                arrlist.clear(); //esvaziamos o ArrayList
                boolean sair = false; 
                do {                
                     try {
                         Object info = in.readObject(); // lê um objeto do arquivo
                         arrlist.add(info); // adiciona na lista o objeto lido
                      }
                      catch (EOFException normalEof) { 
                         // EOF (end of file), situação normal => acabaram os objetos
                         sair=true;
                      }            
                } while (!sair);            
                in.close();
                fis.close();
            } catch(Exception e){
                JOptionPane.showMessageDialog(null, "Erro carregando objetos... " + e.getMessage());
                return false;
            }
            return true;     
    } //fim do método carregar
}
