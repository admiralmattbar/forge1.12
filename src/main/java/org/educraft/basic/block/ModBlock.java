package org.educraft.basic.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import org.educraft.basic.ModMain;

public class ModBlock extends Block {

    protected String name;

    public ModBlock(String name, Material materialIn)
    {
        super(materialIn);
        this.name = name;
        setUnlocalizedName(name);
        setRegistryName(name);
    }

    public void registerItemModel(Item itemBlock)
    {
        ModMain.proxy.registerItemRenderer(itemBlock, 0, name);
    }

    public Item createItemBlock()
    {
        return new ItemBlock(this).setRegistryName(getRegistryName());
    }

    @Override
    public ModBlock setCreativeTab(CreativeTabs ct)
    {
        super.setCreativeTab(ct);
        return this;
    }

}
