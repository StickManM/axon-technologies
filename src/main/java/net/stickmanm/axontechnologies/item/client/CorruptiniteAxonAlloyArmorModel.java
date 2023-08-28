package net.stickmanm.axontechnologies.item.client;

import net.minecraft.util.Identifier;
import net.stickmanm.axontechnologies.AxonTechnologies;
import net.stickmanm.axontechnologies.item.custom.CorruptiniteArmorItem;
import net.stickmanm.axontechnologies.item.custom.CorruptiniteAxonAlloyArmorItem;
import software.bernie.geckolib.model.GeoModel;

public class CorruptiniteAxonAlloyArmorModel extends GeoModel<CorruptiniteAxonAlloyArmorItem>{
    @Override
    public Identifier getModelResource(CorruptiniteAxonAlloyArmorItem animatable) {
        return new Identifier(AxonTechnologies.MOD_ID, "geo/armor_test.geo.json");
    }

    @Override
    public Identifier getTextureResource(CorruptiniteAxonAlloyArmorItem animatable) {
        return new Identifier(AxonTechnologies.MOD_ID, "textures/armor/armor_test.png");
    }

    @Override
    public Identifier getAnimationResource(CorruptiniteAxonAlloyArmorItem animatable) {
        return new Identifier(AxonTechnologies.MOD_ID, "animations/armor_test.animation.json");
    }
}
