/* 1 */ package f;public final class mw0 extends Ar0 { public final Object loadSync(sz0 paramsz0, String paramString, RD0 paramRD0, wP paramwP) { (Lpt1)paramwP;
/*   */     
/* 3 */     int i = this.Ld0.cI.length; this(i); fQ fQ; for (byte b = 0; b < i; )
/*   */     
/* 5 */     { String str = this.Ld0.cI[b];
/* 6 */       synchronized (Texture.class)
/* 7 */       { Object object = paramsz0.Yo(null, str); /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{f/sz0}, name=paramsz0} */
/* 8 */         fQ.Com3(new pe0((Texture)object)); b++; }  }  return new Me(this.Ld0, fQ, true); }
/*   */ 
/*   */   
/*   */   public vQ Ld0;
/*   */   
/*   */   public mw0(Xt0 paramXt0) {
/*   */     super(paramXt0);
/*   */   }
/*   */   
/*   */   public final fQ getDependencies(String paramString, RD0 paramRD0, wP paramwP) {
/*   */     Lpt1 lpt1 = (Lpt1)paramwP;
/*   */     this();
/*   */     fQ fQ;
/*   */     vQ vQ1;
/*   */     this(paramRD0, false);
/*   */     this.Ld0 = vQ1;
/*   */     byte b = 0;
/*   */     String[] arrayOfString;
/*   */     while (b < (arrayOfString = this.Ld0.cI).length) {
/*   */       kd0 kd0;
/*   */       bs bs;
/*   */       RD0 rD0 = resolve(arrayOfString[b]);
/*   */       this();
/*   */       if (lpt1 != null) {
/*   */         kd0.ER = false;
/*   */         kd0.Ok0 = lpt1.e3;
/*   */         kd0.Xd0 = lpt1.tg;
/*   */       } 
/*   */       this(rD0, Texture.class, kd0);
/*   */       fQ.Com3(bs);
/*   */       b++;
/*   */     } 
/*   */     return fQ;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/mw0.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */