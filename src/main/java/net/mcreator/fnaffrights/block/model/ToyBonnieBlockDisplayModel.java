package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.ToyBonnieBlockDisplayItem;

public class ToyBonnieBlockDisplayModel extends AnimatedGeoModel<ToyBonnieBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ToyBonnieBlockDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/toybonnieblock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyBonnieBlockDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/toybonnieblock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyBonnieBlockDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_bonnie.png");
	}
}
