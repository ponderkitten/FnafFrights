package net.mcreator.fnaffrights.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.entity.BalloonBotEntity;

public class BalloonBotModel extends AnimatedGeoModel<BalloonBotEntity> {
	@Override
	public ResourceLocation getAnimationResource(BalloonBotEntity entity) {
		return new ResourceLocation("fnaf_frights", "animations/balloonbot.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BalloonBotEntity entity) {
		return new ResourceLocation("fnaf_frights", "geo/balloonbot.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BalloonBotEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/entities/" + entity.getTexture() + ".png");
	}

}
