package com.lucbeaulieu.mm.Init;

import com.lucbeaulieu.mm.Objects.Blocks.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class BlockInit
{
    public static final List<Block> BLOCKS = new ArrayList<>();

    public static Block BLOCK_COPPER = new BlockBase("block_copper", Material.IRON);
    public static Block BLOCK_TIN = new BlockBase("block_tin", Material.IRON);
    public static Block BLOCK_SILVER = new BlockBase("block_silver", Material.IRON);
    public static Block BLOCK_BRONZE = new BlockBase("block_bronze", Material.IRON);

}
