package com.h2sxxa.reed.tool;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CheckInv {
    public static Boolean ICheckEmpty(EntityPlayer player) {
        for (ItemStack itemStack:player.inventory.mainInventory){
            if(itemStack.isEmpty()){
                return true;
            }
        }
        return false;
    }

    public static Boolean ICheckStack(EntityPlayer player,ItemStack itemStack){
        for (ItemStack OitemStack:player.inventory.mainInventory){
            if(OitemStack == itemStack){
                return true;
            }
        }
        return false;
    }

    public static Boolean ICheckItem(EntityPlayer player,Item item) {
        for (ItemStack OitemStack:player.inventory.mainInventory){
            if(OitemStack.getItem() == item){
                return true;
            }
        }
        return false;
    }
}
