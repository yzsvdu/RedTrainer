package f;

import com.badlogic.gdx.math.Matrix4;

public final class xD0 extends me {
  public static final short[][] uf;
  
  public xD0(pI parampI) {
    super(parampI);
    byte b = 0;
    short[][] arrayOfShort = uf;
    while (b < 33) {
      if (arrayOfShort[b][1] == parampI.Xg0()) {
        Gu gu;
        float f4;
        short s1 = arrayOfShort1[2];
        xr0 xr0 = parampI.G1(s1, arrayOfShort1[3]);
        lpt1 lpt1;
        Matrix4 matrix4 = (lpt1 = zp0.vY().Bc(s2).ro0()).mh;
        float f2 = (arrayOfShort[b][2] + 0.5F) * 0.25F;
        float f3 = xr0.i00() * 0.25F;
        short[] arrayOfShort1;
        short s2;
        if ((s2 = (arrayOfShort1 = arrayOfShort[b])[0]) == 0) {
          f4 = 0.125F;
        } else {
          f4 = 0.0F;
        } 
        float f1 = f3 + f4;
        matrix4.bb0(f2, f1, (arrayOfShort[b][3] + 0.5F + 0.5F) * 0.25F);
        kc(lpt1);
        if (s2 == 1) {
          lpt1.ml0(0, true);
          this(lpt1);
          xr0.wu0(gu);
        } else {
          float f5 = (gu[b][2] + 0.5F) * 0.25F;
          float f6 = xr0.i00() * 0.25F;
          f1 = (gu[b][3] + 0.5F + 0.5F) * 0.25F;
          (zp0.vY().Bc(2).ro0()).mh.bb0(f5, f6, f1);
          kc(zp0.vY().Bc(2).ro0());
        } 
      } 
      b++;
    } 
  }
  
  static {
    short[] arrayOfShort;
    (arrayOfShort = new short[4])[0] = 1;
    (new short[4])[1] = 195;
    (new short[4])[2] = 50;
    (new short[4])[3] = 16;
    (new short[33][])[0] = arrayOfShort;
    (arrayOfShort = new short[4])[0] = 1;
    (new short[4])[1] = 195;
    (new short[4])[2] = 38;
    (new short[4])[3] = 15;
    (new short[33][])[1] = arrayOfShort;
    (arrayOfShort = new short[4])[0] = 1;
    (new short[4])[1] = 195;
    (new short[4])[2] = 40;
    (new short[4])[3] = 24;
    (new short[33][])[2] = arrayOfShort;
    (arrayOfShort = new short[4])[0] = 1;
    (new short[4])[1] = 195;
    (new short[4])[2] = 62;
    (new short[4])[3] = 45;
    (new short[33][])[3] = arrayOfShort;
    (arrayOfShort = new short[4])[0] = 1;
    (new short[4])[1] = 195;
    (new short[4])[2] = 8;
    (new short[4])[3] = 47;
    (new short[33][])[4] = arrayOfShort;
    (arrayOfShort = new short[4])[0] = 1;
    (new short[4])[1] = 195;
    (new short[4])[2] = 8;
    (new short[4])[3] = 37;
    (new short[33][])[5] = arrayOfShort;
    (arrayOfShort = new short[4])[0] = 1;
    (new short[4])[1] = 195;
    (new short[4])[2] = 13;
    (new short[4])[3] = 18;
    (new short[33][])[6] = arrayOfShort;
    (arrayOfShort = new short[4])[0] = 1;
    (new short[4])[1] = 195;
    (new short[4])[2] = 12;
    (new short[4])[3] = 11;
    (new short[33][])[7] = arrayOfShort;
    (arrayOfShort = new short[4])[0] = 1;
    (new short[4])[1] = 195;
    (new short[4])[2] = 27;
    (new short[4])[3] = 13;
    (new short[33][])[8] = arrayOfShort;
    (arrayOfShort = new short[4])[0] = 1;
    (new short[4])[1] = 195;
    (new short[4])[2] = 25;
    (new short[4])[3] = 54;
    (new short[33][])[9] = arrayOfShort;
    (arrayOfShort = new short[4])[0] = 1;
    (new short[4])[1] = 195;
    (new short[4])[2] = 66;
    (new short[4])[3] = 25;
    (new short[33][])[10] = arrayOfShort;
    (arrayOfShort = new short[4])[0] = 1;
    (new short[4])[1] = 195;
    (new short[4])[2] = 64;
    (new short[4])[3] = 26;
    (new short[33][])[11] = arrayOfShort;
    (arrayOfShort = new short[4])[0] = 1;
    (new short[4])[1] = 195;
    (new short[4])[2] = 63;
    (new short[4])[3] = 24;
    (new short[33][])[12] = arrayOfShort;
    (arrayOfShort = new short[4])[0] = 1;
    (new short[4])[1] = 196;
    (new short[4])[2] = 54;
    (new short[4])[3] = 51;
    (new short[33][])[13] = arrayOfShort;
    (arrayOfShort = new short[4])[0] = 1;
    (new short[4])[1] = 196;
    (new short[4])[2] = 31;
    (new short[4])[3] = 48;
    (new short[33][])[14] = arrayOfShort;
    (arrayOfShort = new short[4])[0] = 1;
    (new short[4])[1] = 196;
    (new short[4])[2] = 31;
    (new short[4])[3] = 49;
    (new short[33][])[15] = arrayOfShort;
    (arrayOfShort = new short[4])[0] = 1;
    (new short[4])[1] = 196;
    (new short[4])[2] = 31;
    (new short[4])[3] = 50;
    (new short[33][])[16] = arrayOfShort;
    (arrayOfShort = new short[4])[0] = 1;
    (new short[4])[1] = 196;
    (new short[4])[2] = 46;
    (new short[4])[3] = 41;
    (new short[33][])[17] = arrayOfShort;
    (arrayOfShort = new short[4])[0] = 1;
    (new short[4])[1] = 196;
    (new short[4])[2] = 61;
    (new short[4])[3] = 37;
    (new short[33][])[18] = arrayOfShort;
    (arrayOfShort = new short[4])[0] = 1;
    (new short[4])[1] = 196;
    (new short[4])[2] = 50;
    (new short[4])[3] = 26;
    (new short[33][])[19] = arrayOfShort;
    (arrayOfShort = new short[4])[0] = 1;
    (new short[4])[1] = 196;
    (new short[4])[2] = 56;
    (new short[4])[3] = 17;
    (new short[33][])[20] = arrayOfShort;
    (arrayOfShort = new short[4])[0] = 1;
    (new short[4])[1] = 196;
    (new short[4])[2] = 41;
    (new short[4])[3] = 17;
    (new short[33][])[21] = arrayOfShort;
    (arrayOfShort = new short[4])[0] = 1;
    (new short[4])[1] = 196;
    (new short[4])[2] = 46;
    (new short[4])[3] = 5;
    (new short[33][])[22] = arrayOfShort;
    (arrayOfShort = new short[4])[0] = 1;
    (new short[4])[1] = 196;
    (new short[4])[2] = 52;
    (new short[4])[3] = 10;
    (new short[33][])[23] = arrayOfShort;
    (arrayOfShort = new short[4])[0] = 1;
    (new short[4])[1] = 197;
    (new short[4])[2] = 8;
    (new short[4])[3] = 14;
    (new short[33][])[24] = arrayOfShort;
    (arrayOfShort = new short[4])[0] = 1;
    (new short[4])[1] = 197;
    (new short[4])[2] = 27;
    (new short[4])[3] = 6;
    (new short[33][])[25] = arrayOfShort;
    (arrayOfShort = new short[4])[0] = 1;
    (new short[4])[1] = 197;
    (new short[4])[2] = 23;
    (new short[4])[3] = 12;
    (new short[33][])[26] = arrayOfShort;
    (arrayOfShort = new short[4])[0] = 1;
    (new short[4])[1] = 197;
    (new short[4])[2] = 25;
    (new short[4])[3] = 14;
    (new short[33][])[27] = arrayOfShort;
    (arrayOfShort = new short[4])[0] = 1;
    (new short[4])[1] = 197;
    (new short[4])[2] = 24;
    (new short[4])[3] = 25;
    (new short[33][])[28] = arrayOfShort;
    (arrayOfShort = new short[4])[0] = 1;
    (new short[4])[1] = 197;
    (new short[4])[2] = 8;
    (new short[4])[3] = 35;
    (new short[33][])[29] = arrayOfShort;
    (arrayOfShort = new short[4])[0] = 1;
    (new short[4])[1] = 197;
    (new short[4])[2] = 12;
    (new short[4])[3] = 42;
    (new short[33][])[30] = arrayOfShort;
    (arrayOfShort = new short[4])[0] = 1;
    (new short[4])[1] = 197;
    (new short[4])[2] = 17;
    (new short[4])[3] = 49;
    (new short[33][])[31] = arrayOfShort;
    (arrayOfShort = new short[4])[0] = 1;
    (new short[4])[1] = 197;
    (new short[4])[2] = 20;
    (new short[4])[3] = 35;
    uf = new short[][] { 
        null, null, null, null, null, null, null, null, null, null, 
        null, null, null, null, null, null, null, null, null, null, 
        null, null, null, null, null, null, null, null, null, null, 
        null, null, arrayOfShort };
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/xD0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */