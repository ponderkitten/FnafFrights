package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.Endo02RightLegDisplayItem;

public class Endo02RightLegDisplayModel extends AnimatedGeoModel<Endo02RightLegDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Endo02RightLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/freddyrightleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Endo02RightLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/freddyrightleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Endo02RightLegDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/endo02.png");
	}
}
