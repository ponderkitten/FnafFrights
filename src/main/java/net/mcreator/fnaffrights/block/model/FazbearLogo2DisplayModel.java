package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.FazbearLogo2DisplayItem;

public class FazbearLogo2DisplayModel extends AnimatedGeoModel<FazbearLogo2DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FazbearLogo2DisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/fazbearlogoblock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FazbearLogo2DisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/fazbearlogoblock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FazbearLogo2DisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/fazbearlogo2.png");
	}
}
