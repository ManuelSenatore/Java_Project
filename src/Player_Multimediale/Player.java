package Player_Multimediale;

abstract public class Player {

	  protected String title;
	  protected String tipo;

	    public Player(String _title) {
	        title = _title;
	    }

	    protected void play(){};
	    protected void show(){};
	    
	    protected String getTipo() {
	    	return this.tipo;
	    }

}
	
