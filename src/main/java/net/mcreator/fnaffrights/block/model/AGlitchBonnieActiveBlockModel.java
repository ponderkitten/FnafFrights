package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.AGlitchBonnieActiveTileEntity;

public class AGlitchBonnieActiveBlockModel extends AnimatedGeoModel<AGlitchBonnieActiveTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AGlitchBonnieActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/aspringbonnieshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AGlitchBonnieActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/aspringbonnieshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AGlitchBonnieActiveTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/springbonniewithvestandwhiskers.png");
	}
}
