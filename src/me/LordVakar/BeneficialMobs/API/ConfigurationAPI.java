package me.LordVakar.BeneficialMobs.API;

import java.io.File;
import java.io.IOException;

import me.LordVakar.BeneficialMobs.BeneficialMobs;

import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.YamlConfiguration;

public class ConfigurationAPI 
{
	BeneficialMobs main;
	
	public static File folder = new File("plugins/BeneficialMobs");
	public static File mobFile = new File("plugins/BeneficialMobs" + "/" + "BeneficialMobs" + ".yml");
	public static YamlConfiguration mobFileConfig = YamlConfiguration.loadConfiguration(mobFile);
	
	public ConfigurationAPI() {
		
	}
	
	public ConfigurationAPI(BeneficialMobs plugin) {
		this.main = (BeneficialMobs) BeneficialMobs.pl;
	}
	
	public void setUpMobConfig() {
		String configPath = "MobData.Default";
		if (!folder.exists()) {
			folder.mkdir();
			try {
				mobFile.createNewFile();
				mobFileConfig.set(configPath + "mobName", "Default");
				mobFileConfig.set(configPath + "mobType", MobEnum.ZOMBIE.toString());
				mobFileConfig.set(configPath + "mobLocation", "world, x, y, z");
				mobFileConfig.set(configPath + "invulnerable", true);
				mobFileConfig.set(configPath + "stayInPlace", true);
				mobFileConfig.save(mobFile);
				mobFileConfig.load(mobFile);
			} catch (IOException e) {
				e.printStackTrace();
			} catch (InvalidConfigurationException e) {
				e.printStackTrace();
			}
		}
		else if(!mobFile.exists()) {
			try {
				mobFile.createNewFile();
				mobFileConfig.set(configPath + "mobName", "Default");
				mobFileConfig.set(configPath + "mobType", MobEnum.ZOMBIE.toString());
				mobFileConfig.set(configPath + "mobLocation", "world, x, y, z");
				mobFileConfig.set(configPath + "invulnerable", true);
				mobFileConfig.set(configPath + "stayInPlace", true);
				mobFileConfig.save(mobFile);
				mobFileConfig.load(mobFile);
			} catch (IOException e) {
				e.printStackTrace();
			} catch (InvalidConfigurationException e) {
				e.printStackTrace();
			}
		}
		else if(mobFile.exists()) {
			//Do Nothing
		}
	}
	
	public boolean isMobConfigSetup() {
		if (mobFile.exists()) {
			return true;
		}
		else {
			return false;
		}
	}
}
