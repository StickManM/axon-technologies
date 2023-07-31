package net.stickmanm.axontechnologies.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.fabricmc.fabric.impl.object.builder.FabricEntityType;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.stickmanm.axontechnologies.AxonTechnologies;
import net.stickmanm.axontechnologies.block.ModBlocks;
import net.stickmanm.axontechnologies.entity.custom.RedEssenceZombieEntity;

public class ModEntities {
    public static final EntityType<RedEssenceZombieEntity> RED_ESSENCE_ZOMBIE = Registry.register(
            Registries.ENTITY_TYPE, new Identifier(AxonTechnologies.MOD_ID,"red_essence_zombie"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, RedEssenceZombieEntity::new)
                    .fireImmune()
                    .specificSpawnBlocks(ModBlocks.CHARGED_DIRT)
                    .trackRangeChunks(32)
                    .spawnableFarFromPlayer()
                    .dimensions(EntityDimensions.fixed(0.6f,2f)).build());


}
