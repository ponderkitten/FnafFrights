package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.BonnieBlockDisplayItem;

public class BonnieBlockDisplayModel extends AnimatedGeoModel<BonnieBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BonnieBlockDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/classicbonnieblock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BonnieBlockDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/classicbonnieblock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BonnieBlockDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_bonnie.png");
	}
}
