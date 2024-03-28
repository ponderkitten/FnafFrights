package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.WitheredBonnieRightLegTileEntity;

public class WitheredBonnieRightLegBlockModel extends AnimatedGeoModel<WitheredBonnieRightLegTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WitheredBonnieRightLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/witheredbonnierightleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredBonnieRightLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/witheredbonnierightleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredBonnieRightLegTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/witheredbonnietexture.png");
	}
}
