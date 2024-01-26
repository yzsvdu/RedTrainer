/* 1 */ package f;public class protected { public Runnable[] oh0; public Runnable[] JK0; public int hm0; public final void Bq(boolean paramBoolean) { if (paramBoolean != Ni0()) { Bv(4, paramBoolean); hm.Fz0(this.JK0); }  } public boolean nm0() { return false; } public final boolean Ni0() { return ((this.hm0 & 0x4) != 0); } public void Fx0(boolean paramBoolean) {} public final void hB(boolean paramBoolean) { // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: getfield hm0 : I
/*   */     //   4: iconst_2
/*   */     //   5: iand
/*   */     //   6: ifeq -> 14
/*   */     //   9: iconst_1
/*   */     //   10: istore_2
/*   */     //   11: goto -> 16
/*   */     //   14: iconst_0
/*   */     //   15: istore_2
/*   */     //   16: iload_1
/*   */     //   17: iload_2
/*   */     //   18: if_icmpeq -> 78
/*   */     //   21: iload_1
/*   */     //   22: ifne -> 57
/*   */     //   25: aload_0
/*   */     //   26: invokevirtual Ni0 : ()Z
/*   */     //   29: ifeq -> 57
/*   */     //   32: aload_0
/*   */     //   33: getfield hm0 : I
/*   */     //   36: bipush #8
/*   */     //   38: iand
/*   */     //   39: ifne -> 47
/*   */     //   42: iconst_1
/*   */     //   43: istore_2
/*   */     //   44: goto -> 49
/*   */     //   47: iconst_0
/*   */     //   48: istore_2
/*   */     //   49: iload_2
/*   */     //   50: ifeq -> 57
/*   */     //   53: iconst_1
/*   */     //   54: goto -> 58
/*   */     //   57: iconst_0
/*   */     //   58: aload_0
/*   */     //   59: dup
/*   */     //   60: iconst_2
/*   */     //   61: iload_1
/*   */     //   62: invokevirtual Bv : (IZ)V
/*   */     //   65: getfield JK0 : [Ljava/lang/Runnable;
/*   */     //   68: invokestatic Fz0 : ([Ljava/lang/Runnable;)V
/*   */     //   71: ifeq -> 78
/*   */     //   74: aload_0
/*   */     //   75: invokevirtual Xi0 : ()V
/*   */     //   78: return
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 1
/*   */     //   #2	-> 26
/*   */     //   #3	-> 33
/*   */     //   #4	-> 62
/*   */     //   #5	-> 65
/* 1 */     //   #6	-> 75 } public final void zb(boolean paramBoolean) { boolean bool; if ((this.hm0 & 0x1) != 0) { bool = true; } else { bool = false; }  if (paramBoolean != bool) {
/* 2 */       Bv(1, paramBoolean);
/* 3 */       hm.Fz0(this.JK0);
/*   */     }  }
/*   */ 
/*   */   
/*   */   public void Xi0() {
/*   */     hm.Fz0(this.oh0);
/*   */   }
/*   */   
/*   */   public final void Bv(int paramInt, boolean paramBoolean) {
/*   */     if (paramBoolean) {
/*   */       this.hm0 |= paramInt;
/*   */     } else {
/*   */       this.hm0 &= paramInt ^ 0xFFFFFFFF;
/*   */     } 
/*   */   }
/*   */   
/*   */   public final void s1() {
/*   */     hm.Fz0(this.oh0);
/*   */   }
/*   */   
/*   */   public final void xu0(Runnable paramRunnable) {
/*   */     this.JK0 = (Runnable[])hm.LpT6((Object[])this.JK0, paramRunnable, Runnable.class);
/*   */   }
/*   */   
/*   */   public void xz0() {}
/*   */   
/*   */   public void Oy() {} }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/protected.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */