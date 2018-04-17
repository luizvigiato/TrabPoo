import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;

public class Read{
    public static void main(String[] args){
        ArrayList<Email> email = new ArrayList<Email>();

        Email novo = new Email("user","receveir","post","you fuck");
        Email novo2 = new Email("user","receveir","post","you fuck2");

        email.add(novo);
        email.add(novo2);

        System.out.println(email.get(0).getMensagem());

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