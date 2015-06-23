package com.gilligancraft.gilligancraft.block;
import com.gilligancraft.gilligancraft.item.ItemLeafBlock;
import com.gilligancraft.gilligancraft.item.ItemLogBlocks;
import com.gilligancraft.gilligancraft.item.ItemSaplingBlock;
import com.gilligancraft.gilligancraft.world.gen.feature.WorldGenBananaTree;
import com.gilligancraft.gilligancraft.world.gen.feature.WorldGeneratorGilligancraft;
import com.sun.tools.javac.code.Attribute;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockOldLog;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;import
com.gilligancraft.gilligancraft.lib.Constants;
import cpw.mods.fml.common.registry.GameRegistry;
import scala.tools.nsc.backend.icode.analysis.CopyPropagation;

import java.security.cert.Certificate;


public final class ModBlocks {
    public static Block blockBlackSand;
    public static Block blockFarmsand;
    public static Block islandLog;
    public static Block islandSapling;
    public static Block islandLeaf;



    public static void init() {


        GameRegistry.registerBlock(
                blockBlackSand = new BlockBlackSand().setBlockName(Constants.MOD_ID + "_" + "blackSand")
                        .setBlockTextureName(Constants.MOD_ID + ":" + "black_sand"), "blackSand");
        GameRegistry.registerBlock(
                blockFarmsand = new BlockFarmsand().setBlockName(Constants.MOD_ID + "_" + "farmsand")
                        .setBlockTextureName(Constants.MOD_ID + ":" + "farmsand"), "farmsand");

        GameRegistry.addShapelessRecipe(new ItemStack(blockBlackSand, 2), new Object[]{Blocks.sand, Blocks.dirt});





        islandSapling = new IslandSapling().setHardness(0.0F).setBlockName("sapling");
        islandLeaf = new IslandLeaf().setBlockName("leaves").setBlockTextureName("leaves");
        islandLog = new IslandLog().setBlockName("log").setBlockTextureName("log");


        GameRegistry.registerBlock(islandLeaf, ItemLeafBlock.class, islandLeaf.getUnlocalizedName());
        GameRegistry.registerBlock(islandLog, ItemLogBlocks.class, islandLog.getUnlocalizedName());
        GameRegistry.registerBlock(islandSapling, ItemSaplingBlock.class, islandLeaf.getUnlocalizedName().substring(5));








    }
}






