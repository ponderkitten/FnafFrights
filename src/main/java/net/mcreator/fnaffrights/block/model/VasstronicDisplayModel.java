package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.VasstronicDisplayItem;

public class VasstronicDisplayModel extends AnimatedGeoModel<VasstronicDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(VasstronicDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/rockstar_vasstronic.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(VasstronicDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/rockstar_vasstronic.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(VasstronicDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/vasstronic_normal.png");
	}
}
