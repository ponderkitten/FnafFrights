package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.FreddyBoxSpinTileEntity;

public class FreddyBoxSpinBlockModel extends AnimatedGeoModel<FreddyBoxSpinTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FreddyBoxSpinTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/freddyboxspin.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FreddyBoxSpinTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/freddyboxspin.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FreddyBoxSpinTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/freddybox.png");
	}
}
