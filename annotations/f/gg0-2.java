/* 1 */ package f;public final class gg0 { public final boolean xW(oa0 paramoa0, String paramString) { jK jK1; if ((jK1 = (jK)gy0.Hr0((gy0[])this.YC0, paramString)) != null) { int i; if ((i = paramoa0.cz0) != 10 || (this
/* 2 */         .sC0 & 0x2) == 0) { int j; if (i == 9 && ((j = this.sC0) & 0x1) != 0) { boolean bool; if (i == 9 && paramoa0
/* 3 */             .sj) { bool = true; } else { bool = false; }  if (!bool || (j & 0x4) != 0) { this
/* 4 */               .b8.run(); return true; }  }  return true; }  } else { return false; }  this.b8.run(); return true; }
/*   */ 
/*   */   
/*   */   public jK[] YC0 = new jK[16];
/*   */   public int ba;
/*   */   
/*   */   public final void ch0(String paramString, Runnable paramRunnable, int paramInt) {
/*   */     int j;
/*   */     this.ba = (j = this.ba) + 1;
/*   */     this.YC0 = arrayOfJK;
/*   */     this(paramString, paramRunnable, paramInt);
/*   */     jK jK1;
/*   */     int i;
/*   */     (jK1 = new jK()).FK0 = arrayOfJK[i = this.ks & arrayOfJK.length - 1];
/*   */     jK[] arrayOfJK;
/*   */     (arrayOfJK = (jK[])gy0.else((gy0[])this.YC0, j))[i] = this;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/gg0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */