package net.minecraft.src;

public class EntityElement2FX extends EntityFX
{

    public EntityElement2FX(World world, double d, double d1, double d2, 
            double d3, double d4, double d5)
    {
        this(world, d, d1, d2, d3, d4, d5, 1.0F);
    }

    public EntityElement2FX(World world, double d, double d1, double d2, 
            double d3, double d4, double d5, float f)
    {
        super(world, d, d1, d2, 0.0D, 0.0D, 0.0D);
        motionX *= 0.0;
        motionY *= 0.1;
        motionZ *= 0.1;
        motionX += d3;
        motionY += d4;
        motionZ += d5;
        particleRed = 1.0F;
        particleGreen = 1.0F;
        particleBlue = 1.0F;
        particleScale *= 0.75F;
        particleScale *= f;
        smokeParticleScale = particleScale;
        particleMaxAge = (int)(8D / (Math.random() * 1.00000000000000004D + 0.20000000000000001D));
        particleMaxAge *= f;
        noClip = false;
    }

    public void renderParticle(Tessellator tessellator, float f, float f1, float f2, float f3, float f4, float f5)
    {
        float f6 = (((float)particleAge + f) / (float)particleMaxAge) * 32F;
        if(f6 < 0.0F)
        {
            f6 = 0.0F;
        }
        if(f6 > 1.0F)
        {
            f6 = 1.0F;
        }
        particleScale = smokeParticleScale * f6;
        super.renderParticle(tessellator, f, f1, f2, f3, f4, f5);
    }

    public void onUpdate()
    {
        prevPosX = posX;
        prevPosY = posY;
        prevPosZ = posZ;
        if(particleAge++ >= particleMaxAge)
        {
            setEntityDead();
        }
        particleTextureIndex = 7 - (particleAge * 8) / particleMaxAge;
        motionY += 0.0040000000000000001D;
        moveEntity(motionX, motionY, motionZ);
        if(posY == prevPosY)
        {
            motionX *= 2.1000000000000001D;
            motionZ *= 2.1000000000000001D;
        }
        motionX *= 0.25999997854232788D;
        motionY *= 0.25999997854232788D;
        motionZ *= 0.25999997854232788D;
        if(onGround)
        {
            motionX *= 1.39999998807907104D;
            motionZ *= 1.39999998807907104D;
        }
    }

    float smokeParticleScale;
}