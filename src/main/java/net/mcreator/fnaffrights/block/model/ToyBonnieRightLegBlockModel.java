package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ToyBonnieRightLegTileEntity;

public class ToyBonnieRightLegBlockModel extends AnimatedGeoModel<ToyBonnieRightLegTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToyBonnieRightLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/toybonnierightleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyBonnieRightLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/toybonnierightleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyBonnieRightLegTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_bonnie.png");
	}
}
