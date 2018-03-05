package com.lucbeaulieu.mm.Objects.Tools;

import com.lucbeaulieu.mm.Init.ItemInit;
import com.lucbeaulieu.mm.Util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class ToolPickAxe extends ItemPickaxe implements IHasModel
{
    public ToolPickAxe(String name, ToolMaterial material)
    {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.TOOLS);

        ItemInit.ITEMS.add(this);
    }

    @Override
    public void registerModels() {

    }
}
