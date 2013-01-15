public class AntiFreezListener extends PluginListener {
	boolean icemelt;
	boolean frost;
	boolean snowmelt;
	PropertiesFile props = new PropertiesFile(
			"plugins/config/AntiFreez.properties");

	public void reload() {
		this.icemelt = this.props.getBoolean("DisAllow-(ice)Melt", false);
		this.snowmelt = this.props.getBoolean("DisAllow-(snow)Melt", false);
		this.frost = this.props.getBoolean("DisAllow-Frost", false);
	}

	public boolean onBlockUpdate(Block Oblock, int newBlockId) {
		switch (Oblock.getType()) {
		case 79:
			if (newBlockId == 8 || newBlockId == 9) {
				return this.icemelt;
			}
		case 9:
			if (newBlockId == 79) {
				return this.frost;
			}
		case 78:
			if (newBlockId == 0) {
				return this.snowmelt;
			}
		}
		return false;
	}
}
