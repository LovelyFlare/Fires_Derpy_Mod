package firedingo.mod.fdm.proxy;


import cpw.mods.fml.common.registry.GameRegistry;
import firedingo.mod.fdm.ContainerDerpyFurnace;
import firedingo.mod.fdm.gui.GuiDerpyFurnace;
import firedingo.mod.fdm.tileentity.TileEntityDerpyFurnace;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class ServerProxy extends CommonProxy {
    //seems things are funky if you don't atleast create these classes. That's why they're here but empty.

    @Override
    public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
        TileEntity tileEntity = world.getTileEntity(x, y, z);
        if (tileEntity instanceof TileEntityDerpyFurnace) {
            return new ContainerDerpyFurnace(player.inventory, (TileEntityDerpyFurnace) tileEntity);
        }
        return null;
    }

}
