package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.FoxyPirateHeadTileEntity;

public class FoxyPirateHeadBlockModel extends AnimatedGeoModel<FoxyPirateHeadTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FoxyPirateHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/foxypiratehead.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FoxyPirateHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/foxypiratehead.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FoxyPirateHeadTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/fixedfoxy.png");
	}
}
