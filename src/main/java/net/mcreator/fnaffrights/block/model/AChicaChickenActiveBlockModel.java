package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.AChicaChickenActiveTileEntity;

public class AChicaChickenActiveBlockModel extends AnimatedGeoModel<AChicaChickenActiveTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AChicaChickenActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/aclassicchicashowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AChicaChickenActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/aclassicchicashowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AChicaChickenActiveTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/chica.png");
	}
}
