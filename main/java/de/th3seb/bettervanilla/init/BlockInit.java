package de.th3seb.bettervanilla.init;

import de.th3seb.bettervanilla.objects.blocks.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class BlockInit {

    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block BLOCK_BLACK_DIAMOND = new BlockBase("block_black_diamond", Material.IRON);
}
