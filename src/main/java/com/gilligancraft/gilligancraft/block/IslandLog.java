package com.gilligancraft.gilligancraft.block;

import com.gilligancraft.gilligancraft.item.ModItems;
import com.gilligancraft.gilligancraft.lib.Constants;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLog;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.item.ItemBlock;
import java.util.List;
import java.util.Random;

public class IslandLog extends BlockLog {

    public static final String[] saplings = new String[]{"banana"};

    /**
     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
    */





    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item item, CreativeTabs tabs, List list)
    {
        for ( int i = 0; i < saplings.length; i++) {
            list.add(new ItemStack(item, 1, i));
        }
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister p_149651_1_) {
        this.field_150167_a = new IIcon[saplings.length];
        this.field_150166_b = new IIcon[saplings.length];

        for (int i = 0; i < this.field_150167_a.length; ++i) {
            this.field_150167_a[i] = p_149651_1_.registerIcon(Constants.MOD_ID + ":" + this.getUnlocalizedName().substring(5) + "_" + saplings[i]);
            this.field_150166_b[i] = p_149651_1_.registerIcon(Constants.MOD_ID + ":" + this.getUnlocalizedName().substring(5) + "_" + saplings[i] + "_top");
        }
    }




    public int quantityDropped(Random p_149745_1_)
    {
        return 0;
    }

    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return Item.getItemFromBlock(this);
    }


    public void breakBlock(World p_149749_1_, int p_149749_2_, int p_149749_3_, int p_149749_4_, Block p_149749_5_, int p_149749_6_)
        {
            byte b0 = 4;
            int i1 = b0 + 1;

            if (p_149749_1_.checkChunksExist(p_149749_2_ - i1, p_149749_3_ - i1, p_149749_4_ - i1, p_149749_2_ + i1, p_149749_3_ + i1, p_149749_4_ + i1))
            {
                for (int j1 = -b0; j1 <= b0; ++j1)
                {
                    for (int k1 = -b0; k1 <= b0; ++k1)
                    {
                        for (int l1 = -b0; l1 <= b0; ++l1)
                        {
                            Block block = p_149749_1_.getBlock(p_149749_2_ + j1, p_149749_3_ + k1, p_149749_4_ + l1);
                            if (block.isLeaves(p_149749_1_, p_149749_2_ + j1, p_149749_3_ + k1, p_149749_4_ + l1))
                            {
                                block.beginLeavesDecay(p_149749_1_, p_149749_2_ + j1, p_149749_3_ + k1, p_149749_4_ + l1);
                            }
                        }
                    }
                }
            }
        }

    public boolean isWood(IBlockAccess world, int x, int y, int z)
    {
        return true;
    }
    }


