//Gravacao e Leitura de Objeto em arquivo
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Write{
    public static void main(String[] args) {
        File arquivo = new File("arquivo.dat");
    
        try {
        FileInputStream fin = new FileInputStream(arquivo);
        ObjectInputStream oin = new ObjectInputStream(fin);
        /*Lendo os objetos de um arquivo e fazendo a
        coercao de tipos*/
        //System.out.println((ArrayList) oin.readObject());
        ArrayList<Email> email = (ArrayList<Email>) oin.readObject();
        oin.close();
        fin.close();
        
        //Uma forma de diferente do for para percorrer vetores
        //for (Email p : email) {
        //    System.out.println(p.getMensagem());
        //}
        System.out.println(email.get(0).getMensagem());
        System.out.println(email.get(1).getMensagem());
        }catch (Exception ex) {
        System.err.println("erro: " + ex.toString());
        }
    } 

}