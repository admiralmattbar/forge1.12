package org.educraft.basic.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import org.educraft.basic.ModMain;

public class ModItem extends Item {

    protected String name;

    public ModItem(String name)
    {
        this.name = name;
        setUnlocalizedName(name);
        setRegistryName(name);
    }

    public void registerItemModel()
    {
        ModMain.proxy.registerItemRenderer(this, 0, name);
    }

    @Override
    public ModItem setCreativeTab(CreativeTabs ct)
    {
        super.setCreativeTab(ct);
        return this;
    }
}