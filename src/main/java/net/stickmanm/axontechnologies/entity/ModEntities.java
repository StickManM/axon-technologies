package net.stickmanm.axontechnologies.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.impl.object.builder.FabricEntityType;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.stickmanm.axontechnologies.AxonTechnologies;
import net.stickmanm.axontechnologies.block.ModBlocks;
import net.stickmanm.axontechnologies.entity.custom.DarkEssenceZombieEntity;
import net.stickmanm.axontechnologies.entity.custom.LostMinerEntity;
import net.stickmanm.axontechnologies.entity.custom.RedEssenceZombieEntity;

public class ModEntities {

    public static final EntityType<RedEssenceZombieEntity> RED_ESSENCE_ZOMBIE = Registry.register(
            Registries.ENTITY_TYPE, new Identifier(AxonTechnologies.MOD_ID,"red_essence_zombie"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, RedEssenceZombieEntity::new)
                    .fireImmune()
                    .specificSpawnBlocks(ModBlocks.CHARGED_DIRT)
                    .specificSpawnBlocks(ModBlocks.THUNDERED_STONE)
                    .trackRangeChunks(32)
                    .spawnableFarFromPlayer()
                    .dimensions(EntityDimensions.fixed(0.6f,2f)).build());

    public static final EntityType<DarkEssenceZombieEntity> DARK_ESSENCE_ZOMBIE = Registry.register(
            Registries.ENTITY_TYPE, new Identifier(AxonTechnologies.MOD_ID,"dark_essence_zombie"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, DarkEssenceZombieEntity::new)
                    .fireImmune()
                    .specificSpawnBlocks(ModBlocks.CORRUPTED_DIRT)
                    .specificSpawnBlocks(ModBlocks.CORRUPTED_STONE)
                    .trackRangeChunks(48)
                    .spawnableFarFromPlayer()
                    .dimensions(EntityDimensions.fixed(0.6f,2f)).build());

    public static final EntityType<LostMinerEntity> LOST_MINER = Registry.register(
            Registries.ENTITY_TYPE, new Identifier(AxonTechnologies.MOD_ID,"lost_miner"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, LostMinerEntity::new)
                    .specificSpawnBlocks(ModBlocks.DREADSTONE)
                    .trackRangeChunks(10)
                    .spawnableFarFromPlayer()
                    .dimensions(EntityDimensions.fixed(0.6f,2f)).build());

    public static void registerModEntities(){
        FabricDefaultAttributeRegistry.register(ModEntities.RED_ESSENCE_ZOMBIE, RedEssenceZombieEntity.setAttributes());
        FabricDefaultAttributeRegistry.register(ModEntities.DARK_ESSENCE_ZOMBIE, DarkEssenceZombieEntity.setAttributes());
        FabricDefaultAttributeRegistry.register(ModEntities.LOST_MINER, LostMinerEntity.setAttributes());

    }
}


