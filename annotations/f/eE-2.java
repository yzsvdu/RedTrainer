/*   */ package f;public abstract class eE implements lr, iq0 { public final void Ix0() { G8 g8; Object object; /* monitor enter BinaryOperatorExpression{ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} = FieldReferenceExpression{lastType=ObjectType{java/lang/Object}, expression=BinaryOperatorExpression{ClassFileLocalVariableReferenceExpression{type=ObjectType{f/G8}, name=null} = FieldReferenceExpression{lastType=ObjectType{f/G8}, expression=ObjectTypeReferenceExpression{ObjectType{f/G8}}, name=Ny, descriptor=Lf/G8;}}, name=Hs, descriptor=Ljava/lang/Object;}} */ try {
/*   */       return;
/*   */     } finally {
/* 4 */       this = null;
/*   */       /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
/*   */     }  }
/*   */ 
/*   */   
/*   */   public static int kk0 = 960;
/*   */   
/*   */   public static int iU = 48000;
/*   */   public byte jd0;
/*   */   public short Fl;
/*   */   public vR Oh;
/*   */   public long iu = 0L;
/*   */   public boolean D2 = false;
/*   */   public boolean ex0 = false;
/*   */   public boolean BA = false;
/*   */   public long BK0;
/*   */   public long LpT4;
/*   */   public float Ft = 0.0F;
/*   */   public Runnable Ve0 = null;
/*   */   
/*   */   public eE(byte paramByte, short paramShort, vR paramvR) {
/*   */     this.jd0 = paramByte;
/*   */     this.Fl = paramShort;
/*   */     this.Oh = paramvR;
/*   */   }
/*   */   
/*   */   public abstract void vf0(float paramFloat);
/*   */   
/*   */   public final void oC0() {
/*   */     this.D2 = true;
/*   */   }
/*   */   
/*   */   public final void resume() {
/*   */     this.D2 = false;
/*   */   }
/*   */   
/*   */   public final void Wi0(boolean paramBoolean) {
/*   */     if (this.ex0)
/*   */       return; 
/*   */     if (paramBoolean && !this.D2) {
/*   */       if (this.BA)
/*   */         return; 
/*   */       this.BA = true;
/*   */       this.BK0 = System.currentTimeMillis();
/*   */       this.LpT4 = System.currentTimeMillis() + 450L;
/*   */       return;
/*   */     } 
/*   */     this.ex0 = true;
/*   */     VD0 vD0;
/*   */     if (this.Oh == vR.eX && (vD0 = km.pm0) != null)
/*   */       Cn0(); 
/*   */   }
/*   */   
/*   */   public abstract int zk0(ByteBuffer paramByteBuffer, int paramInt);
/*   */   
/*   */   public abstract boolean Kt();
/*   */   
/*   */   public final boolean Vh() {
/*   */     return this.ex0;
/*   */   }
/*   */   
/*   */   public final byte jA() {
/*   */     return this.jd0;
/*   */   }
/*   */   
/*   */   public final short LE() {
/*   */     return this.Fl;
/*   */   }
/*   */   
/*   */   public final boolean hE() {
/*   */     return this.BA;
/*   */   }
/*   */   
/*   */   public final void Ge0(Runnable paramRunnable) {
/*   */     this.Ve0 = paramRunnable;
/*   */   }
/*   */   
/*   */   static {
/*   */     C00.gd(eE.class);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/eE.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */