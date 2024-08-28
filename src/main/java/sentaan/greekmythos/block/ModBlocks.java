package sentaan.greekmythos.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import sentaan.greekmythos.GreekMythology;

public class ModBlocks {

    public static final Block OLYMPIAN_BRONZE_BL0CK = registerBlock("olympian_bronze_block",
            new Block(AbstractBlock.Settings.create().strength(50f,1200f).requiresTool().sounds(BlockSoundGroup.METAL)));

    public static final Block RAW_OLYMPIAN_BRONZE_BLOCK = registerBlock("raw_olympian_bronze_block",
            new Block(AbstractBlock.Settings.create().strength(50f,1200f).requiresTool().sounds(BlockSoundGroup.METAL)));

    public static final Block OLYMPIAN_BRONZE_ORE = registerBlock("olympian_bronze_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),AbstractBlock.Settings.create().strength(50f,1200f).requiresTool()));

    public static final Block MARBLE = registerBlock("marble",
            new Block(AbstractBlock.Settings.create().strength(14f,9f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(GreekMythology.MOD_ID,name),block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(GreekMythology.MOD_ID, name), new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        GreekMythology.LOGGER.info("Registering Mod Blocks for"+GreekMythology.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries ->{
            entries.add(ModBlocks.OLYMPIAN_BRONZE_BL0CK);
        });
    }
}
