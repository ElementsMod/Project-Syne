package net.minecraft.src;

import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class GuiPurifier extends GuiContainer
{

    public GuiPurifier(InventoryPlayer inventoryplayer, TileEntityPurifier tileentityPurifier)
    {
        super(new ContainerPurifier(inventoryplayer, tileentityPurifier));
        PurifierInventory = tileentityPurifier;
    }

    protected void drawGuiContainerForegroundLayer()
    {
        fontRenderer.drawString("Purifier", 60, 6, 0x404040);
        fontRenderer.drawString("Inventory", 8, (ySize - 96) + 2, 0x404040);
    }

    protected void drawGuiContainerBackgroundLayer(float f)
    {
        int i = mc.renderEngine.getTexture("/elements/purifier/purifier.png");
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        mc.renderEngine.bindTexture(i);
        int j = (width - xSize) / 2;
        int k = (height - ySize) / 2;
        drawTexturedModalRect(j, k, 0, 0, xSize, ySize);
        if(PurifierInventory.isBurning())
        {
            int l = PurifierInventory.getBurnTimeRemainingScaled(12);
            drawTexturedModalRect(j + 56, (k + 36 + 12) - l, 176, 12 - l, 14, l + 2);
        }
        int i1 = PurifierInventory.getCookProgressScaled(24);
        drawTexturedModalRect(j + 79, k + 34, 176, 14, i1 + 1, 16);
    }

    private TileEntityPurifier PurifierInventory;
}
