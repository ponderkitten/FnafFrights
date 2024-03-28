package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.Enod02BonnieHeadTileEntity;

public class Enod02BonnieHeadBlockModel extends AnimatedGeoModel<Enod02BonnieHeadTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Enod02BonnieHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/endo02bonnie.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Enod02BonnieHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/endo02bonnie.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Enod02BonnieHeadTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_bonnie.png");
	}
}
