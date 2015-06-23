package com.gilligancraft.gilligancraft.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemLeaves;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.ColorizerFoliage;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.List;


public class ItemLeafBlock extends ItemBlock    {


    public static final String[] field_150131_O = new String[]{"banana"};

    public ItemLeafBlock(Block block) {
        super(block);
        this.setHasSubtypes(true);

    }

    public String getUnlocalizedName(ItemStack itemStack) {

        int i = itemStack.getItemDamage();
        if (i < 0 || i >= field_150131_O.length) {
            i = 0;
        }
        return super.getUnlocalizedName() + "_" + field_150131_O[i];
    }

   public int getMetadata(int meta){

        return meta | 4;
    }
}