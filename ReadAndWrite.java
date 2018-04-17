import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ReadAndWrite{

    Email email = new Email();

    public void gravaArquivo(){

        Email novasd = new Email("luiz","saida","assunto","blablalba");

        File arq = new File("arquivo.txt");
        try{
            FileOutputStream found = new FileOutputStream(arq);
            ObjectOutputStream oss = new ObjectOutputStream(found);

            oss.writeObject(novasd);
            found.close();
            oss.close();
        }  catch (Exception e){

        }

    }

    public void caixaDeEntrada(String nome){
        
        File arq = new File("arquivo.dat");
        try{
            System.out.println("fuckkkk");
            FileInputStream found = new FileInputStream(arq);
            ObjectInputStream oss = new ObjectInputStream(found);

            //System.out.println(readObject());
            Email devolve = (Email)oss.readObject();
            System.out.println(devolve);
            

            // for(int i = 0; i < devolve.size(); i++) {   
            //     System.out.print(devolve.get(i));
            // }  

            //found.close();
            //oss.close();
        }  catch (Exception e){

        }
    }


}