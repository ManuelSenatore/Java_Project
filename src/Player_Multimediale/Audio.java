package Player_Multimediale;

import Interfaces.Volume;

	public class Audio extends Player implements Volume {
		
		
	    private int volume;
	    private int durata;

	    public Audio(String _title, int _durata) {
	        super(_title);
	        this.volume = 6;
	        durata = _durata;
	        tipo = "AUDIO";
	    }


	    public void play() {
	        for ( int i = 0; i <= durata; i++ ) {
	            String vol = "";
	            String singleVolume = "!";

	            for ( int l = 0; l <= this.volume; l++ ) {
	                vol = vol + singleVolume;
	            }

	            System.out.println (title + vol  );
	        }

	    }

	    public void alzaVolume(int su) {
	        if( volume + su < 100) {
	            volume = volume + su;
	            System.out.println("Volume al:" + volume);
	            play ();
	        } else {
	            System.out.println ("Volume al massimo! tunz tunz tunz");
	        }
	    }

	    public void abbassaVolume(int giu) {
	        if(volume - giu > 0 ) {
	            volume = volume - giu;
	            System.out.println("Volume al:" + volume);
	            play ();
	        } else {
	            System.out.println ("Volume al minimo! tunz tunz tunz");
	        }
	    }
	}
	
