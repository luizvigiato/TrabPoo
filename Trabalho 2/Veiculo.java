public abstract class Veiculo{
    private String id;
    private int distancia;
    private Roda rodas = new Roda();
    private int qtnRodas;

    public Veiculo(){}

	public Veiculo(String id,int qnt){
        this.id = id;
		this.qtnRodas = qnt;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public int getDistancia(){
        return distancia;
    }

    public boolean movimentar(){
        if(rodas.get()){
            return true;
        } else{
            return false;
        }
    }

}