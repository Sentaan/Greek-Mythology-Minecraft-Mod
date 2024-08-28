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

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(GreekMythology.MOD_ID,name),item);
    }

    public static void registerModItems(){
        GreekMythology.LOGGER.info("Registering Mod Items for"+GreekMythology.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(OLYMPIAN_BRONZE_INGOT);
            entries.add(RAW_OLYMPIAN_BRONZE);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.add(BLUE_HAIRBRUSH);
        });
    }
}
