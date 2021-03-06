package com.dev.siuolplex.items.tools.materials;

import com.dev.siuolplex.items.Items;
import com.dev.siuolplex.items.tools.base.BaseKyaniteToolMaterial;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class KyaniteToolMaterial implements BaseKyaniteToolMaterial {
    @Override
    public int getDurability() {
        return 450;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 7;
    }

    @Override
    public float getAttackDamage() {
        return 2.5F;
    }

    @Override
    public int getMiningLevel() {
        return 3;
    }

    @Override
    public int getEnchantability() {
        return 9;
    }

    @Override
    public Ingredient getRepairIngredient() {
            return Ingredient.ofItems(Items.REFINED_KYANITE);
        }

    @Override
    public float getMaxHealth() {
        return 0;
    }

    @Override
    public float getArmor() {
        return 0;
    }

    @Override
    public float getAttackBoost() {
        return 0;
    }

    @Override
    public float getMovementSpeed() {
        return 0;
    }
}

