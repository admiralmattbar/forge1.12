package org.educraft.basic.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;
import org.educraft.basic.ModMain;

public class ModSword extends ItemSword {

    protected String name;

    public ModSword(ToolMaterial material) {
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
    public ModSword setCreativeTab(CreativeTabs ct)
    {
        super.setCreativeTab(ct);
        return this;
    }
}
