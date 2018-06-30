package dev.arcantha.pandora.common.proxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod.EventBusSubscriber
public class CommonProxy {
    @SideOnly(Side.SERVER)

    public void preInit(FMLPreInitializationEvent event) {

    }
    public void init(FMLInitializationEvent event) {

    }
    public void postInit(FMLPostInitializationEvent event) {

    }
}
