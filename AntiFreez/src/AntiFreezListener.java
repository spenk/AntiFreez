public class AntiFreezListener extends PluginListener{
	boolean icemelt;
	boolean frost;
	PropertiesFile props = new PropertiesFile("plugins/config/AntiFreez.properties");
	public void reload(){
		icemelt = props.getBoolean("Allow-Ice-Melt", false);
		frost = props.getBoolean("Allow-Water-To-Ice", false);
	}
	
	public boolean onBlockUpdate(Block block){
		
	    if (block.getType() == 79){
	    	if (!icemelt){
	    		return true;
	    		
	    	}else{
	    		return false;
	    	}
	    	} 
	    if (block.getType() == 9){
	    	if (!frost){
	    		return true;
	    	}else{
	    		return false;
	    	}
	    }
		return false;
	    }
	  }