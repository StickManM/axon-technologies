package net.stickmanm.axontechnologies.item.client;

import net.minecraft.util.Identifier;
import net.stickmanm.axontechnologies.AxonTechnologies;
import net.stickmanm.axontechnologies.item.custom.CorruptiniteArmorItem;
import net.stickmanm.axontechnologies.item.custom.RedThunderaniumArmorItem;
import software.bernie.geckolib.model.GeoModel;

public class CorruptiniteArmorModel extends GeoModel<CorruptiniteArmorItem>{
    @Override
    public Identifier getModelResource(CorruptiniteArmorItem animatable) {
        return new Identifier(AxonTechnologies.MOD_ID, "geo/armor_test.geo.json");
    }

    @Override
    public Identifier getTextureResource(CorruptiniteArmorItem animatable) {
        return new Identifier(AxonTechnologies.MOD_ID, "textures/armor/armor_test.png");
    }

    @Override
    public Identifier getAnimationResource(CorruptiniteArmorItem animatable) {
        return new Identifier(AxonTechnologies.MOD_ID, "animations/armor_test.animation.json");
    }
}
