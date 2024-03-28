package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.FreddyFazbearRightArmDisplayItem;

public class FreddyFazbearRightArmDisplayModel extends AnimatedGeoModel<FreddyFazbearRightArmDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FreddyFazbearRightArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/freddyfazbearrightarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FreddyFazbearRightArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/freddyfazbearrightarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FreddyFazbearRightArmDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/freddyfazbeartexture.png");
	}
}
