package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.WitheredBonnieRightArmTileEntity;

public class WitheredBonnieRightArmBlockModel extends AnimatedGeoModel<WitheredBonnieRightArmTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WitheredBonnieRightArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/witheredbonnierightarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredBonnieRightArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/witheredbonnierightarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredBonnieRightArmTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/witheredbonnietexture.png");
	}
}
