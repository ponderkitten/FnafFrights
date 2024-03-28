package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.WitheredBonnieBlockDisplayItem;

public class WitheredBonnieBlockDisplayModel extends AnimatedGeoModel<WitheredBonnieBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WitheredBonnieBlockDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/witheredbonnieblock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredBonnieBlockDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/witheredbonnieblock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredBonnieBlockDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/witheredbonnietexture.png");
	}
}
