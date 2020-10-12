package com.thevapinggaymer.init;

import com.thevapinggaymer.aratheirsland.AratheirsLand;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = AratheirsLand.MOD_ID, bus = Bus.MOD)
@ObjectHolder(AratheirsLand.MOD_ID)
public class ItemInit
{
    public static final Item crasteel_ingot = null;

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event)
    {
        event.getRegistry().register(new Item(new Item.Properties().group(ItemGroup.MATERIALS)).setRegistryName("crasteel_ingot"));
    }
}
