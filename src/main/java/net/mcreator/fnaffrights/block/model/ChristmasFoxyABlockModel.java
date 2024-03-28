package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ChristmasFoxyATileEntity;

public class ChristmasFoxyABlockModel extends AnimatedGeoModel<ChristmasFoxyATileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ChristmasFoxyATileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/fixedfoxypirateshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChristmasFoxyATileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/fixedfoxypirateshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChristmasFoxyATileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/christmasfoxy.png");
	}
}
