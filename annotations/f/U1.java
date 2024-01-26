// Decompiled with: CFR 0.152
// Class Version: 8
package f;

import com.badlogic.gdx.math.Matrix4;
import f.SJ;
import f.YF0;
import f.eo;
import f.hD0;
import f.xy;
import java.nio.ByteBuffer;

public final class U1 {
  public long gM;
  public SJ S60;
  public hD0 qL;
  public long nK;
  public int jf;
  public SJ[] jx;
  public hD0[] e6;

  /*
   * Unable to fully structure code
   * Could not resolve type clashes
   */
  public U1(int var1_1, int var2_2, int var3_3, boolean var4_4, int var5_5, ByteBuffer var6_6) {
    super();
    if (var4_4) {
      this.gM = var6_6.getInt();
      var4_4 = var6_6.position();
      var7_7 = this.gM;
      if (var7_7 >> 15 == 1L) {
        var6_6.position(var1_1 + var2_2 + (int)((var7_7 & 32767L) * 6L));
        this.S60 = new SJ(var6_6);
      } else {
        var6_6.position(var1_1 + var3_3 + (int)((var7_7 & 32767L) * 10L));
        this.qL = new hD0(var6_6);
      }
      while (true) {
        break;
      }
    } else {
      this.nK = (long)var6_6.getInt() & 0xFFFFFFFFL;
      this.jf = var6_6.getInt();
      var4_4 = var6_6.position();
      this.jx = new SJ[var5_5];
      this.e6 = new hD0[var5_5];
      var7_8 = 0;
      while (true) {
        if (var7_8 >= var5_5) ** continue;
        v0 = var6_6;
        var8_10 = this.jf + var1_1;
        v0.position(var7_8 * 2 + var8_10);
        var8_10 = v0.getShort() & 65535;
        if (var8_10 >> 15 == 1) {
          v1 = var8_10;
          var8_10 = var1_1 + var2_2;
          var8_10 = (v1 & 32767) * 6 + var8_10;
          if (var6_6.limit() > var8_10) {
            var6_6.position(var8_10);
          }
          var8_9 = v2;
          v2 = new SJ(var6_6);
          this.jx[var7_8] = var8_9;
        } else {
          v3 = var8_10;
          var8_10 = var1_1 + var3_3;
          var6_6.position((v3 & 32767) * 10 + var8_10);
          var8_9 = v4;
          v4 = new hD0(var6_6);
          this.e6[var7_8] = var8_9;
        }
        ++var7_8;
      }
    }
    var6_6.position((int)var4_4);
  }

  /*
   * Enabled aggressive block sorting
   */
  public final Matrix4 tG(int n) {
    Object object;
    SJ sJ;
    Object object2 = ((U1)object).e6;
    if (((U1)object).e6 == null && ((U1)object).jx == null) {
      sJ = ((U1)object).S60;
      if (sJ != null) return sJ.xc0();
      return ((U1)object).qL.tC();
    }
    long l = ((U1)object).nK;
    int n2 = (int)((l & 0x1FFF0000L) >> 16);
    if ((l & 0xC0000000L) == 0L) {
      object = ((U1)object).jx[n];
      if (object != null) return ((SJ)object).xc0();
      return object2[n].tC();
    }
    if ((l & 0x40000000L) != 0L) {
      if ((n & 1) != 0) {
        if (n > n2) {
          int n3 = (n2 >> 1) + 1;
          sJ = ((U1)object).jx[n3];
          if (sJ != null) return sJ.xc0();
          return object2[n3].tC();
        }
        Object object3 = ((U1)object).jx[n >>= 1];
        object3 = object3 == null ? (Object)((U1)object).e6[n].tC().Z0 : (Object)((SJ)object3).xc0().Z0;
        SJ sJ2 = ((U1)object).jx[++n];
        object = sJ2 == null ? (Object)((U1)object).e6[n].tC().Z0 : (Object)sJ2.xc0().Z0;
        object2 = new Matrix4(YF0.XS((float[])object3, (float[])object));
        return object2;
      }
      int n4 = n >> 1;
      sJ = ((U1)object).jx[n4];
      if (sJ != null) return sJ.xc0();
      return object2[n4].tC();
    }
    if ((l & 0x80000000L) == 0L) {
      return new Matrix4().WU();
    }
    int n5 = n & 3;
    if (n5 != 0) {
      if (n > n2) {
        int n6 = (n2 >> 2) + n5;
        sJ = ((U1)object).jx[n6];
        if (sJ != null) return sJ.xc0();
        return object2[n6].tC();
      }
      if ((n & 1) != 0) {
        Matrix4 matrix4;
        eo eo2;
        xy xy2;
        if ((n & 2) != 0) {
          n5 = (n >>= 2) + 1;
        } else {
          n5 = n >> 2;
          n = n5 + 1;
        }
        SJ sJ3 = ((U1)object).jx[n5];
        object2 = sJ3 == null ? object2[n5].tC() : sJ3.xc0();
        SJ sJ4 = ((U1)object).jx[n];
        object = ((Matrix4)object2).Z0;
        float[] fArray = (sJ4 == null ? ((U1)object).e6[n].tC() : sJ4.xc0()).Z0;
        object2 = xy2;
        float f = new xy((float[])object).Qr(0, 0) * 3.0f + fArray[0];
        ((xy)object2).se(0, 0, f);
        f = ((xy)object2).Qr(1, 0) * 3.0f + fArray[1];
        ((xy)object2).se(1, 0, f);
        f = ((xy)object2).Qr(2, 0) * 3.0f + fArray[2];
        ((xy)object2).se(2, 0, f);
        f = ((xy)object2).Qr(0, 1) * 3.0f + fArray[4];
        ((xy)object2).se(0, 1, f);
        f = ((xy)object2).Qr(1, 1) * 3.0f + fArray[5];
        ((xy)object2).se(1, 1, f);
        f = ((xy)object2).Qr(2, 1) * 3.0f + fArray[6];
        ((xy)object2).se(2, 1, f);
        eo eo3 = eo2 = YF0.GE;
        Object object4 = object2;
        eo eo4 = eo2;
        Object object5 = object2;
        eo eo5 = eo2;
        Object object6 = object2;
        float f2 = ((xy)object6).Qr(0, 0);
        float f3 = ((xy)object6).Qr(1, 0);
        float f4 = ((xy)object6).Qr(2, 0);
        eo5.TG0(f2, f3, f4).WC0();
        f2 = eo5.x;
        ((xy)object2).se(0, 0, f2);
        f2 = eo2.y;
        ((xy)object2).se(1, 0, f2);
        f2 = eo2.z;
        ((xy)object5).se(2, 0, f2);
        f2 = ((xy)object5).Qr(0, 1);
        f3 = ((xy)object5).Qr(1, 1);
        f4 = ((xy)object5).Qr(2, 1);
        eo4.TG0(f2, f3, f4).WC0();
        f2 = eo4.x;
        ((xy)object2).se(0, 1, f2);
        f2 = eo2.y;
        ((xy)object2).se(1, 1, f2);
        f2 = eo2.z;
        ((xy)object4).se(2, 1, f2);
        f2 = ((xy)object4).Qr(0, 2) * 3.0f + fArray[8];
        ((xy)object4).se(0, 2, f2);
        f2 = ((xy)object4).Qr(1, 2) * 3.0f + fArray[9];
        ((xy)object4).se(1, 2, f2);
        f2 = ((xy)object4).Qr(2, 2) * 3.0f + fArray[10];
        ((xy)object4).se(2, 2, f2);
        f2 = ((xy)object4).Qr(0, 2);
        float f5 = ((xy)object4).Qr(1, 2);
        f3 = ((xy)object4).Qr(2, 2);
        eo3.TG0(f2, f5, f3).WC0();
        f2 = eo3.x;
        ((xy)object2).se(0, 2, f2);
        f2 = eo2.y;
        ((xy)object2).se(1, 2, f2);
        f2 = eo2.z;
        ((xy)object2).se(2, 2, f2);
        object = matrix4;
        matrix4 = new Matrix4(((xy)object2).HQ);
        return object;
      }
      Object object7 = ((U1)object).jx[n >>= 2];
      object7 = object7 == null ? (Obj  ect)((U1)object).e6[n].tC().Z0 : (Object)((SJ)object7).xc0().Z0;
      SJ sJ5 = ((U1)object).jx[++n];
      object = sJ5 == null ? (Object)((U1)object).e6[n].tC().Z0 : (Object)sJ5.xc0().Z0;
      object2 = new Matrix4(YF0.XS((float[])object7, (float[])object));
      return object2;
    }
    int n7 = n >> 2;
    sJ = ((U1)object).jx[n7];
    if (sJ == null) return object2[n7].tC();
    return sJ.xc0();
  }
}