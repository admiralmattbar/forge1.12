package org.educraft.basic.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;
import org.educraft.basic.ModMain;

public class ModPickaxe extends ItemPickaxe {

    protected String name;

    protected ModPickaxe(ToolMaterial material) {
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
    public ModPickaxe setCreativeTab(CreativeTabs ct)
    {
        super.setCreativeTab(ct);
        return this;
    }

}
