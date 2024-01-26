/* 1 */ package f;public abstract class gT extends fT implements NO { public gR[] dt; public final void i2(int paramInt) { boolean bool = false; gR[] arrayOfGR; if ((arrayOfGR = this.dt) != null) { int i; byte b; for (i = arrayOfGR.length, b = 0; b < i; ) { (arrayOfGR[b]).uV
/* 2 */           .ge0 = (arrayOfGR[b]).uV.ZT.Z80(); (arrayOfGR[b]).uV.av0(bool, paramInt); b++; }  }  } public final void in0(int paramInt) { boolean bool = false; gR[] arrayOfGR; if ((arrayOfGR = this.dt) != null) { int i; byte b; for (i = arrayOfGR.length, b = 0; b < i; ) { gR gR1; Wv0 wv0; (wv0 = (gR1 = arrayOfGR[b]).uV).getClass(); int j; if (paramInt >= 0 && paramInt <= (
/* 3 */           j = wv0.ge0) && j - paramInt >= 0) {
/* 4 */           gR1.uV.ge0 = gR1.uV.ZT.Z80(); gR1.uV.KS(bool, paramInt); b++; continue;
/* 5 */         }  throw new IllegalArgumentException("row"); }
/*   */        }
/*   */      }
/*   */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/gT.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */