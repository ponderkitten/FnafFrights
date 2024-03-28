package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.Enod02BonnieHeadDisplayItem;

public class Enod02BonnieHeadDisplayModel extends AnimatedGeoModel<Enod02BonnieHeadDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Enod02BonnieHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/endo02bonnie.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Enod02BonnieHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/endo02bonnie.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Enod02BonnieHeadDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_bonnie.png");
	}
}
