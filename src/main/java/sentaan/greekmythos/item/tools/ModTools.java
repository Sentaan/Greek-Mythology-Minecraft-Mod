package sentaan.greekmythos.item.tools;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import sentaan.greekmythos.GreekMythology;


public class ModTools {

    public static final Item OLYMPIAN_BRONZE_SWORD = registerItem("olympian_bronze_sword",new SwordItem(ToolMaterials.OLYMPIAN_BRONZE, new Item.Settings()));
    public static final Item OLYMPIAN_BRONZE_PICKAXE = registerItem("olympian_bronze_pickaxe",new PickaxeItem(ToolMaterials.OLYMPIAN_BRONZE, new Item.Settings()));
    public static final Item OLYMPIAN_BRONZE_AXE = registerItem("olympian_bronze_axe", new AxeItem(ToolMaterials.OLYMPIAN_BRONZE, new Item.Settings()));
    public static final Item OLYMPIAN_BRONZE_SHOVEL = registerItem("olympian_bronze_shovel", new ShovelItem(ToolMaterials.OLYMPIAN_BRONZE, new Item.Settings()));
    public static final Item OLYMPIAN_BRONZE_HOE = registerItem("olympian_bronze_hoe", new HoeItem(ToolMaterials.OLYMPIAN_BRONZE,new Item.Settings()));
    public static final Item STYGIAN_ICE_SWORD = registerItem("stygian_ice_sword", new SwordItem(ToolMaterials.STYGIAN_ICE, new Item.Settings()));
    public static final Item STYGIAN_ICE_PICKAXE = registerItem("stygian_ice_pickaxe",new PickaxeItem(ToolMaterials.STYGIAN_ICE, new Item.Settings()));
    public static final Item STYGIAN_ICE_AXE = registerItem("stygian_ice_axe",new AxeItem(ToolMaterials.STYGIAN_ICE, new Item.Settings()));
    public static final Item STYGIAN_ICE_SHOVEL = registerItem("stygian_ice_shovel",new ShovelItem(ToolMaterials.STYGIAN_ICE, new Item.Settings()));
    public static final Item STYGIAN_ICE_HOE = registerItem("stygian_ice_hoe",new HoeItem(ToolMaterials.STYGIAN_ICE, new Item.Settings()));
    public static final Item BLESSED_GOLD_SWORD = registerItem("blessed_gold_sword",new SwordItem(ToolMaterials.BLESSED_GOLD, new Item.Settings()));
    public static final Item BLESSED_GOLD_PICKAXE = registerItem("blessed_gold_pickaxe",new PickaxeItem(ToolMaterials.BLESSED_GOLD, new Item.Settings()));
    public static final Item BLESSED_GOLD_AXE = registerItem("blessed_gold_axe",new AxeItem(ToolMaterials.BLESSED_GOLD, new Item.Settings()));
    public static final Item BLESSED_GOLD_SHOVEL = registerItem("blessed_gold_shovel",new ShovelItem(ToolMaterials.BLESSED_GOLD, new Item.Settings()));
    public static final Item BLESSED_GOLD_HOE = registerItem("blessed_gold_hoe",new HoeItem(ToolMaterials.BLESSED_GOLD, new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(GreekMythology.MOD_ID,name),item);
    }

    public static void registerModItems(){
        GreekMythology.LOGGER.info("Registering Mod Items for"+GreekMythology.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            entries.add(OLYMPIAN_BRONZE_AXE);
            entries.add(OLYMPIAN_BRONZE_PICKAXE);
            entries.add(OLYMPIAN_BRONZE_HOE);
            entries.add(OLYMPIAN_BRONZE_SHOVEL);
            entries.add(STYGIAN_ICE_PICKAXE);
            entries.add(STYGIAN_ICE_AXE);
            entries.add(STYGIAN_ICE_HOE);
            entries.add(STYGIAN_ICE_SHOVEL);
            entries.add(BLESSED_GOLD_PICKAXE);
            entries.add(BLESSED_GOLD_AXE);
            entries.add(BLESSED_GOLD_HOE);
            entries.add(BLESSED_GOLD_SHOVEL);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.add(OLYMPIAN_BRONZE_SWORD);
            entries.add(STYGIAN_ICE_SWORD);
            entries.add(BLESSED_GOLD_SWORD);
        });
    }
}
