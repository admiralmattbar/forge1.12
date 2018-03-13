package org.educraft.basic.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.IForgeRegistry;
import org.educraft.basic.item.ModItem;

public class ModBlockRegistry
{

    public static ModBlock exampleBlock = new ModBlock("example_block", Material.IRON).setCreativeTab(CreativeTabs.MISC);

    public static void register(IForgeRegistry<Block> registry) {
        registry.registerAll(
                exampleBlock
        );
    }

    public static void registerItemBlock(IForgeRegistry<Item> registry)
    {
        registry.registerAll(
                exampleBlock.createItemBlock()
        );
    }

    public static void registerModels()
    {
        exampleBlock.registerItemModel(Item.getItemFromBlock(exampleBlock));
    }

}
