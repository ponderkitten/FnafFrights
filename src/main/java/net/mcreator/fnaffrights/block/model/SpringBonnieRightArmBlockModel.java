package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.SpringBonnieRightArmTileEntity;

public class SpringBonnieRightArmBlockModel extends AnimatedGeoModel<SpringBonnieRightArmTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(SpringBonnieRightArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/springbonniesrightarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpringBonnieRightArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/springbonniesrightarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpringBonnieRightArmTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/springbonnie.png");
	}
}
