package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.WitheredBonnieTorsoDisplayItem;

public class WitheredBonnieTorsoDisplayModel extends AnimatedGeoModel<WitheredBonnieTorsoDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WitheredBonnieTorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/witheredbonnietorso.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredBonnieTorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/witheredbonnietorso.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredBonnieTorsoDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/witheredbonnietexture.png");
	}
}
