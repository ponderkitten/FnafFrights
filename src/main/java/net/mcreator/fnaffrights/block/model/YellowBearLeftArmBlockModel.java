package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.YellowBearLeftArmTileEntity;

public class YellowBearLeftArmBlockModel extends AnimatedGeoModel<YellowBearLeftArmTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(YellowBearLeftArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/freddyfazbearleftarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(YellowBearLeftArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/freddyfazbearleftarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(YellowBearLeftArmTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/golden_freddy_normal_eyes.png");
	}
}
