package org.cain.skyblockglass;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public class SkyblockGlass extends JavaPlugin implements Listener {
	
	Logger log = Logger.getLogger("Minecraft");
	
	public void onEnable() {
		Bukkit.getServer().getPluginManager().registerEvents(this, this);
		log.info("[SkyblockGlass] Events registered and plugin enabled!");
	}
	
	public void onDisable() {
		log.info("[SkyblockGlass] Events unregistered and plugin disabled!");
	}
	
	public void onBlockBreak(BlockBreakEvent e) {
		if(e.getBlock().getType() == Material.GLASS) e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), new ItemStack(Material.GLASS, 1));
		return;
	}
}
