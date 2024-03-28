package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.FreddyFazbearTorsoDisplayItem;

public class FreddyFazbearTorsoDisplayModel extends AnimatedGeoModel<FreddyFazbearTorsoDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FreddyFazbearTorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/freddyfazbeartorso.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FreddyFazbearTorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/freddyfazbeartorso.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FreddyFazbearTorsoDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/freddyfazbeartexture.png");
	}
}
