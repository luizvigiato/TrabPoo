public abstract class Motor extends Veiculo{
    private float tanque;
    private float media;

    public Motor(float media){
        this.tanque = (float)5;
        this.media = media;
    }

    public Motor(String id,int qnt, float media){
        super(id,qnt);
        this.media = media;
    }

    public void abastecerVeiculo(float x){
        this.tanque += x;
    }
}