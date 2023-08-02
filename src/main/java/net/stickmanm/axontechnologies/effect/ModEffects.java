package net.stickmanm.axontechnologies.effect;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.stickmanm.axontechnologies.AxonTechnologies;

public class ModEffects {

    public static final StatusEffect GLITCHSTER = new GlitchsterEffect();
    public static final StatusEffect GLITCHSTERII = new GlitchsterIIEffect();
    public static final StatusEffect THUNDER_POISONING = new ThunderPoisoningEffect();
    public static final StatusEffect ANTIGLITCHSTER = new AntiGlitchsterEffect();

    public static void registerModEffects() {
        Registry.register(Registries.STATUS_EFFECT, new Identifier(AxonTechnologies.MOD_ID, "glitchster"), GLITCHSTER);
        Registry.register(Registries.STATUS_EFFECT, new Identifier(AxonTechnologies.MOD_ID, "glitchster2"), GLITCHSTERII);
        Registry.register(Registries.STATUS_EFFECT, new Identifier(AxonTechnologies.MOD_ID, "thunder_poisoning"), THUNDER_POISONING);
        Registry.register(Registries.STATUS_EFFECT, new Identifier(AxonTechnologies.MOD_ID, "antiglitchster"), ANTIGLITCHSTER);

        AxonTechnologies.LOGGER.info("Registering ModEffects for " + AxonTechnologies.MOD_ID);
    }
}
