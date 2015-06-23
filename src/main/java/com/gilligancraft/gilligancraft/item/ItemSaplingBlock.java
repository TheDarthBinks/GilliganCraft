package com.gilligancraft.gilligancraft.item;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;


public class ItemSaplingBlock extends ItemBlock {


    public static final String[] saplings = new String[]{"banana", "coconut"};

    public ItemSaplingBlock(Block block) {
        super(block);
        this.setHasSubtypes(true);


    }


    public String getUnlocalizedName(ItemStack itemStack)

    {
        int i = itemStack.getItemDamage();
        if (i < 0 || i >= saplings.length) {
            i = 0;
        }
        return super.getUnlocalizedName() + "_" + saplings[i];

    }



    public int getMetaData(int meta){

        return meta;
    }







}
