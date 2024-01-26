package f;

public final class eX {
  public Pp0 M50;
  
  public int sg;
  
  public float[][] J4;
  
  public int KF;
  
  public int LT;
  
  public int JD0;
  
  public int fs;
  
  public int zd0;
  
  public int vg;
  
  public long JH0;
  
  public long Zc;
  
  public float[][][][][] kL0;
  
  public Object[][] Ss = new Object[2][];
  
  public tF0[] Qa;
  
  public Object[] Oz;
  
  public eX() {
    this.kL0 = arrayOfFloat1;
    arrayOfFloat1[0] = this;
    float[][][][] arrayOfFloat;
    (arrayOfFloat = new float[2][][][])[0] = new float[2][][];
    float[][][][][] arrayOfFloat1;
    (arrayOfFloat1 = new float[2][][][][])[0][1] = new float[2][][];
    (arrayOfFloat1 = new float[2][][][][])[0][0][0] = new float[2][];
    (new float[2][][][][])[0][0][1] = new float[2][];
    (new float[2][][][][])[0][1][0] = new float[2][];
    (new float[2][][][][])[0][1][1] = new float[2][];
    arrayOfFloat1[1] = this;
    (arrayOfFloat = new float[2][][][])[0] = new float[2][][];
    (new float[2][][][])[1] = new float[2][][];
    (new float[2][][][][])[1][0][0] = new float[2][];
    (new float[2][][][][])[1][0][1] = new float[2][];
    (new float[2][][][][])[1][1][0] = new float[2][];
    (new float[2][][][][])[1][1][1] = new float[2][];
  }
  
  public static float[] O50(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    float[] arrayOfFloat = new float[paramInt2];
    if (paramInt1 != 0)
      return null; 
    paramInt2 = paramInt2 / 4 - paramInt3 / 2;
    int i = paramInt2 - paramInt2 / 4 - paramInt4 / 2;
    for (byte b = 0; b < paramInt3; b++) {
      float f = (float)Math.sin((float)(((float)Math.sin((float)((b + 0.5D) / paramInt3 * 3.1415927410125732D / 2.0D)) * (float)Math.sin((float)((b + 0.5D) / paramInt3 * 3.1415927410125732D / 2.0D))) * 1.5707963705062866D));
      arrayOfFloat[b + paramInt2] = f;
    } 
    for (paramInt2 += paramInt3; paramInt2 < i; paramInt2++)
      arrayOfFloat[paramInt2] = 1.0F; 
    for (paramInt2 = 0; paramInt2 < paramInt4; paramInt2++) {
      float f = (float)Math.sin((float)(((float)Math.sin((float)(((paramInt4 - paramInt2) - 0.5D) / paramInt4 * 3.1415927410125732D / 2.0D)) * (float)Math.sin((float)(((paramInt4 - paramInt2) - 0.5D) / paramInt4 * 3.1415927410125732D / 2.0D))) * 1.5707963705062866D));
      arrayOfFloat[paramInt2 + i] = f;
    } 
    return arrayOfFloat;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/eX.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */