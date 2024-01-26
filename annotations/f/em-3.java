/*  1 */ package f;public final class em implements iq0 { public final Qb0 Jk0; public boolean dA0; public final Matrix4 D70; public final Matrix4 Tg; public final Matrix4 kP; public final void d8(F1 paramF1) { if (this.WN == null) { this.WN = paramF1; if (this.dA0) { Matrix4 matrix4 = this.D70; this.kP.getClass(); this.kP.Qw(matrix4.Z0);
/*  2 */         Matrix4.jq(this.kP.Z0, this.Tg.Z0); this.dA0 = false; }  Matrix4 matrix41 = this.kP;
/*  3 */       int i = this.WN.Gz0;
/*  4 */       Matrix4 matrix42 = this.Jk0.O0; matrix42
/*  5 */         .getClass();
/*  6 */       matrix42.Qw(this.Z0);
/*  7 */       this.Jk0.uC = i; return; }
/*  8 */      throw new IllegalStateException("Call end() before beginning a new shape batch."); } public final Color H5; public F1 WN; public em() { this(5000); } public em(int paramInt) { this(paramInt, null); } public em(int paramInt, Rm0 paramRm0) { Qb0 qb0; Matrix4 matrix4; this.dA0 = false; this(); this.D70 = new Matrix4(); this.Tg = new Matrix4(); this.kP = new Matrix4(); this.H5 = new Color(1.0F, 1.0F, 1.0F, 1.0F); if (paramRm0 == null) { this(paramInt, false, true, 0); this.Jk0 = qb0; } else { Qb0 qb01; this(paramInt, false, true, 0, (Rm0)qb0); this.Jk0 = qb01; }  matrix4.ZA0(UB0.M60.fG0(), UB0.M60.dL()); this.dA0 = true; } public final void E10(F1 paramF11, F1 paramF12, int paramInt) { F1 f1; if ((f1 = this.WN) != null) { if (f1 != paramF11 && f1 != paramF12) { if (paramF12 == null) throw new IllegalStateException("Must call begin(ShapeType." + paramF11 + ").");  throw new IllegalStateException("Must call begin(ShapeType." + paramF11 + ") or begin(ShapeType." + paramF12 + ")."); }  Qb0 qb0; if (this.dA0 || (qb0 = this.Jk0).COM2 - qb0.am < paramInt) { end(); d8(f1); }  return; }  throw new IllegalStateException("begin must be called first."); } public final void end() { Qb0 qb0; if ((qb0 = this.Jk0).am != 0) { int j; qb0.Pf0.bind(); Matrix4 matrix4 = qb0.O0; float[] arrayOfFloat1 = matrix4.Z0; UB0.re0.glUniformMatrix4fv(qb0.Pf0.mm0("u_projModelView", Rm0.bk0), 1, false, arrayOfFloat1, 0); byte b = 0; while (b < qb0.Tt) { Rm0 rm01 = qb0.Pf0; String str = qb0.e6[b]; rm01.oM();
/*    */         
/* 10 */         UB0.re0.glUniform1i(rm01.mm0(str, Rm0.bk0), b); b++; }
/* 11 */        re0 re0 = qb0.sQ; float[] arrayOfFloat2 = qb0.R60; int i = qb0.Hq0; re0
/* 12 */         .Dt0
/* 13 */         .Dc(0, i, arrayOfFloat2);
/* 14 */       re0 = qb0.sQ; Rm0 rm0 = qb0.Pf0; i = qb0.uC; boolean bool1 = false; if (re0
/* 15 */         .rs0
/* 16 */         .Bt() > 0)
/* 17 */       { j = re0.rs0.pP(); }
/* 18 */       else { j = re0.Dt0.IH(); }
/* 19 */        boolean bool = re0.N70; re0.Gi0(rm0, i, bool1, j, bool);
/* 20 */       qb0.Hq0 = 0; qb0.am = 0; }  this
/* 21 */       .WN = null; }
/*    */ 
/*    */   
/*    */   public final void dispose() {
/*    */     Qb0 qb0;
/*    */     Rm0 rm0;
/*    */     if ((qb0 = this.Jk0).M80 && (rm0 = this.Pf0) != null)
/*    */       rm0.dispose(); 
/*    */     this.sQ.dispose();
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/em.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */