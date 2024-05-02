package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.BurntToyFreddyJumpscareTileEntity;

public class BurntToyFreddyJumpscareBlockModel extends AnimatedGeoModel<BurntToyFreddyJumpscareTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BurntToyFreddyJumpscareTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/burntjumpscaretoyfreddy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BurntToyFreddyJumpscareTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/burntjumpscaretoyfreddy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BurntToyFreddyJumpscareTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/burnt_toyfreddy.png");
	}
}
