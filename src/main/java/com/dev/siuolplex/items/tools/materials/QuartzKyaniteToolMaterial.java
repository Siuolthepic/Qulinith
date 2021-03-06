package com.dev.siuolplex.items.tools.materials;

import com.dev.siuolplex.items.Items;
import com.dev.siuolplex.items.tools.base.BaseKyaniteToolMaterial;
import net.minecraft.recipe.Ingredient;

public class QuartzKyaniteToolMaterial implements BaseKyaniteToolMaterial {
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
        return 0.1f;
    }

    @Override
    public float getMovementSpeed() {
        return 0;
    }

    @Override
    public int getDurability() {
        return 700;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 8f;
    }

    @Override
    public float getAttackDamage() {
        return 3f;
    }

    @Override
    public int getMiningLevel() {
        return 3;
    }

    @Override
    public int getEnchantability() {
        return 10;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.QUARTZ_ASCENSION_KYANITE);
    }
}
