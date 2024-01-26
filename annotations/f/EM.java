// Decompiled with: CFR 0.152
// Class Version: 8
package f;

import com.badlogic.gdx.graphics.Color;
import f.NC0;
import f.Xf;
import f.con;
import f.eo;
import f.oq;

public final class EM
        implements con {
  public static final boolean YL;

  static {
    YL = EM.class.desiredAssertionStatus() ^ true;
  }

  @Override
  public final void ng(Object object, int n, float[] fArray) {
    block16: {
      oq oq2 = (oq)object;
      switch (n) {
        default: {
          if (YL) {
            break;
          }
          break block16;
        }
        case 13: {
          oq2.qY = fArray[0];
          break;
        }
        case 12: {
          float f = fArray[0];
          float f2 = oq2.PL.y;
          float f3 = fArray[1];
          oq2.qf0(f, f2, f3);
          break;
        }
        case 11: {
          Color color = oq2.Ny;
          float f = color.r;
          float f4 = color.g;
          float f5 = color.b;
          float f6 = fArray[0];
          oq2.Lx(f, f4, f5, f6);
          break;
        }
        case 10: {
          float f = fArray[0];
          float f7 = fArray[1];
          float f8 = fArray[2];
          float f9 = fArray[3];
          oq2.Lx(f, f7, f8, f9);
          break;
        }
        case 9: {
          Color color = oq2.Hl0;
          float f = color.r;
          float f10 = color.g;
          float f11 = color.b;
          float f12 = fArray[0];
          oq2.Yv0(f, f10, f11, f12);
          break;
        }
        case 8: {
          float f = fArray[0];
          float f13 = fArray[1];
          float f14 = fArray[2];
          float f15 = fArray[3];
          oq2.Yv0(f, f13, f14, f15);
          break;
        }
        case 7: {
          float f = fArray[0] * 0.01f;
          float f16 = fArray[1] * 0.01f;
          NC0 nC0 = oq2.hI0;
          nC0.x = f;
          nC0.y = f16;
          oq2.Ka0 = false;
          break;
        }
        case 6: {
          float f = oq2.hI0.x;
          float f17 = fArray[0] * 0.01f;
          oq2.hI0.x = f;
          oq2.hI0.y = f17;
          oq2.Ka0 = false;
          break;
        }
        case 5: {
          float f;
          float f18 = fArray[0] * 0.01f;
          f18 = oq2.hI0.y;
          oq2.hI0.x = f;
          oq2.hI0.y = f18;
          oq2.Ka0 = false;
          break;
        }
        case 4: {
          float f = fArray[0];
          float f19 = fArray[1];
          float f20 = fArray[2];
          oq2.qf0(f, f19, f20);
          break;
        }
        case 3: {
          float f;
          Object object2 = oq2;
          ((Xf)object2).PL.z = f = fArray[0];
          ((Xf)object2).Ka0 = false;
          break;
        }
        case 2: {
          float f;
          oq oq3 = oq2;
          oq3.PL.y = f = fArray[0];
          oq3.Ka0 = false;
          break;
        }
        case 1: {
          float f;
          oq oq4 = oq2;
          oq4.PL.x = f = fArray[0];
          oq4.Ka0 = false;
        }
      }
      return;
    }
    throw new AssertionError();
  }

  @Override
  public final int Uu0(Object object, int n, float[] fArray) {
    block16: {
      int n2;
      Object object2 = (oq)object;
      switch (n) {
        default: {
          if (YL) {
            n2 = 0;
            break;
          }
          break block16;
        }
        case 13: {
          fArray[0] = ((oq)object2).qY;
          n2 = 1;
          break;
        }
        case 12: {
          eo eo2 = ((Xf)object2).PL;
          fArray[0] = eo2.x;
          fArray[1] = eo2.z;
          n2 = 2;
          break;
        }
        case 11: {
          fArray[0] = ((oq)object2).Ny.a;
          n2 = 1;
          break;
        }
        case 10: {
          object2 = ((oq)object2).Ny;
          fArray[0] = ((Color)object2).r;
          fArray[1] = ((Color)object2).g;
          fArray[2] = ((Color)object2).b;
          fArray[3] = ((Color)object2).a;
          n2 = 4;
          break;
        }
        case 9: {
          fArray[0] = ((Xf)object2).Hl0.a;
          n2 = 1;
          break;
        }
        case 8: {
          object2 = ((Xf)object2).Hl0;
          fArray[0] = ((Color)object2).r;
          fArray[1] = ((Color)object2).g;
          fArray[2] = ((Color)object2).b;
          fArray[3] = ((Color)object2).a;
          n2 = 4;
          break;
        }
        case 7: {
          object2 = ((Xf)object2).hI0;
          fArray[0] = ((NC0)object2).x * 100.0f;
          fArray[1] = ((NC0)object2).y * 100.0f;
          n2 = 2;
          break;
        }
        case 6: {
          fArray[0] = ((Xf)object2).hI0.y * 100.0f;
          n2 = 1;
          break;
        }
        case 5: {
          fArray[0] = ((Xf)object2).hI0.x * 100.0f;
          n2 = 1;
          break;
        }
        case 4: {
          object2 = ((Xf)object2).PL;
          fArray[0] = ((eo)object2).x;
          fArray[1] = ((eo)object2).y;
          fArray[2] = ((eo)object2).z;
          n2 = 3;
          break;
        }
        case 3: {
          fArray[0] = ((Xf)object2).PL.z;
          n2 = 1;
          break;
        }
        case 2: {
          fArray[0] = ((Xf)object2).PL.y;
          n2 = 1;
          break;
        }
        case 1: {
          fArray[0] = ((Xf)object2).PL.x;
          n2 = 1;
        }
      }
      return n2;
    }
    throw new AssertionError();
  }
}
