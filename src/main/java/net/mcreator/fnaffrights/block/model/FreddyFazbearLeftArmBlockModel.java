package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.FreddyFazbearLeftArmTileEntity;

public class FreddyFazbearLeftArmBlockModel extends AnimatedGeoModel<FreddyFazbearLeftArmTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FreddyFazbearLeftArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/freddyfazbearleftarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FreddyFazbearLeftArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/freddyfazbearleftarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FreddyFazbearLeftArmTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/freddyfazbeartexture.png");
	}
}
