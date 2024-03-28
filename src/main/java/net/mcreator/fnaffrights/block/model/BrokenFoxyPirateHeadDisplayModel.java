package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.BrokenFoxyPirateHeadDisplayItem;

public class BrokenFoxyPirateHeadDisplayModel extends AnimatedGeoModel<BrokenFoxyPirateHeadDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BrokenFoxyPirateHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/foxypiratehead.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BrokenFoxyPirateHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/foxypiratehead.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BrokenFoxyPirateHeadDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/foxy.png");
	}
}
