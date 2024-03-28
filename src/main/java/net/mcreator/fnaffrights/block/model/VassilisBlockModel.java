package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.VassilisTileEntity;

public class VassilisBlockModel extends AnimatedGeoModel<VassilisTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(VassilisTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/vassilisanimatronic.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(VassilisTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/vassilisanimatronic.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(VassilisTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/vassilis.png");
	}
}
