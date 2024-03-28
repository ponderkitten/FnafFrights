package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.VassilisADisplayItem;

public class VassilisADisplayModel extends AnimatedGeoModel<VassilisADisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(VassilisADisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/vassilisanimatronicactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(VassilisADisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/vassilisanimatronicactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(VassilisADisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/vassilis.png");
	}
}
