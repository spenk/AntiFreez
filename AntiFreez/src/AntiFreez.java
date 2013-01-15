import java.io.File;
import java.util.logging.Logger;

public class AntiFreez extends Plugin {
	String name = "AntiFreez";
	String version = "1.2";
	String author = " spenk";
	static Logger log = Logger.getLogger("Minecraft");

	public void initialize() {
		AntiFreezListener listener = new AntiFreezListener();
		log.info(this.name + " version " + this.version + " by " + this.author+ " is initialized!");
		etc.getLoader().addListener(PluginLoader.Hook.BLOCK_UPDATE, listener,this, PluginListener.Priority.MEDIUM);
		File f = new File("plugins/config");
		f.mkdir();
		listener.reload();
	}

	public void enable() {
		log.info(this.name + " version " + this.version + " by " + this.author
				+ " is enabled!");
	}

	public void disable() {
		log.info(this.name + " version " + this.version + " is disabled!");
	}
}
