public abstract class Motor extends Veiculo{
    private static float tanque;
    private float media;

    public Motor(float media){
        tanque = (float)5;
        this.media = media;
    }

    public Motor(String id,int qnt, float media){
        super(id,qnt);
        this.media = media;
    }

    public static void setTanque(Float litros){
        tanque += litros;
    }

    public void motorMover(){
        if((tanque - this.media) > 0 && movimentar()){
            tanque -= this.media;
            setDistancia();            
        } else {
            System.out.println("Tanque insuficiente ou pneu murcho (comece tentando calibrar o pneu)!");
        }
    }

    public static void testeClasse(float media){
        setTanque(media);
    }
}