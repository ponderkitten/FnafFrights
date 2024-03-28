package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.FredBearLeftArmTileEntity;

public class FredBearLeftArmBlockModel extends AnimatedGeoModel<FredBearLeftArmTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FredBearLeftArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/fredbearleftarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FredBearLeftArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/fredbearleftarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FredBearLeftArmTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/fredbear4.png");
	}
}
