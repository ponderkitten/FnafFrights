package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ChristmasChicaATileEntity;

public class ChristmasChicaABlockModel extends AnimatedGeoModel<ChristmasChicaATileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ChristmasChicaATileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/christmaschicaactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChristmasChicaATileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/christmaschicaactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChristmasChicaATileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/christmaschica.png");
	}
}
