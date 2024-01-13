package net.stickmanm.axontechnologies.world.tree;

import net.minecraft.block.SaplingGenerator;
import net.stickmanm.axontechnologies.world.ModConfiguredFeatures;

import java.util.Optional;

public class ModSaplingGenerators {
    public static final SaplingGenerator THUNDERED =
            new SaplingGenerator("chestnut", 0f, Optional.empty(),
                    Optional.empty(),
                    Optional.of(ModConfiguredFeatures.THUNDERED_SAPLING_KEY),
                    Optional.empty(),
                    Optional.empty(),
                    Optional.empty());
}
