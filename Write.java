//Gravacao e Leitura de Objeto em arquivo
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Write{
    public ArrayList listaCompleta(){
        File arquivo = new File("arquivo.dat");

        ArrayList<Email> email = new ArrayList<Email>();
    
        try {
        FileInputStream fin = new FileInputStream(arquivo);
        ObjectInputStream oin = new ObjectInputStream(fin);
        /*Lendo os objetos de um arquivo e fazendo a
        coercao de tipos*/
        //System.out.println((ArrayList) oin.readObject());
        email = (ArrayList<Email>) oin.readObject();
        oin.close();
        fin.close();
        
        //Uma forma de diferente do for para percorrer vetores
        //for (Email p : email) {
        //    System.out.println(p.getMensagem());
        //}
        //System.out.println(email.get(0).getMensagem());
        //System.out.println(email.get(1).getMensagem());
        }catch (Exception e) {
            System.err.println("Arquivo não existe, corrompido, ou vazio!");
            try{
                FileOutputStream fout = new FileOutputStream(arquivo);
                ObjectOutputStream oos = new ObjectOutputStream(fout);
                oos.flush();
                oos.close();
                fout.close();
            } catch (Exception s){
                System.out.println("Arquivo não pode ser criado nem lido");
            }
        //System.err.println("erro: " + e.toString());
        }

        return email;
    } 

}