package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.AToyBonnieActiveTileEntity;

public class AToyBonnieActiveBlockModel extends AnimatedGeoModel<AToyBonnieActiveTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AToyBonnieActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/atoybonnieshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AToyBonnieActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/atoybonnieshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AToyBonnieActiveTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_bonnie.png");
	}
}
