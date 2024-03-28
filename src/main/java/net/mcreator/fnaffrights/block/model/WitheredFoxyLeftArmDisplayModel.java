package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.WitheredFoxyLeftArmDisplayItem;

public class WitheredFoxyLeftArmDisplayModel extends AnimatedGeoModel<WitheredFoxyLeftArmDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WitheredFoxyLeftArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/foxyleftarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredFoxyLeftArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/foxyleftarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredFoxyLeftArmDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/witheredfoxytexture.png");
	}
}
