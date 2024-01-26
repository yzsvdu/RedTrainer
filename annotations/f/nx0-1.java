package f;

public final class nx0 {
  public static W60 Mc0 = new W60();
  
  public static float E70(float paramFloat) {
    return Gx.U30[(int)(paramFloat * 2607.5945F) & 0x3FFF];
  }
  
  public static float zN(float paramFloat) {
    return Gx.U30[(int)((paramFloat + 1.5707964F) * 2607.5945F) & 0x3FFF];
  }
  
  public static float nH(float paramFloat) {
    return Gx.U30[(int)(paramFloat * 45.511112F) & 0x3FFF];
  }
  
  public static float Tu0(float paramFloat) {
    return Gx.U30[(int)((paramFloat + 90.0F) * 45.511112F) & 0x3FFF];
  }
  
  public static float Gr(double paramDouble) {
    double d1 = d6 * d2;
    double d2 = d1 * 0.99997726D - d3 * 0.33262347D;
    d2 = d4 * 0.19354346D + d2 - d5 * 0.11643287D;
    double d3;
    double d4;
    double d5;
    double d6;
    return (float)Math.copySign((d6 = (d5 = (d4 = (d3 = ((d1 = Math.abs(paramDouble)) - 1.0D) / (d1 + 1.0D) * (d2 = ((d1 = Math.abs(paramDouble)) - 1.0D) / (d1 + 1.0D) * (d1 = ((d1 = Math.abs(paramDouble)) - 1.0D) / (d1 + 1.0D)))) * d2) * d2) * d2) * 0.05265332D + d2 - d1 * 0.0117212D + 0.7853981633974483D, paramDouble);
  }
  
  public static float b90(float paramFloat1, float paramFloat2) {
    float f;
    if (paramFloat1 / paramFloat2 != (f = paramFloat1 / paramFloat2)) {
      if (paramFloat1 == paramFloat2) {
        f = 1.0F;
      } else {
        f = -1.0F;
      } 
    } else if (f - f != f - f) {
      paramFloat2 = 0.0F;
    } 
    return (paramFloat2 > 0.0F) ? Gr(f) : ((paramFloat2 < 0.0F) ? ((paramFloat1 >= 0.0F) ? (Gr(f) + 3.1415927F) : (Gr(f) - 3.1415927F)) : ((paramFloat1 > 0.0F) ? (paramFloat2 + 1.5707964F) : ((paramFloat1 < 0.0F) ? (paramFloat2 - 1.5707964F) : (paramFloat2 + paramFloat1))));
  }
  
  public static int cOM9(int paramInt) {
    return Mc0.nextInt(paramInt + 1);
  }
  
  public static float pq0(float paramFloat) {
    return Mc0.nextFloat() * paramFloat;
  }
  
  public static int fv(int paramInt) {
    return (paramInt == 0) ? 1 : ((paramInt + -1 | paramInt + -1 >> 1 | (paramInt + -1 | paramInt + -1 >> 1) >> 2 | (paramInt + -1 | paramInt + -1 >> 1 | (paramInt + -1 | paramInt + -1 >> 1) >> 2) >> 4 | (paramInt + -1 | paramInt + -1 >> 1 | (paramInt + -1 | paramInt + -1 >> 1) >> 2 | (paramInt + -1 | paramInt + -1 >> 1 | (paramInt + -1 | paramInt + -1 >> 1) >> 2) >> 4) >> 8 | (paramInt + -1 | paramInt + -1 >> 1 | (paramInt + -1 | paramInt + -1 >> 1) >> 2 | (paramInt + -1 | paramInt + -1 >> 1 | (paramInt + -1 | paramInt + -1 >> 1) >> 2) >> 4 | (paramInt + -1 | paramInt + -1 >> 1 | (paramInt + -1 | paramInt + -1 >> 1) >> 2 | (paramInt + -1 | paramInt + -1 >> 1 | (paramInt + -1 | paramInt + -1 >> 1) >> 2) >> 4) >> 8) >> 16) + 1);
  }
  
  public static int Uw0(int paramInt1, int paramInt2, int paramInt3) {
    return (paramInt1 < paramInt2) ? paramInt2 : ((paramInt1 > paramInt3) ? paramInt3 : paramInt1);
  }
  
  public static float SA0(float paramFloat1, float paramFloat2, float paramFloat3) {
    return (paramFloat1 < paramFloat2) ? paramFloat2 : ((paramFloat1 > paramFloat3) ? paramFloat3 : paramFloat1);
  }
  
  public static boolean is(float paramFloat) {
    return (Math.abs(paramFloat) <= 1.0E-6F);
  }
  
  public static boolean JC0(float paramFloat1, float paramFloat2) {
    return (Math.abs(paramFloat1 - paramFloat2) <= 1.0E-6F);
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/nx0.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */