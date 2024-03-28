package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.WitheredFoxyLeftArmTileEntity;

public class WitheredFoxyLeftArmBlockModel extends AnimatedGeoModel<WitheredFoxyLeftArmTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WitheredFoxyLeftArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/foxyleftarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredFoxyLeftArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/foxyleftarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredFoxyLeftArmTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/witheredfoxytexture.png");
	}
}
