public abstract class Veiculo{
    private String id;
    private int distancia = 0;
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

    public void setDistancia(){
        int c = id.charAt(0);
        // if(c == 66 && movimentar()){
        //     this.distancia += 1;
        // }
        if(movimentar()){
            switch(c){
                case 66:
                    this.distancia += 1;
                    break;
                case 67:
                    this.distancia +=5;
                    break;
                case 70:
                    this.distancia +=10;
                    break;
                case 77:
                    this.distancia +=3;
                    break;
                default:
                System.err.print("D");
            }
        } else{
            System.out.println("Pneu murcho");
        }
    }

    public void calibrar(){
        rodas.set();
    }

    public boolean movimentar(){
        if(rodas.get()){
            return true;
        } else{
            return false;
        }
    }

    public void abastecer(float x){
        Motor.testeClasse(x);
    }

}