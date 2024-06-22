package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.ClosetFoxyAttackDisplayItem;

public class ClosetFoxyAttackDisplayModel extends AnimatedGeoModel<ClosetFoxyAttackDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ClosetFoxyAttackDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/closetedfox2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ClosetFoxyAttackDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/closetedfox2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ClosetFoxyAttackDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/closetedfoxy.png");
	}
}
