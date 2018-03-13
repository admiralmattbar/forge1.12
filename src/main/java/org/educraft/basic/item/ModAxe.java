package org.educraft.basic.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;
import org.educraft.basic.ModMain;

public class ModAxe extends ItemAxe {

    protected String name;

    protected ModAxe(ToolMaterial material) {
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
    public ModAxe setCreativeTab(CreativeTabs ct)
    {
        super.setCreativeTab(ct);
        return this;
    }
}
