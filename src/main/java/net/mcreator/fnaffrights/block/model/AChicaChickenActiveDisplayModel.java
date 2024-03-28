package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.AChicaChickenActiveDisplayItem;

public class AChicaChickenActiveDisplayModel extends AnimatedGeoModel<AChicaChickenActiveDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AChicaChickenActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/aclassicchicashowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AChicaChickenActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/aclassicchicashowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AChicaChickenActiveDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/chica.png");
	}
}
