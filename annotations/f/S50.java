/*  1 */ package f;public final class S50 extends of { private void Xg(int paramInt1, int paramInt2, int paramInt3) { paramInt3 = this.f3; 
/*  2 */     try { if (this.F2
/*  3 */         .PH0
/*  4 */         .toString()
/*  5 */         .isEmpty() || "-"
/*    */ 
/*    */ 
/*    */         
/*  9 */         .equals(this.F2.PH0.toString()))
/*    */       
/*    */       { 
/*    */         
/* 13 */         paramInt3 = 0; } else { paramInt3 = Integer.parseInt(this.F2.PH0.toString()); }  }
/* 14 */     catch (NumberFormatException numberFormatException) { Be0(paramInt3 + "", false); }  if (paramInt3 < paramInt1)
/*    */     
/* 16 */     { Be0(Integer.toString(paramInt1), false); } else if (paramInt3 > paramInt2)
/*    */     
/* 18 */     { Be0(Integer.toString(paramInt2), false); paramInt1 = paramInt2; }
/*    */     else { return; }
/* 20 */      Be0(Integer.toString(paramInt1), false); }
/*    */ 
/*    */   
/*    */   public final int f3;
/*    */   
/*    */   public S50() {
/*    */     this(0);
/*    */   }
/*    */   
/*    */   public S50(int paramInt) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: dup
/*    */     //   2: dup2
/*    */     //   3: dup2
/*    */     //   4: invokespecial <init> : ()V
/*    */     //   7: ldc 'editfield'
/*    */     //   9: invokevirtual Xu : (Ljava/lang/String;)V
/*    */     //   12: iconst_0
/*    */     //   13: invokevirtual Ra0 : (I)V
/*    */     //   16: iconst_0
/*    */     //   17: ldc -2147483648
/*    */     //   19: ldc 2147483647
/*    */     //   21: invokestatic Uw0 : (III)I
/*    */     //   24: putfield f3 : I
/*    */     //   27: ldc -2147483648
/*    */     //   29: ldc 2147483647
/*    */     //   31: <illegal opcode> SX : (Lf/S50;II)Lf/a70;
/*    */     //   36: invokevirtual JD0 : (Lf/a70;)V
/*    */     //   39: return
/*    */   }
/*    */   
/*    */   public final void Ra0(int paramInt) {
/*    */     Be0(Integer.toString(0), false);
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/S50.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */