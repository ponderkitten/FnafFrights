package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.FreddyFazbearRightArmTileEntity;

public class FreddyFazbearRightArmBlockModel extends AnimatedGeoModel<FreddyFazbearRightArmTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FreddyFazbearRightArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/freddyfazbearrightarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FreddyFazbearRightArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/freddyfazbearrightarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FreddyFazbearRightArmTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/freddyfazbeartexture.png");
	}
}
