package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.ToyBonnieHeadDisplayItem;

public class ToyBonnieHeadDisplayModel extends AnimatedGeoModel<ToyBonnieHeadDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ToyBonnieHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/toybonniehead.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyBonnieHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/toybonniehead.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyBonnieHeadDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_bonnie.png");
	}
}
