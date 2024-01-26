/* 1 */ package f;public final class hE { public final void jh(int paramInt1, int paramInt2, int paramInt3, Gh paramGh) { int i = 0; bn bn1; if ((bn1 = this.q10).sX > 0) { int j = this.vt0; while (true) { int n, m = (bn1 = bn1).xn(paramInt1, i, bn1.sX - 1); t40 t40 = bn1.B60[m]; if (--j <= 0) { if (HH0 || t40 != null) { if ((j = t40.O20 - paramInt1) == 0)
/* 2 */               j = t40.GP - i;  if (j < 0)
/* 3 */               return;  do { for (j = bn1.sX; m < j; ) { t40 t401; if ((i = (t401 = bn1.B60[m]).O20) > paramInt2) return;  if ((n = t401.GP) >= 0 && n <= paramInt3) paramGh.tm(i, n, t401);  m++; }  m = 0; } while ((bn1 = bn1.ww) != null); break; }  throw new AssertionError(); }  int k = n; }
/*   */        }
/*   */      }
/*   */ 
/*   */   
/*   */   public bn q10;
/*   */   public int vt0;
/*   */   
/*   */   public hE() {
/*   */     bn bn1;
/*   */     this(32);
/*   */     this.q10 = this;
/*   */     this.vt0 = 1;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/hE.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */