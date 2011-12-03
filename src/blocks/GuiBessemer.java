package net.minecraft.src;

import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class GuiBessemer extends GuiContainer
{

    public GuiBessemer(InventoryPlayer inventoryplayer, TileEntityBessemer tileentityBessemer)
    {
        super(new ContainerBessemer(inventoryplayer, tileentityBessemer));
        BessemerInventory = tileentityBessemer;
    }

    protected void drawGuiContainerForegroundLayer()
    {
        fontRenderer.drawString("Bessemer", 60, 6, 0x404040);
        fontRenderer.drawString("Inventory", 8, (ySize - 96) + 2, 0x404040);
    }

    protected void drawGuiContainerBackgroundLayer(float f)
    {
        int i = mc.renderEngine.getTexture("/elements/Bessemer/Bessemer.png");
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        mc.renderEngine.bindTexture(i);
        int j = (width - xSize) / 2;
        int k = (height - ySize) / 2;
        drawTexturedModalRect(j, k, 0, 0, xSize, ySize);
        if(BessemerInventory.isBurning())
        {
            int l = BessemerInventory.getBurnTimeRemainingScaled(12);
            drawTexturedModalRect(j + 56, (k + 36 + 12) - l, 176, 12 - l, 14, l + 2);
        }
        int i1 = BessemerInventory.getCookProgressScaled(24);
        drawTexturedModalRect(j + 79, k + 34, 176, 14, i1 + 1, 16);
    }

    private TileEntityBessemer BessemerInventory;

	@Override
	protected void drawGuiContainerBackgroundLayer(float f, int i, int j) {
		// TODO Auto-generated method stub
		
	}
}
