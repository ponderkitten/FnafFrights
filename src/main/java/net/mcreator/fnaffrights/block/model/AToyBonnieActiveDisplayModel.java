package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.AToyBonnieActiveDisplayItem;

public class AToyBonnieActiveDisplayModel extends AnimatedGeoModel<AToyBonnieActiveDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AToyBonnieActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/atoybonnieshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AToyBonnieActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/atoybonnieshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AToyBonnieActiveDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_bonnie.png");
	}
}
