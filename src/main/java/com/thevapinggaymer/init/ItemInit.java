package com.thevapinggaymer.init;

import com.thevapinggaymer.aratheirsland.AratheirsLand;
import net.minecraft.item.*;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = AratheirsLand.MOD_ID, bus = Bus.MOD)
@ObjectHolder(AratheirsLand.MOD_ID)
public class ItemInit
{
    // Items
    public static final Item crasteel_ingot = null;
    public static final Item crasteel_dust = null;
    public static final Item coal_dust = null;
    public static final Item crasteel_double_ingot = null;
    public static final Item iron_dust = null;
    public static final Item steel_dust = null;
    public static final Item steel_ingot = null;
    public static final Item liquid_crasteel = null;

    // Tools
    public static final Item crasteel_sword = null;
    public static final Item crasteel_pickaxe = null;
    public static final Item crasteel_axe = null;
    public static final Item crasteel_shovel = null;
    public static final Item crasteel_hoe = null;
    public static final Item steel_hammer = null;


    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event)
    {
        // Items
        event.getRegistry().register(new Item(new Item.Properties().group(AratheirsLand.AratheirsLandItemGroup.instance)).setRegistryName("crasteel_ingot"));
        event.getRegistry().register(new Item(new Item.Properties().group(AratheirsLand.AratheirsLandItemGroup.instance)).setRegistryName("crasteel_double_ingot"));
        event.getRegistry().register(new Item(new Item.Properties().group(AratheirsLand.AratheirsLandItemGroup.instance)).setRegistryName("liquid_crasteel"));
        event.getRegistry().register(new Item(new Item.Properties().group(AratheirsLand.AratheirsLandItemGroup.instance)).setRegistryName("steel_ingot"));
        event.getRegistry().register(new Item(new Item.Properties().group(AratheirsLand.AratheirsLandItemGroup.instance)).setRegistryName("crasteel_dust"));
        event.getRegistry().register(new Item(new Item.Properties().group(AratheirsLand.AratheirsLandItemGroup.instance)).setRegistryName("coal_dust"));
        event.getRegistry().register(new Item(new Item.Properties().group(AratheirsLand.AratheirsLandItemGroup.instance)).setRegistryName("iron_dust"));
        event.getRegistry().register(new Item(new Item.Properties().group(AratheirsLand.AratheirsLandItemGroup.instance)).setRegistryName("steel_dust"));

        // Tools
        event.getRegistry().register(new SwordItem(CrasteelItemTier.CRASTEEL, 7, 3.0f, new Item.Properties().group(AratheirsLand.AratheirsLandItemGroup.instance)).setRegistryName("crasteel_sword"));
        event.getRegistry().register(new PickaxeItem(CrasteelItemTier.CRASTEEL, 4, 3.0f, new Item.Properties().group(AratheirsLand.AratheirsLandItemGroup.instance)).setRegistryName("crasteel_pickaxe"));
        event.getRegistry().register(new AxeItem(CrasteelItemTier.CRASTEEL, 8, 2.0f, new Item.Properties().group(AratheirsLand.AratheirsLandItemGroup.instance)).setRegistryName("crasteel_axe"));
        event.getRegistry().register(new ShovelItem(CrasteelItemTier.CRASTEEL, 2, 3.0f, new Item.Properties().group(AratheirsLand.AratheirsLandItemGroup.instance)).setRegistryName("crasteel_shovel"));
        event.getRegistry().register(new HoeItem(CrasteelItemTier.CRASTEEL, 3.0f, new Item.Properties().group(AratheirsLand.AratheirsLandItemGroup.instance)).setRegistryName("crasteel_hoe"));
    }

    public enum CrasteelItemTier implements IItemTier
    {
        CRASTEEL(4, 1200, 20.0F, 7.0F, 20, () ->
        {
            return Ingredient.fromItems(ItemInit.crasteel_ingot);
        });

        private final int harvestLevel;
        private final int maxUses;
        private final float efficiency;
        private final float attackDamage;
        private final int enchantability;
        private final LazyValue<Ingredient> repairMaterial;

        private CrasteelItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial)
        {
            this.harvestLevel = harvestLevel;
            this.maxUses = maxUses;
            this.efficiency = efficiency;
            this.attackDamage = attackDamage;
            this.enchantability = enchantability;
            this.repairMaterial = new LazyValue<>(repairMaterial);
        }

        @Override
        public int getMaxUses()
        {
            return this.maxUses;
        }

        @Override
        public float getEfficiency()
        {
            return this.efficiency;
        }

        @Override
        public float getAttackDamage()
        {
            return this.attackDamage;
        }

        @Override
        public int getHarvestLevel()
        {
            return this.harvestLevel;
        }

        @Override
        public int getEnchantability()
        {
            return this.enchantability;
        }

        @Override
        public Ingredient getRepairMaterial()
        {
            return this.repairMaterial.getValue();
        }
    }

}
