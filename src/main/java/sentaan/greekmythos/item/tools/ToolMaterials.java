package sentaan.greekmythos.item.tools;

import com.google.common.base.Suppliers;
import net.minecraft.block.Block;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import sentaan.greekmythos.item.ModItems;

import java.util.function.Supplier;

public enum ToolMaterials implements ToolMaterial {
    OLYMPIAN_BRONZE(BlockTags.INCORRECT_FOR_NETHERITE_TOOL,4162,11.0F,5.0F,54, () -> Ingredient.ofItems(ModItems.OLYMPIAN_BRONZE_INGOT)),
    STYGIAN_ICE(BlockTags.INCORRECT_FOR_NETHERITE_TOOL,4162,11.0F,6.0F,54, () -> Ingredient.ofItems(ModItems.STYGIAN_ICE_SHARD)),
    BLESSED_GOLD(BlockTags.INCORRECT_FOR_NETHERITE_TOOL,2031, 16.0F, 3.0F, 54, () -> Ingredient.ofItems(ModItems.BLESSED_GOLD_INGOT));


    private final TagKey<Block> inverseTag;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    private ToolMaterials(
            final TagKey<Block> inverseTag,
            final int itemDurability,
            final float miningSpeed,
            final float attackDamage,
            final int enchantability,
            final Supplier<Ingredient> repairIngredient
    ) {
        this.inverseTag = inverseTag;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = Suppliers.memoize(repairIngredient::get);
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public TagKey<Block> getInverseTag() {
        return this.inverseTag;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return (Ingredient) this.repairIngredient.get();
    }
}
