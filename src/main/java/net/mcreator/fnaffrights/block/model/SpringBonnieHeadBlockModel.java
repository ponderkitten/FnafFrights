package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.SpringBonnieHeadTileEntity;

public class SpringBonnieHeadBlockModel extends AnimatedGeoModel<SpringBonnieHeadTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(SpringBonnieHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/springbonniehead.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpringBonnieHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/springbonniehead.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpringBonnieHeadTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/springbonnie.png");
	}
}
