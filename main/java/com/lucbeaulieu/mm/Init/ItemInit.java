package com.lucbeaulieu.mm.Init;

import com.lucbeaulieu.mm.Objects.Items.ItemBase;
import net.minecraft.item.Item;

import java.util.*;

public class ItemInit
{
    public static final List<Item> ITEMS = new ArrayList<>();

    public static Item INGOT_COPPER = new ItemBase("ingot_copper");
    public static Item INGOT_TIN = new ItemBase("ingot_tin");
    public static Item INGOT_SILVER = new ItemBase("ingot_silver");
    public static Item INGOT_BRONZE = new ItemBase("ingot_bronze");
    public static Item ITEM_COBALT = new ItemBase("item_cobalt");
    public static Item ITEM_MANGANESE = new ItemBase("item_manganese");
}
