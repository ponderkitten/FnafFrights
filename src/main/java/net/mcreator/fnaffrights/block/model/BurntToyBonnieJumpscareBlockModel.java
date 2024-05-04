package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.BurntToyBonnieJumpscareTileEntity;

public class BurntToyBonnieJumpscareBlockModel extends AnimatedGeoModel<BurntToyBonnieJumpscareTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BurntToyBonnieJumpscareTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/toybonnie.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BurntToyBonnieJumpscareTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/toybonnie.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BurntToyBonnieJumpscareTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/burnt_toybonnie.png");
	}
}
