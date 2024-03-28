package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.OffsetFixedFoxyActiveTileEntity;

public class OffsetFixedFoxyActiveBlockModel extends AnimatedGeoModel<OffsetFixedFoxyActiveTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(OffsetFixedFoxyActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/ofixedfoxypirateshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetFixedFoxyActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/ofixedfoxypirateshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetFixedFoxyActiveTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/fixedfoxy.png");
	}
}
