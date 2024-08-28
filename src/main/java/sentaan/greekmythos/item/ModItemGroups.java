package sentaan.greekmythos.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import sentaan.greekmythos.GreekMythology;
import sentaan.greekmythos.block.ModBlocks;

public class ModItemGroups {

    public static final ItemGroup OLYMPIAN_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(GreekMythology.MOD_ID, "olympian_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.OLYMPIAN_BRONZE_INGOT))
                    .displayName(Text.translatable("itemgroup.greekmythos.olympian_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.RAW_OLYMPIAN_BRONZE);
                        entries.add(ModItems.OLYMPIAN_BRONZE_INGOT);
                        entries.add(ModBlocks.OLYMPIAN_BRONZE_BL0CK);
                        entries.add(ModBlocks.RAW_OLYMPIAN_BRONZE_BLOCK);
                    }).build()
            );

    public static final ItemGroup GREEK_MYTHOS_ITEMS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(GreekMythology.MOD_ID, "greek_mythos_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.OLYMPIAN_BRONZE_INGOT))
                    .displayName(Text.translatable("itemgroup.greekmythos.greek_mythos_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.RAW_OLYMPIAN_BRONZE);
                        entries.add(ModItems.OLYMPIAN_BRONZE_INGOT);
                        entries.add(ModBlocks.OLYMPIAN_BRONZE_BL0CK);
                        entries.add(ModBlocks.RAW_OLYMPIAN_BRONZE_BLOCK);
                    }).build()
            );

    public static void registerItemGroups() {
        GreekMythology.LOGGER.info("Registering Item Groups for "+GreekMythology.MOD_ID);
    }
}
