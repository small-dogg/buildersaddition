package com.mrh0.buildersaddition.util;

import net.minecraft.world.entity.decoration.PaintingVariant;


public class RegistryUtil {
	public static PaintingVariant createPainting(int w, int h) {
		PaintingVariant p = new PaintingVariant(16*w, 16*h);
		//p.setRegistryName(BuildersAddition.MODID, name);
		//ForgeRegistries.PAINTING_VARIANTS.register(name, p);
		return p;
	}
}
