package sentaan.greekmythos.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import sentaan.greekmythos.GreekMythology;
import sentaan.greekmythos.item.custom.BlueHairBrushItem;

public class ModItems {

    public static final Item OLYMPIAN_BRONZE_INGOT = registerItem("olympian_bronze_ingot", new Item(new Item.Settings()));
    public static final Item RAW_OLYMPIAN_BRONZE = registerItem("raw_olympian_bronze", new Item(new Item.Settings()));
    public static final Item BLUE_HAIRBRUSH = registerItem("blue_hairbrush", new BlueHairBrushItem(new Item.Settings().maxDamage(32)));
    public static final Item STYGIAN_ICE_FRAGMENT = registerItem("stygian_ice_fragment", new Item(new Item.Settings()));
    public static final Item STYGIAN_ICE_SHARD = registerItem("stygian_ice_shard", new Item(new Item.Settings()));
    public static final Item BLESSED_GOLD_INGOT = registerItem("blessed_gold_ingot",new Item(new Item.Settings()));
    public static final Item HORSE_HAIR = registerItem("horse_hair",new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(GreekMythology.MOD_ID,name),item);
    }

    public static void registerModItems(){
        GreekMythology.LOGGER.info("Registering Mod Items for"+GreekMythology.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(OLYMPIAN_BRONZE_INGOT);
            entries.add(RAW_OLYMPIAN_BRONZE);
            entries.add(STYGIAN_ICE_FRAGMENT);
            entries.add(STYGIAN_ICE_SHARD);
            entries.add(BLESSED_GOLD_INGOT);
            entries.add(HORSE_HAIR);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.add(BLUE_HAIRBRUSH);
        });
    }
}
