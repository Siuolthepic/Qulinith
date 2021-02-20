package com.dev.siuolplex.items;

import com.dev.siuolplex.ArmorAugmentation;
import com.dev.siuolplex.blocks.Blocks;
import com.dev.siuolplex.items.armor.base.BaseIronKykiniteArmorItem;
import com.dev.siuolplex.items.armor.base.BaseIronKykiniteArmorMaterial;
import com.dev.siuolplex.items.armor.base.BaseKykiniteArmorItem;
import com.dev.siuolplex.items.armor.base.BaseKykiniteArmorMaterial;
import com.dev.siuolplex.items.armor.materials.*;
import com.dev.siuolplex.items.tools.base.*;
import com.dev.siuolplex.items.tools.materials.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class Items {

     // Registered Armor and Tool Materials
      // Each of the materials usually hook onto the BaseKykinite____ material. Maybe later in development Ill split off the armor material stuff into their own things.
    public static final ArmorMaterial KykiniteArmorMaterials = new KykiniteArmorMaterials();
    public static final BaseKykiniteArmorMaterial QuartzKykiniteArmorMaterials = new QuartzKykiniteArmorMaterials();
    public static final BaseKykiniteArmorMaterial PoweredQuartzKykiniteArmorMaterials = new PoweredQuartzKykiniteArmorMaterials();
    public static final BaseKykiniteArmorMaterial GoldKykiniteArmorMaterials = new GoldKykiniteArmorMaterials();
    public static final BaseKykiniteArmorMaterial DiamondKykiniteArmorMaterials = new DiamondKykiniteArmorMaterials();
    public static final BaseKykiniteArmorMaterial NetheriteKykiniteArmorMaterials = new NetheriteKykiniteArmorMaterials();
    public static final BaseIronKykiniteArmorMaterial IronKykiniteArmorMaterials = new IronKykiniteArmorMaterials();
    public static final BaseKykiniteToolMaterial KykiniteToolMaterial = new KykiniteToolMaterial();
    public static final BaseKykiniteToolMaterial GoldKykiniteToolMaterial = new GoldKykiniteToolMaterial();
    public static final BaseKykiniteToolMaterial IronKykiniteToolMaterial = new IronKykiniteToolMaterial();
    public static final BaseKykiniteToolMaterial DiamondKykiniteToolMaterial = new DiamondKykiniteToolMaterial();
    public static final BaseKykiniteToolMaterial NetheriteKykiniteToolMaterial = new NetheriteKykiniteToolMaterial();
    public static final BaseQuartzKykiniteToolMaterial QuartzKykiniteToolMaterial = new QuartzKykiniteToolMaterial();
    public static final BaseQuartzKykiniteToolMaterial PoweredQuartzKykiniteToolMaterial = new PoweredQuartzKykiniteToolMaterial();

// Item Registry. I perfer it this way for some reasons.
    // Blocks and Misc Items
    public static final Item KYKINITE_ORE = register("kykinite_ore", new BlockItem(Blocks.KYKINITE_ORE, new Item.Settings().group(ArmorAugmentation.ARMORAUGMENT)));
    public static final Item KYKINITE_BLOCK = register("kykinite_block", new BlockItem(Blocks.KYKINITE_BLOCK, new Item.Settings().group(ArmorAugmentation.ARMORAUGMENT)));
    public static final Item KYKINITE = register("kykinite", new Item(new Item.Settings().group(ArmorAugmentation.ARMORAUGMENT)));
    public static final Item REFINED_KYKINITE = register("refined_kykinite", new Item(new Item.Settings().group(ArmorAugmentation.ARMORAUGMENT)));
    public static final Item KYKINITE_SHARD = register("kykinite_shard", new Item(new Item.Settings().group(ArmorAugmentation.ARMORAUGMENT)));
    public static final Item REVERSION_TELAITE = register("reversion_telaite", new Item(new Item.Settings()));
    public static final Item TELAITE = register("telaite", new Item(new Item.Settings()));
    public static final Item TELAITE_SHARD = register("telaite_shard", new Item(new Item.Settings()));
    public static final Item TELAITE_ORE = register("telaite_ore", new BlockItem(Blocks.TELAITE_ORE, new Item.Settings()));
    public static final Item TELAITE_BLOCK = register("telaite_block", new BlockItem(Blocks.TELAITE_BLOCK, new Item.Settings()));

    // Ascension Items
    public static final Item GOLDEN_ASCENSION_KYKINITE = register("golden_ascension_kykinite", new Item(new Item.Settings().group(ArmorAugmentation.ARMORAUGMENT)));
    public static final Item POWERED_QUARTZ_ASCENSION_KYKINITE = register("powered_quartz_ascension_kykinite", new Item(new Item.Settings().group(ArmorAugmentation.ARMORAUGMENT)));
    public static final Item QUARTZ_ASCENSION_KYKINITE = register("quartz_ascension_kykinite", new Item(new Item.Settings().group(ArmorAugmentation.ARMORAUGMENT)));
    public static final Item DIAMOND_ASCENSION_KYKINITE = register("diamond_ascension_kykinite", new Item(new Item.Settings().group(ArmorAugmentation.ARMORAUGMENT)));
    public static final Item IRON_ASCENSION_KYKINITE = register("iron_ascension_kykinite", new Item(new Item.Settings().group(ArmorAugmentation.ARMORAUGMENT)));
    public static final Item NETHERITE_ASCENSION_KYKINITE = register("netherite_ascension_kykinite", new Item(new Item.Settings().group(ArmorAugmentation.ARMORAUGMENT).fireproof()));

    // Base(d) Kykinite
    public static final Item KYKINITE_HELMET = register("kykinite_helmet", new ArmorItem(KykiniteArmorMaterials, EquipmentSlot.HEAD, new Item.Settings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.UNCOMMON)));
    public static final Item KYKINITE_CHESTPLATE = register("kykinite_chestplate", new ArmorItem(KykiniteArmorMaterials, EquipmentSlot.CHEST, new Item.Settings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.UNCOMMON)));
    public static final Item KYKINITE_LEGGINGS = register("kykinite_leggings", new ArmorItem(KykiniteArmorMaterials, EquipmentSlot.LEGS, new Item.Settings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.UNCOMMON)));
    public static final Item KYKINITE_BOOTS = register("kykinite_boots", new ArmorItem(KykiniteArmorMaterials, EquipmentSlot.FEET, new Item.Settings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.UNCOMMON)));
    public static final Item KYKINITE_SWORD = register("kykinite_sword", new BaseKykiniteSwordItem(KykiniteToolMaterial, 4, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.UNCOMMON)));
    public static final Item KYKINITE_AXE = register("kykinite_axe", new BaseKykiniteAxeItem(KykiniteToolMaterial, 7, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.UNCOMMON)));
    public static final Item KYKINITE_PICKAXE = register("kykinite_pickaxe", new BaseKykinitePickaxeItem(KykiniteToolMaterial, 3, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.UNCOMMON)));
    public static final Item KYKINITE_SHOVEL = register("kykinite_shovel", new BaseKykiniteShovelItem(KykiniteToolMaterial, 2.5f, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.UNCOMMON)));
    public static final Item KYKINITE_HOE = register("kykinite_hoe", new BaseKykiniteHoeItem(KykiniteToolMaterial, -1, -0.5f, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.UNCOMMON)));

    // Quartz Kykinite
    public static final Item QUARTZ_KYKINITE_HELMET = register("quartz_kykinite_helmet", new BaseKykiniteArmorItem(QuartzKykiniteArmorMaterials, EquipmentSlot.HEAD, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));
    public static final Item QUARTZ_KYKINITE_CHESTPLATE = register("quartz_kykinite_chestplate", new BaseKykiniteArmorItem(QuartzKykiniteArmorMaterials, EquipmentSlot.CHEST, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));
    public static final Item QUARTZ_KYKINITE_LEGGINGS = register("quartz_kykinite_leggings", new BaseKykiniteArmorItem(QuartzKykiniteArmorMaterials, EquipmentSlot.LEGS, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));
    public static final Item QUARTZ_KYKINITE_BOOTS = register("quartz_kykinite_boots", new BaseKykiniteArmorItem(QuartzKykiniteArmorMaterials, EquipmentSlot.FEET, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));
    public static final Item QUARTZ_KYKINITE_SWORD = register("quartz_kykinite_sword", new BaseQuartzKykiniteSwordItem(QuartzKykiniteToolMaterial, 4, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));
    public static final Item QUARTZ_KYKINITE_AXE = register("quartz_kykinite_axe", new BaseQuartzKykiniteAxeItem(QuartzKykiniteToolMaterial, 7, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));
    public static final Item QUARTZ_KYKINITE_PICKAXE = register("quartz_kykinite_pickaxe", new BaseQuartzKykinitePickaxeItem(QuartzKykiniteToolMaterial, 3, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));
    public static final Item QUARTZ_KYKINITE_SHOVEL = register("quartz_kykinite_shovel", new BaseQuartzKykiniteShovelItem(QuartzKykiniteToolMaterial, 2.5f, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));
    public static final Item QUARTZ_KYKINITE_HOE = register("quartz_kykinite_hoe", new BaseQuartzKykiniteHoeItem(QuartzKykiniteToolMaterial, -2, 0f, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));

    // Powered Quartz Kykinite
    public static final Item POWERED_QUARTZ_KYKINITE_HELMET = register("powered_quartz_kykinite_helmet", new BaseKykiniteArmorItem(PoweredQuartzKykiniteArmorMaterials, EquipmentSlot.HEAD, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.EPIC)));
    public static final Item POWERED_QUARTZ_KYKINITE_CHESTPLATE = register("powered_quartz_kykinite_chestplate", new BaseKykiniteArmorItem(PoweredQuartzKykiniteArmorMaterials, EquipmentSlot.CHEST, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.EPIC)));
    public static final Item POWERED_QUARTZ_KYKINITE_LEGGINGS = register("powered_quartz_kykinite_leggings", new BaseKykiniteArmorItem(PoweredQuartzKykiniteArmorMaterials, EquipmentSlot.LEGS, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.EPIC)));
    public static final Item POWERED_QUARTZ_KYKINITE_BOOTS = register("powered_quartz_kykinite_boots", new BaseKykiniteArmorItem(PoweredQuartzKykiniteArmorMaterials, EquipmentSlot.FEET, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.EPIC)));
    public static final Item POWERED_QUARTZ_KYKINITE_SWORD = register("powered_quartz_kykinite_sword", new BaseQuartzKykiniteSwordItem(PoweredQuartzKykiniteToolMaterial, 4, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));
    public static final Item POWERED_QUARTZ_KYKINITE_AXE = register("powered_quartz_kykinite_axe", new BaseQuartzKykiniteAxeItem(PoweredQuartzKykiniteToolMaterial, 7, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));
    public static final Item POWERED_QUARTZ_KYKINITE_PICKAXE = register("powered_quartz_kykinite_pickaxe", new BaseQuartzKykinitePickaxeItem(PoweredQuartzKykiniteToolMaterial, 3, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));
    public static final Item POWERED_QUARTZ_KYKINITE_SHOVEL = register("powered_quartz_kykinite_shovel", new BaseQuartzKykiniteShovelItem(PoweredQuartzKykiniteToolMaterial, 2.5f, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));
    public static final Item POWERED_QUARTZ_KYKINITE_HOE = register("powered_quartz_kykinite_hoe", new BaseQuartzKykiniteHoeItem(PoweredQuartzKykiniteToolMaterial, -2, 0f, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));

    //Golden Kykinite
    public static final Item GOLD_KYKINITE_HELMET = register("golden_kykinite_helmet", new BaseKykiniteArmorItem(GoldKykiniteArmorMaterials, EquipmentSlot.HEAD, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));
    public static final Item GOLD_KYKINITE_CHESTPLATE = register("golden_kykinite_chestplate", new BaseKykiniteArmorItem(GoldKykiniteArmorMaterials, EquipmentSlot.CHEST, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));
    public static final Item GOLD_KYKINITE_LEGGINGS = register("golden_kykinite_leggings", new BaseKykiniteArmorItem(GoldKykiniteArmorMaterials, EquipmentSlot.LEGS, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));
    public static final Item GOLD_KYKINITE_BOOTS = register("golden_kykinite_boots", new BaseKykiniteArmorItem(GoldKykiniteArmorMaterials, EquipmentSlot.FEET, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));
    public static final Item GOLD_KYKINITE_SWORD = register("golden_kykinite_sword", new BaseKykiniteSwordItem(GoldKykiniteToolMaterial, 4, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));
    public static final Item GOLD_KYKINITE_AXE = register("golden_kykinite_axe", new BaseKykiniteAxeItem(GoldKykiniteToolMaterial, 7, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));
    public static final Item GOLD_KYKINITE_PICKAXE = register("golden_kykinite_pickaxe", new BaseKykinitePickaxeItem(GoldKykiniteToolMaterial, 3, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));
    public static final Item GOLD_KYKINITE_SHOVEL = register("golden_kykinite_shovel", new BaseKykiniteShovelItem(GoldKykiniteToolMaterial, 2.5f, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));
    public static final Item GOLD_KYKINITE_HOE = register("golden_kykinite_hoe", new BaseKykiniteHoeItem(GoldKykiniteToolMaterial, -2, 0f, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));

    //Diamond Kykinite
    public static final Item DIAMOND_KYKINITE_HELMET = register("diamond_kykinite_helmet", new BaseKykiniteArmorItem(DiamondKykiniteArmorMaterials, EquipmentSlot.HEAD, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));
    public static final Item DIAMOND_KYKINITE_CHESTPLATE = register("diamond_kykinite_chestplate", new BaseKykiniteArmorItem(DiamondKykiniteArmorMaterials, EquipmentSlot.CHEST, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));
    public static final Item DIAMOND_KYKINITE_LEGGINGS = register("diamond_kykinite_leggings", new BaseKykiniteArmorItem(DiamondKykiniteArmorMaterials, EquipmentSlot.LEGS, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));
    public static final Item DIAMOND_KYKINITE_BOOTS = register("diamond_kykinite_boots", new BaseKykiniteArmorItem(DiamondKykiniteArmorMaterials, EquipmentSlot.FEET, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));
    public static final Item DIAMOND_KYKINITE_SWORD = register("diamond_kykinite_sword", new BaseKykiniteSwordItem(DiamondKykiniteToolMaterial, 4, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));
    public static final Item DIAMOND_KYKINITE_AXE = register("diamond_kykinite_axe", new BaseKykiniteAxeItem(DiamondKykiniteToolMaterial, 7, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));
    public static final Item DIAMOND_KYKINITE_PICKAXE = register("diamond_kykinite_pickaxe", new BaseKykinitePickaxeItem(DiamondKykiniteToolMaterial, 3, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));
    public static final Item DIAMOND_KYKINITE_SHOVEL = register("diamond_kykinite_shovel", new BaseKykiniteShovelItem(DiamondKykiniteToolMaterial, 2.5f, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));
    public static final Item DIAMOND_KYKINITE_HOE = register("diamond_kykinite_hoe", new BaseKykiniteHoeItem(DiamondKykiniteToolMaterial, -4, 0f, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));

    //Netherite Kykinite
    public static final Item NETHERITE_KYKINITE_HELMET = register("netherite_kykinite_helmet", new BaseKykiniteArmorItem(NetheriteKykiniteArmorMaterials, EquipmentSlot.HEAD, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.EPIC).fireproof()));
    public static final Item NETHERITE_KYKINITE_CHESTPLATE = register("netherite_kykinite_chestplate", new BaseKykiniteArmorItem(NetheriteKykiniteArmorMaterials, EquipmentSlot.CHEST, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.EPIC).fireproof()));
    public static final Item NETHERITE_KYKINITE_LEGGINGS = register("netherite_kykinite_leggings", new BaseKykiniteArmorItem(NetheriteKykiniteArmorMaterials, EquipmentSlot.LEGS, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.EPIC).fireproof()));
    public static final Item NETHERITE_KYKINITE_BOOTS = register("netherite_kykinite_boots", new BaseKykiniteArmorItem(NetheriteKykiniteArmorMaterials, EquipmentSlot.FEET, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.EPIC).fireproof()));
    public static final Item NETHERITE_KYKINITE_SWORD = register("netherite_kykinite_sword", new BaseKykiniteSwordItem(NetheriteKykiniteToolMaterial, 4, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.EPIC).fireproof()));
    public static final Item NETHERITE_KYKINITE_AXE = register("netherite_kykinite_axe", new BaseKykiniteAxeItem(NetheriteKykiniteToolMaterial, 7, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.EPIC).fireproof()));
    public static final Item NETHERITE_KYKINITE_PICKAXE = register("netherite_kykinite_pickaxe", new BaseKykinitePickaxeItem(NetheriteKykiniteToolMaterial, 3, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.EPIC).fireproof()));
    public static final Item NETHERITE_KYKINITE_SHOVEL = register("netherite_kykinite_shovel", new BaseKykiniteShovelItem(NetheriteKykiniteToolMaterial, 2.5f, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.EPIC).fireproof()));
    public static final Item NETHERITE_KYKINITE_HOE = register("netherite_kykinite_hoe", new BaseKykiniteHoeItem(NetheriteKykiniteToolMaterial, -6, 1f, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.EPIC).fireproof()));

    //Iron Kykinite - Uses a special "BaseIronKykinite" in armor due problems with armor points
    public static final Item IRON_KYKINITE_HELMET = register("iron_kykinite_helmet", new BaseIronKykiniteArmorItem(IronKykiniteArmorMaterials, EquipmentSlot.HEAD, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.EPIC)));
    public static final Item IRON_KYKINITE_CHESTPLATE = register("iron_kykinite_chestplate", new BaseIronKykiniteArmorItem(IronKykiniteArmorMaterials, EquipmentSlot.CHEST, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.EPIC)));
    public static final Item IRON_KYKINITE_LEGGINGS = register("iron_kykinite_leggings", new BaseIronKykiniteArmorItem(IronKykiniteArmorMaterials, EquipmentSlot.LEGS, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.EPIC)));
    public static final Item IRON_KYKINITE_BOOTS = register("iron_kykinite_boots", new BaseIronKykiniteArmorItem(IronKykiniteArmorMaterials, EquipmentSlot.FEET, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.EPIC)));
    public static final Item IRON_KYKINITE_SWORD = register("iron_kykinite_sword", new BaseKykiniteSwordItem(IronKykiniteToolMaterial, 4, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));
    public static final Item IRON_KYKINITE_AXE = register("iron_kykinite_axe", new BaseKykiniteAxeItem(IronKykiniteToolMaterial, 7, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));
    public static final Item IRON_KYKINITE_PICKAXE = register("iron_kykinite_pickaxe", new BaseKykinitePickaxeItem(IronKykiniteToolMaterial, 3, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));
    public static final Item IRON_KYKINITE_SHOVEL = register("iron_kykinite_shovel", new BaseKykiniteShovelItem(IronKykiniteToolMaterial, 2.5f, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));
    public static final Item IRON_KYKINITE_HOE = register("irom_kykinite_hoe", new BaseKykiniteHoeItem(IronKykiniteToolMaterial, -2, 0f, new FabricItemSettings().group(ArmorAugmentation.ARMORAUGMENT).rarity(Rarity.RARE)));

    private static Item register(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier("kykinite", name), item);
        // Remember, the namespace is kykinite.

    }

//Initialization method thingy.
    public static void init() {

    }
}