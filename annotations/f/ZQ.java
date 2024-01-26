package f;

import com.badlogic.gdx.math.Matrix4;

public final class ZQ {
  public static final float[] tl0 = new float[24];
  
  public static final eo case = new eo();
  
  public final Q0[] LF;
  
  public final eo[] OB;
  
  public final float[] kl0;
  
  public ZQ() {
    eo eo1;
    this.LF = new Q0[6];
    this();
    (new eo[8])[0] = eo1;
    this();
    (new eo[8])[1] = eo1;
    this();
    (new eo[8])[2] = eo1;
    this();
    (new eo[8])[3] = eo1;
    this();
    (new eo[8])[4] = eo1;
    this();
    (new eo[8])[5] = eo1;
    this();
    (new eo[8])[6] = eo1;
    this();
    this.OB = new eo[] { null, null, null, null, null, null, null, eo1 };
    this.kl0 = new float[24];
    for (byte b = 0; b < 6; b++) {
      Q0 q0;
      this(new eo(), 0.0F);
      this.LF[b] = q0;
    } 
  }
  
  public final void FW(Matrix4 paramMatrix4) {
    float[] arrayOfFloat = this.kl0;
    int i = tl0.length;
    System.arraycopy(tl0, 0, arrayOfFloat, 0, i);
    Matrix4.prj(paramMatrix4.Z0, this.kl0, 0, 8, 3);
    byte b = 0;
    i = 0;
    while (b < 8) {
      eo5.x = arrayOfFloat1[i++];
      eo5.y = arrayOfFloat1[i++];
      eo eo5;
      float[] arrayOfFloat1;
      (eo5 = this.OB[b]).z = (arrayOfFloat1 = this.kl0)[i++];
      b++;
    } 
    eo eo2 = this.OB[1];
    eo eo3 = this.OB[0];
    eo eo4 = this.OB[2];
    this.LF[0].t10(eo2, eo3, eo4);
    eo2 = this.OB[4];
    eo3 = this.OB[5];
    eo4 = this.OB[7];
    this.LF[1].t10(eo2, eo3, eo4);
    eo2 = this.OB[0];
    eo3 = this.OB[4];
    eo4 = this.OB[3];
    this.LF[2].t10(eo2, eo3, eo4);
    eo2 = this.OB[5];
    eo3 = this.OB[1];
    eo4 = this.OB[6];
    this.LF[3].t10(eo2, eo3, eo4);
    eo2 = this.OB[2];
    eo3 = this.OB[3];
    eo4 = this.OB[6];
    this.LF[4].t10(eo2, eo3, eo4);
    eo eo1 = this.OB[4];
    eo2 = this.OB[0];
    eo3 = this.OB[1];
    this.LF[5].t10(this, eo2, eo3);
  }
  
  static {
    this(-1.0F, -1.0F, -1.0F);
    eo eo1;
    byte b1;
    eo[] arrayOfEo;
    (arrayOfEo = new eo[b1 = 8])[0] = eo1;
    this(1.0F, -1.0F, -1.0F);
    (new eo[b1 = 8])[1] = eo1;
    this(1.0F, 1.0F, -1.0F);
    (new eo[b1 = 8])[2] = eo1;
    this(-1.0F, 1.0F, -1.0F);
    (new eo[b1 = 8])[3] = eo1;
    this(-1.0F, -1.0F, 1.0F);
    (new eo[b1 = 8])[4] = eo1;
    this(1.0F, -1.0F, 1.0F);
    (new eo[b1 = 8])[5] = eo1;
    this(1.0F, 1.0F, 1.0F);
    (new eo[b1 = 8])[6] = eo1;
    this(-1.0F, 1.0F, 1.0F);
    (new eo[b1 = 8])[7] = eo1;
  }
  
  static {
    int i = 0;
    byte b2 = 0;
    while (b2 < b1) {
      eo eo2 = arrayOfEo[b2];
      int j = i + 1;
      arrayOfFloat[i] = eo2.x;
      i = j + 1;
      arrayOfFloat[j] = eo2.y;
      j = i + 1;
      float[] arrayOfFloat;
      (arrayOfFloat = tl0)[i] = eo2.z;
      b2++;
      i = j;
    } 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/ZQ.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */