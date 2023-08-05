package net.stickmanm.axontechnologies.item.client;

import net.minecraft.util.Identifier;
import net.stickmanm.axontechnologies.AxonTechnologies;
import net.stickmanm.axontechnologies.item.custom.DarkThunderaniumArmorItem;
import net.stickmanm.axontechnologies.item.custom.RedThunderaniumArmorItem;
import software.bernie.geckolib.model.GeoModel;

public class DarkThunderaniumArmorModel extends GeoModel<DarkThunderaniumArmorItem>{
    @Override
    public Identifier getModelResource(DarkThunderaniumArmorItem animatable) {
        return new Identifier(AxonTechnologies.MOD_ID, "geo/armor_test.geo.json");
    }

    @Override
    public Identifier getTextureResource(DarkThunderaniumArmorItem animatable) {
        return new Identifier(AxonTechnologies.MOD_ID, "textures/armor/armor_test.png");
    }

    @Override
    public Identifier getAnimationResource(DarkThunderaniumArmorItem animatable) {
        return new Identifier(AxonTechnologies.MOD_ID, "animations/armor_test.animation.json");
    }
}
