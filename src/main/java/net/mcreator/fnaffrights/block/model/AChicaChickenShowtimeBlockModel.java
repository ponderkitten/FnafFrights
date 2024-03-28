package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.AChicaChickenShowtimeTileEntity;

public class AChicaChickenShowtimeBlockModel extends AnimatedGeoModel<AChicaChickenShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AChicaChickenShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/aclassicchicashowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AChicaChickenShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/aclassicchicashowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AChicaChickenShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/chica.png");
	}
}
