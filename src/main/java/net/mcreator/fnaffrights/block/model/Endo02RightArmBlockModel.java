package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.Endo02RightArmTileEntity;

public class Endo02RightArmBlockModel extends AnimatedGeoModel<Endo02RightArmTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Endo02RightArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/freddyrightarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Endo02RightArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/freddyrightarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Endo02RightArmTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/endo02.png");
	}
}
