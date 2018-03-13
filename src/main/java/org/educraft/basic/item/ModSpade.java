package org.educraft.basic.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;
import org.educraft.basic.ModMain;

public class ModSpade extends ItemSpade {

    protected String name;

    public ModSpade(ToolMaterial material) {
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
    public ModSpade setCreativeTab(CreativeTabs ct)
    {
        super.setCreativeTab(ct);
        return this;
    }
}
