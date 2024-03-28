package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.WitheredBonnieRightArmDisplayItem;

public class WitheredBonnieRightArmDisplayModel extends AnimatedGeoModel<WitheredBonnieRightArmDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WitheredBonnieRightArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/witheredbonnierightarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredBonnieRightArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/witheredbonnierightarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredBonnieRightArmDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/witheredbonnietexture.png");
	}
}
