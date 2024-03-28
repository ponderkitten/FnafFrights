package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.VasstronicTileEntity;

public class VasstronicBlockModel extends AnimatedGeoModel<VasstronicTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(VasstronicTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/rockstar_vasstronic.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(VasstronicTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/rockstar_vasstronic.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(VasstronicTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/vasstronic_normal.png");
	}
}
