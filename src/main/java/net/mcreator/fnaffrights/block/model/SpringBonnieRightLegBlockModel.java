package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.SpringBonnieRightLegTileEntity;

public class SpringBonnieRightLegBlockModel extends AnimatedGeoModel<SpringBonnieRightLegTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(SpringBonnieRightLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/springbonniesrightleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpringBonnieRightLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/springbonniesrightleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpringBonnieRightLegTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/springbonnie.png");
	}
}
