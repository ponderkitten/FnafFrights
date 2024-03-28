package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.Endo02LeftArmTileEntity;

public class Endo02LeftArmBlockModel extends AnimatedGeoModel<Endo02LeftArmTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Endo02LeftArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/freddyleftarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Endo02LeftArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/freddyleftarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Endo02LeftArmTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/endo02.png");
	}
}
