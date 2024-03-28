package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.FazbearLogoDisplayItem;

public class FazbearLogoDisplayModel extends AnimatedGeoModel<FazbearLogoDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FazbearLogoDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/fazbearlogoblock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FazbearLogoDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/fazbearlogoblock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FazbearLogoDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/fazbearlogo.png");
	}
}
