package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.SpringBonnieLeftArmTileEntity;

public class SpringBonnieLeftArmBlockModel extends AnimatedGeoModel<SpringBonnieLeftArmTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(SpringBonnieLeftArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/springbonniesleftarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpringBonnieLeftArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/springbonniesleftarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpringBonnieLeftArmTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/springbonnie.png");
	}
}
