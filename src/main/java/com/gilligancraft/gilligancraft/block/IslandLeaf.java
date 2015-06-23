package com.gilligancraft.gilligancraft.block;

import com.gilligancraft.gilligancraft.item.ModItems;
import com.gilligancraft.gilligancraft.lib.Constants;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockLeavesBase;
import net.minecraft.block.BlockOldLeaf;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.ColorizerFoliage;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.IShearable;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class IslandLeaf extends BlockLeaves
{
    public static final String[][] field_150130_N = new String[][] {{"leaves_banana"}, {"leaves_banana_opaque"}};
    public static final String[] field_150131_O = new String[] {"banana"};


    /**
     * Returns the color this block should be rendered. Used by leaves.
     */
    @SideOnly(Side.CLIENT)
    public int getRenderColor(int p_149741_1_)
    {
        return (p_149741_1_ & 3) == 1 ? ColorizerFoliage.getFoliageColorPine() : ((p_149741_1_ & 3) == 2 ? ColorizerFoliage.getFoliageColorBirch() : super.getRenderColor(p_149741_1_));
    }

    /**
     * Returns a integer with hex for 0xrrggbb with this color multiplied against the blocks color. Note only called
     * when first determining what to render.
     */
    @SideOnly(Side.CLIENT)
    public int colorMultiplier(IBlockAccess p_149720_1_, int p_149720_2_, int p_149720_3_, int p_149720_4_)
    {
        int l = p_149720_1_.getBlockMetadata(p_149720_2_, p_149720_3_, p_149720_4_);
        return (l & 3) == 1 ? ColorizerFoliage.getFoliageColorPine() : ((l & 3) == 2 ? ColorizerFoliage.getFoliageColorBirch() : super.colorMultiplier(p_149720_1_, p_149720_2_, p_149720_3_, p_149720_4_));
    }

    protected void func_150124_c(World world, int x, int y, int z, int p_150124_5_, int p_150124_6_)
    {
        if ((p_150124_5_ & 3) == 0 && world.rand.nextInt(p_150124_6_) == 0)
        {
            this.dropBlockAsItem(world, x, y, z, new ItemStack(ModItems.bananaFood, 5, 0));
        }
    }

    protected int func_150123_b(int p_150123_1_)
    {
        int j = super.func_150123_b(p_150123_1_);

        if ((p_150123_1_ & 3) == 3)
        {
            j = 40;
        }

        return j;
    }


     // Gets the block's texture. Args: side, meta

    @Override
    public IIcon getIcon(int side, int meta)
    {
        return (meta & 3) == 1 ? this.field_150129_M[this.field_150127_b][1] : ((meta & 3) == 3 ? this.field_150129_M[this.field_150127_b][3] : ((meta & 3) == 2 ? this.field_150129_M[this.field_150127_b][2] : this.field_150129_M[this.field_150127_b][0]));
    }

    /**
     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
     */
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item item, CreativeTabs tabs, List list)
    {
        list.add(new ItemStack(item, 1, 0));

    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        for (int i = 0; i < field_150130_N.length; ++i)
        {
            this.field_150129_M[i] = new IIcon[field_150130_N[i].length];

            for (int j = 0; j < field_150130_N[i].length; ++j)
            {
                this.field_150129_M[i][j] = iconRegister.registerIcon(Constants.MOD_ID + ":" + field_150130_N[i][j]);
            }
        }
    }

    public String[] func_150125_e()
    {
        return field_150131_O;
    }
}