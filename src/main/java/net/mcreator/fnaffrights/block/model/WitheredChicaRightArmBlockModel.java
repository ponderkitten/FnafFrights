package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.WitheredChicaRightArmTileEntity;

public class WitheredChicaRightArmBlockModel extends AnimatedGeoModel<WitheredChicaRightArmTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WitheredChicaRightArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/witheredchicarightarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredChicaRightArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/witheredchicarightarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredChicaRightArmTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/witheredchicatexture.png");
	}
}
