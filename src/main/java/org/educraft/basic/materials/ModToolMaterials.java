package org.educraft.basic.materials;

import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

public class ModToolMaterials {

    public static final Item.ToolMaterial exampleToolMaterial = EnumHelper.addToolMaterial(
            "EXAMPLE", 2, 500, 6, 2, 14
    );
}
