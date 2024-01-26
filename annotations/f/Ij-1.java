/*  1 */ package f;public abstract class Ij extends Wr { public void LM(throws paramthrows) { if (!this.Dd || !this.dP) {
/*    */       return;
/*    */     }
/*    */ 
/*    */     
/*  6 */     this(new KO(this.O, Wr.Ny), pRn.WHITE); I i; E30 e30; Object object;
/*  7 */     this.db0 = new I();
/*  8 */     wI0(false);
/*  9 */     if (this.db0 == null && !this.dP) i
/* 10 */         .oC0(0);  CQ(false); this(this); /* monitor enter BinaryOperatorExpression{ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} = FieldReferenceExpression{lastType=ObjectType{java/lang/Object}, expression=ClassFileLocalVariableReferenceExpression{type=ObjectType{f/throws}, name=paramthrows}, name=zr0, descriptor=Ljava/lang/Object;}} */ try {
/*    */       int k; Runnable[] arrayOfRunnable;
/* 12 */       if ((k = paramthrows.ey) == (arrayOfRunnable = paramthrows.AT).length) {
/* 13 */         arrayOfRunnable = new Runnable[k * 2]; System.arraycopy(arrayOfRunnable, 0, arrayOfRunnable, 0, k); paramthrows.AT = arrayOfRunnable;
/* 14 */       }  int j; paramthrows.ey = (j = paramthrows.ey) + 1; paramthrows.AT[j] = e30; return;
/*    */     } finally {
/* 16 */       this = null;
/*    */       /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
/*    */     }  }
/*    */ 
/*    */   
/*    */   public boolean Dd = true;
/*    */   
/*    */   public Ij() {}
/*    */   
/*    */   public Ij(boolean paramBoolean) {}
/*    */   
/*    */   public void IG0() {}
/*    */   
/*    */   public void ED0(throws paramthrows) {
/*    */     I i;
/*    */     if ((i = this.db0) == null)
/*    */       return; 
/*    */     this(this, paramthrows);
/*    */     wC0 wC0;
/*    */     i.md(wC0);
/*    */   }
/*    */   
/*    */   public boolean i2(oa0 paramoa0) {
/*    */     Un un;
/*    */     if (B8.Wm0(paramoa0.cz0) && paramoa0.oO() && paramoa0.GG0 == 111 && (un = this.Ki) != null) {
/*    */       hm.Fz0(un.TG0.oh0);
/*    */       return true;
/*    */     } 
/*    */     return super.i2(paramoa0);
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Ij.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */