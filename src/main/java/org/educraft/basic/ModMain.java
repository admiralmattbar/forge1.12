package org.educraft.basic;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.educraft.basic.block.ModBlockRegistry;
import org.educraft.basic.item.ModItemRegistry;
import org.educraft.basic.proxy.CommonProxy;

@Mod(modid = Reference.modId, name = Reference.name, version = Reference.version)
public class ModMain {

    @Mod.Instance(Reference.modId)
    public static ModMain instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        proxy.preInit();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit();
    }

    @Mod.EventBusSubscriber
    public static class RegistrationHandler
    {
        @SubscribeEvent
        public static void registerItems(RegistryEvent.Register<Item> event)
        {
            ModItemRegistry.register(event.getRegistry());
            ModBlockRegistry.registerItemBlock(event.getRegistry());
        }

        @SubscribeEvent
        public static void registerModels(ModelRegistryEvent event)
        {
            ModItemRegistry.registerModels();
            ModBlockRegistry.registerModels();
        }

        @SubscribeEvent
        public static void registerBlocks(RegistryEvent.Register<Block> event)
        {
            ModBlockRegistry.register(event.getRegistry());
        }

    }

}
