package com.thevapinggaymer.init;

import com.thevapinggaymer.aratheirsland.AratheirsLand;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(AratheirsLand.MOD_ID)
@Mod.EventBusSubscriber(modid = AratheirsLand.MOD_ID, bus = Bus.MOD)
public class BlockInit
{
    public static final Block crasteel_ore = null;
    // Blocks
    @SubscribeEvent
    public static void registerBlocks(final RegistryEvent.Register<Block> event)
    {
        event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 15.0f)
        .sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName("crasteel_ore"));
    }
    // Block Items
    @SubscribeEvent
    public static void registerBlockItems(final RegistryEvent.Register<Item> event)
    {
        event.getRegistry().register(new BlockItem(crasteel_ore, new Item.Properties().group(ItemGroup.MATERIALS)).setRegistryName("crasteel_ore"));
    }
}
