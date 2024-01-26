/* 1 */ package f;public final class R30 { public final Object Hf(float paramFloat) { int i; if (this.Bs.length == 1) { i = 0; } else { Object[] arrayOfObject2; int k; Object[] arrayOfObject1; int j, n, m = (int)(i / this.aB); switch (Uu0.ZJ[this.sI.ordinal()]) { case 6: k = arrayOfObject2.length - m % (arrayOfObject2 = this.Bs).length - 1; break;case 5: k = Math.max(this.Bs.length - k - 1, 0); break;case 4: if ((int)(this.wM / this.aB) != k) { k = nx0.cOM9(this.Bs.length - 1); break; }  k = this.Cg; break;case 3: if ((n = k % ((arrayOfObject1 = this.Bs).length * 2 - 2)) >= arrayOfObject1.length) { int i1 = arrayOfObject1.length - 2 - n - arrayOfObject1.length; break; }  j = n; break;case 2: j %= this.Bs.length; break;case 1: j = Math.min(this.Bs.length - 1, j); break; }  this.Cg = j; this.wM = i; i = j; }
/* 2 */      return this.Bs[i]; }
/*   */ 
/*   */   
/*   */   public Object[] Bs;
/*   */   public float aB;
/*   */   public int Cg;
/*   */   public float wM;
/*   */   public Qb sI = Qb.Oe;
/*   */   
/*   */   public R30(float paramFloat, fQ paramfQ) {
/*   */     this.aB = paramFloat;
/*   */     Object[] arrayOfObject = (Object[])o7.JB0(paramfQ.Uq0.getClass().getComponentType(), paramfQ.Z8);
/*   */     byte b = 0;
/*   */     int i = paramfQ.Z8;
/*   */     while (b < i) {
/*   */       arrayOfObject[b] = paramfQ.get(b);
/*   */       b++;
/*   */     } 
/*   */     GT(arrayOfObject);
/*   */   }
/*   */   
/*   */   public R30(float paramFloat, fQ paramfQ, Qb paramQb) {
/*   */     this(paramFloat, paramfQ);
/*   */     Pt(paramQb);
/*   */   }
/*   */   
/*   */   public R30(float paramFloat, Object... paramVarArgs) {
/*   */     this.aB = paramFloat;
/*   */     GT(paramVarArgs);
/*   */   }
/*   */   
/*   */   public final void GT(Object... paramVarArgs) {
/*   */     this.Bs = paramVarArgs;
/*   */     paramVarArgs.length;
/*   */   }
/*   */   
/*   */   public final void Pt(Qb paramQb) {
/*   */     this.sI = paramQb;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/R30.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */