package dev.arcantha.pandora;

import dev.arcantha.pandora.client.handler.RenderHandler;
import dev.arcantha.pandora.common.handler.RegistryHandler;
import dev.arcantha.pandora.common.proxy.CommonProxy;
import dev.arcantha.pandora.util.Reference;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.Info.MODID, name = Reference.Info.NAME, version = Reference.Info.VERSION, dependencies = "required-after:llibrary@[1.7.9,)")
public class Pandora {
    @SidedProxy(clientSide = Reference.Paths.CLIENTPROXY, serverSide = Reference.Paths.COMMONPROXY)
    public static CommonProxy proxy;
    @Mod.Instance(Reference.Info.MODID)
    public static Pandora instance;
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        RegistryHandler.preInitRegistries();
    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
        MinecraftForge.EVENT_BUS.register(new RenderHandler());
    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}
