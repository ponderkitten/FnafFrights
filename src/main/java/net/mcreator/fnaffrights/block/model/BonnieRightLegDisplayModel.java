package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.BonnieRightLegDisplayItem;

public class BonnieRightLegDisplayModel extends AnimatedGeoModel<BonnieRightLegDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BonnieRightLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/freddyrightleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BonnieRightLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/freddyrightleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BonnieRightLegDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_bonnie.png");
	}
}
