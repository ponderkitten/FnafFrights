package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.SpringBonnieTorsoTileEntity;

public class SpringBonnieTorsoBlockModel extends AnimatedGeoModel<SpringBonnieTorsoTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(SpringBonnieTorsoTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/springbonnietorso.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpringBonnieTorsoTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/springbonnietorso.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpringBonnieTorsoTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/springbonnie.png");
	}
}
