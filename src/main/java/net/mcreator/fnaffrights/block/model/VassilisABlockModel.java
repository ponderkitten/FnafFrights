package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.VassilisATileEntity;

public class VassilisABlockModel extends AnimatedGeoModel<VassilisATileEntity> {
	@Override
	public ResourceLocation getAnimationResource(VassilisATileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/vassilisanimatronicactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(VassilisATileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/vassilisanimatronicactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(VassilisATileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/vassilis.png");
	}
}
