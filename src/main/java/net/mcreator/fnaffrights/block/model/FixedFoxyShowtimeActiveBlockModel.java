package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.FixedFoxyShowtimeActiveTileEntity;

public class FixedFoxyShowtimeActiveBlockModel extends AnimatedGeoModel<FixedFoxyShowtimeActiveTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FixedFoxyShowtimeActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/fixedfoxypirateshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FixedFoxyShowtimeActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/fixedfoxypirateshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FixedFoxyShowtimeActiveTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/fixedfoxy.png");
	}
}
