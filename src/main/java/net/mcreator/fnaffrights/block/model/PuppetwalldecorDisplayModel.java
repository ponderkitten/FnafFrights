package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.PuppetwalldecorDisplayItem;

public class PuppetwalldecorDisplayModel extends AnimatedGeoModel<PuppetwalldecorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PuppetwalldecorDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/wallpuppet.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PuppetwalldecorDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/wallpuppet.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PuppetwalldecorDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/puppet.png");
	}
}
