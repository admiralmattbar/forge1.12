package org.educraft.basic.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.IForgeRegistry;

public class ModItemRegistry {

    public static ModItem example = new ModItem("example").setCreativeTab(CreativeTabs.MISC);

    public static void register(IForgeRegistry<Item> registry)
    {
        registry.registerAll(
                example
        );
    }

    public static void registerModels()
    {
        example.registerItemModel();
    }

}
