package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.FreddyFazbeareftLegDisplayItem;

public class FreddyFazbeareftLegDisplayModel extends AnimatedGeoModel<FreddyFazbeareftLegDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FreddyFazbeareftLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/freddyfazbearleftleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FreddyFazbeareftLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/freddyfazbearleftleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FreddyFazbeareftLegDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/freddyfazbeartexture.png");
	}
}
