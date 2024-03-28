package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.FoxyLeftArmTileEntity;

public class FoxyLeftArmBlockModel extends AnimatedGeoModel<FoxyLeftArmTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FoxyLeftArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/foxyleftarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FoxyLeftArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/foxyleftarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FoxyLeftArmTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_foxy.png");
	}
}
