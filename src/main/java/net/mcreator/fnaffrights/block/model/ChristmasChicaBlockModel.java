package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ChristmasChicaTileEntity;

public class ChristmasChicaBlockModel extends AnimatedGeoModel<ChristmasChicaTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ChristmasChicaTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/christmaschicashowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChristmasChicaTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/christmaschicashowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChristmasChicaTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/christmaschica.png");
	}
}
