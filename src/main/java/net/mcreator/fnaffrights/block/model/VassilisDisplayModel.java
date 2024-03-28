package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.VassilisDisplayItem;

public class VassilisDisplayModel extends AnimatedGeoModel<VassilisDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(VassilisDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/vassilisanimatronic.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(VassilisDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/vassilisanimatronic.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(VassilisDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/vassilis.png");
	}
}
