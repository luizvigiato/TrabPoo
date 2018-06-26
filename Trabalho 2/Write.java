import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;

public class Write{
    public static void gravarTudo(ArrayList<Veiculo> email){
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