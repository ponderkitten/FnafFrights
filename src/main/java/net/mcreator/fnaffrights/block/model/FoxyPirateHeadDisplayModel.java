package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.FoxyPirateHeadDisplayItem;

public class FoxyPirateHeadDisplayModel extends AnimatedGeoModel<FoxyPirateHeadDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FoxyPirateHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/foxypiratehead.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FoxyPirateHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/foxypiratehead.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FoxyPirateHeadDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/fixedfoxy.png");
	}
}
