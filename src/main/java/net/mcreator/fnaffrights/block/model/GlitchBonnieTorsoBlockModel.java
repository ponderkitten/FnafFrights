package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.GlitchBonnieTorsoTileEntity;

public class GlitchBonnieTorsoBlockModel extends AnimatedGeoModel<GlitchBonnieTorsoTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(GlitchBonnieTorsoTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/springbonnietorso.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GlitchBonnieTorsoTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/springbonnietorso.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GlitchBonnieTorsoTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/springbonniewithvestandwhiskers.png");
	}
}
