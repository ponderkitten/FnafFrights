package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.BrokenFoxyPirateHeadTileEntity;

public class BrokenFoxyPirateHeadBlockModel extends AnimatedGeoModel<BrokenFoxyPirateHeadTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BrokenFoxyPirateHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/foxypiratehead.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BrokenFoxyPirateHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/foxypiratehead.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BrokenFoxyPirateHeadTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/foxy.png");
	}
}
