package com.gilligancraft.gilligancraft.item;

import com.gilligancraft.gilligancraft.lib.Constants;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;



public class ItemBananaFood extends ItemFood {

    public String name = "bananafood";

    public ItemBananaFood(int heal, float saturation, boolean apple){



        super(heal, saturation, apple);
        setTextureName(Constants.MOD_ID  + ":" + name);
        setCreativeTab(CreativeTabs.tabFood);
        setMaxStackSize(64);
        setUnlocalizedName(Constants.MOD_ID + "_" + name);
        GameRegistry.registerItem(this, name);

    }
}
