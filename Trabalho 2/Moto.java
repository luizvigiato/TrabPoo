public class Moto extends Motor{
    public static final int r = 2;
    public Moto(int x){
        super("M"+Integer.toString(x),r,(float)1.5);
    }
}