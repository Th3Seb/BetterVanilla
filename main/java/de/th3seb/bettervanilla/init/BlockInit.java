package de.th3seb.bettervanilla.init;

import de.th3seb.bettervanilla.objects.blocks.BlockBlackDiamond;
import de.th3seb.bettervanilla.objects.blocks.ReinforcedObsidianBlock;
import de.th3seb.bettervanilla.objects.blocks.ore.EmeraldShardOre;
import de.th3seb.bettervanilla.objects.blocks.ore.copper.CopperEndOre;
import de.th3seb.bettervanilla.objects.blocks.ore.copper.CopperNetherOre;
import de.th3seb.bettervanilla.objects.blocks.ore.copper.CopperOre;
import de.th3seb.bettervanilla.objects.blocks.ore.ruby.RubyEndOre;
import de.th3seb.bettervanilla.objects.blocks.ore.ruby.RubyNetherOre;
import de.th3seb.bettervanilla.objects.blocks.ore.ruby.RubyOre;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class BlockInit {

    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block BLOCK_BLACK_DIAMOND = new BlockBlackDiamond("block_black_diamond", Material.IRON);

    public static final Block REINFORCED_OBSIDIAN = new ReinforcedObsidianBlock("reinforced_obsidian", Material.ROCK);

    //Ore-----------------------------------------------------------------------------------------------------------
    //Overworld
    public static final Block RUBY_ORE = new RubyOre("ore_ruby", Material.IRON);
    public static final Block EMERALD_SHARD_ORE = new EmeraldShardOre("emerald_shard_ore", Material.ROCK);
    public static final Block COPPER_ORE = new CopperOre("copper_ore", Material.ROCK);

    //Nether
    public static final Block RUBY_NETHER_ORE = new RubyNetherOre("ore_nether_ruby", Material.IRON);
    public static final Block COPPER_NETHER_ORE = new CopperNetherOre("copper_nether_ore", Material.ROCK);

    //End
    public static final Block RUBY_END_ORE = new RubyEndOre("ore_end_ruby", Material.IRON);
    public static final Block COPPER_END_ORE = new CopperEndOre("copper_end_ore",Material.ROCK);

}
