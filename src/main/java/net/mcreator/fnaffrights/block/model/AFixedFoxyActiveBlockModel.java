package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.AFixedFoxyActiveTileEntity;

public class AFixedFoxyActiveBlockModel extends AnimatedGeoModel<AFixedFoxyActiveTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AFixedFoxyActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/afixedfoxypirateshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AFixedFoxyActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/afixedfoxypirateshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AFixedFoxyActiveTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/fixedfoxy.png");
	}
}
