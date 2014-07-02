package me.LordVakar.BeneficialMobs.API;

import org.bukkit.entity.EntityType;

public enum MobEnum {
	
	BAT(EntityType.BAT),
	BLAZE(EntityType.BLAZE), 
	CAVE_SPIDER(EntityType.CAVE_SPIDER),
	CHICKEN(EntityType.CHICKEN), 
	COW(EntityType.COW),
	CREEPER(EntityType.CREEPER),
	ENDER_DRAGON(EntityType.ENDER_DRAGON),
	ENDERMAN(EntityType.ENDERMAN),
	GHAST(EntityType.GHAST),
	GIANT(EntityType.GIANT),
	HORSE(EntityType.HORSE),
	IRON_GOLEM(EntityType.IRON_GOLEM),
	MAGMA_CUBE(EntityType.MAGMA_CUBE),
	MUSHROOM_COW(EntityType.MUSHROOM_COW),
	OCELOT(EntityType.OCELOT),
	PIG(EntityType.PIG),
	PIG_ZOMBIE(EntityType.PIG_ZOMBIE),
	PLAYER(EntityType.PLAYER),
	SHEEP(EntityType.SHEEP),
	SILVERFISH(EntityType.SILVERFISH),
	SKELETON(EntityType.SKELETON),
	SLIME(EntityType.SLIME),
	SNOWMAN(EntityType.SNOWMAN),
	SPIDER(EntityType.SPIDER),
	SQUID(EntityType.SQUID),
	VILLAGER(EntityType.VILLAGER),
	WITCH(EntityType.WITCH),
	WITHER(EntityType.WITHER),
	WOLF(EntityType.WOLF),
	ZOMBIE(EntityType.ZOMBIE);
	
	EntityType enttype;

	private MobEnum(EntityType enttype) {
		this.enttype = enttype;
	}
}
