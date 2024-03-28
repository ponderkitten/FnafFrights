package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.FreddyFazbearLeftArmDisplayItem;

public class FreddyFazbearLeftArmDisplayModel extends AnimatedGeoModel<FreddyFazbearLeftArmDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FreddyFazbearLeftArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/freddyfazbearleftarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FreddyFazbearLeftArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/freddyfazbearleftarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FreddyFazbearLeftArmDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/freddyfazbeartexture.png");
	}
}
