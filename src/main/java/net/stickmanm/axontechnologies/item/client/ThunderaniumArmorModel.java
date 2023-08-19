package net.stickmanm.axontechnologies.item.client;

import net.minecraft.util.Identifier;
import net.stickmanm.axontechnologies.AxonTechnologies;
import net.stickmanm.axontechnologies.item.custom.ThunderaniumArmorItem;
import software.bernie.geckolib.model.GeoModel;

public class ThunderaniumArmorModel extends GeoModel<ThunderaniumArmorItem>{
    @Override
    public Identifier getModelResource(ThunderaniumArmorItem animatable) {
        return new Identifier(AxonTechnologies.MOD_ID, "geo/armor_test.geo.json");
    }

    @Override
    public Identifier getTextureResource(ThunderaniumArmorItem animatable) {
        return new Identifier(AxonTechnologies.MOD_ID, "textures/armor/armor_test.png");
    }

    @Override
    public Identifier getAnimationResource(ThunderaniumArmorItem animatable) {
        return new Identifier(AxonTechnologies.MOD_ID, "animations/armor_test.animation.json");
    }
}
