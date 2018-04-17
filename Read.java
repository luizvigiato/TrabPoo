import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Read{
    public static void main(String[] args){
        Email[] email = new Email[3];
        email[1] = new Email("in","out","puta","quepariu");
        email[0] = new Email("in","out","puta","quepariu");
        email[2] = new Email("in","out","puta","quepariu");

        File arq = new File("arquivo.dat");
        try{
            FileOutputStream fout = new FileOutputStream(arq);
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            // gravando o vetor de pessoas no arquivo
            oos.writeObject(email);
            oos.flush();
            oos.close();
            fout.close();
        } 
        catch (Exception e){
            System.err.println("erro: " + e.toString());
        }
    }
}