package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.FreddyBoxActiveTileEntity;

public class FreddyBoxActiveBlockModel extends AnimatedGeoModel<FreddyBoxActiveTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FreddyBoxActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/freddyboxactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FreddyBoxActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/freddyboxactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FreddyBoxActiveTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/freddybox.png");
	}
}
