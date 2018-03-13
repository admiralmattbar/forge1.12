package org.educraft.basic.materials;

import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;
import org.educraft.basic.Reference;

public class ModArmorMaterials {

    public static final ItemArmor.ArmorMaterial exampleArmorMaterial = EnumHelper.addArmorMaterial(
            "EXAMPLE", Reference.modId + ":example", 15, new int[]{2, 5, 6, 2}, 50, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.5f
    );

}
