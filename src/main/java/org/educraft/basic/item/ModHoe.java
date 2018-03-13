package org.educraft.basic.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;
import org.educraft.basic.ModMain;

public class ModHoe extends ItemHoe {

    protected String name;

    public ModHoe(ToolMaterial material) {
        super(material);
        this.name = name;
        setUnlocalizedName(name);
        setRegistryName(name);
    }

    public void registerItemModel()
    {
        ModMain.proxy.registerItemRenderer(this, 0, name);
    }

    @Override
    public ModHoe setCreativeTab(CreativeTabs ct)
    {
        super.setCreativeTab(ct);
        return this;
    }
}
