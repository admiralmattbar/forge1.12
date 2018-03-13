package org.educraft.basic.item;

import net.minecraft.inventory.EntityEquipmentSlot;
import org.educraft.basic.ModMain;

public class ModArmor extends net.minecraft.item.ItemArmor {

    private String name;

    public ModArmor(ArmorMaterial materialIn, EntityEquipmentSlot slot, String name) {
        super(materialIn, 0, slot);
        setRegistryName(name);
        setUnlocalizedName(name);
        this.name = name;
    }

    public void registerItemModel() {
        ModMain.proxy.registerItemRenderer(this, 0, name);
    }
}
