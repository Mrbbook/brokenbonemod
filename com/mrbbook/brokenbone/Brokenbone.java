package com.mrbbook.brokenbone;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.EventBus;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import minezmod.item.itembandage;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid="brokenbone", name="Brokenbone", version="0.1")
public class Brokenbone {


  @SidedProxy(serverSide="brokenbone.commproxy", clientSide="brokenbone.clientproxy")
  public static commproxy side;

  @Mod.Instance("brokenbone")

  
  //Item declaration
  public static Item Morphine;   //<< Use when broke
  public static Item Painkiller;  //<< Use to heal but not cure
  public static Item Medkit;  //<< Use to cure and add some health

  @EventHandler
  public void preInit(FMLPreInitializationEvent preinit)
  {

  //pre in it code go here

  }
  
  public void load(FMLInitializationEvent event) {
    	   

  proxy.registerRenderInformation();  //register on common and client proxy

  }
  
  public void postInit(FMLInitializationEvent event) {
    
    /*Example of Register in-game item name here
    
    Bandage = new itembandage("Bandage");
    GameRegistry.registerItem(Bandage, "Bandage");
    Painkiller = new itembandage("Painkiller");
    GameRegistry.registerItem(Painkiller, "Painkiller");
    
    */
    
    
  }
  
  
  

}
