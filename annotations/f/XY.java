/*  1 */ package f;public final class XY extends Ar0 { public final Object loadSync(sz0 paramsz0, String paramString, RD0 paramRD0, wP paramwP) { FZ fZ = (FZ)paramwP; this(); Mw mw; StringBuilder stringBuilder; f7 f7; String str2;
/*    */     int i;
/*  3 */     if ((i = (str2 = paramRD0.ml.getPath().replace('\\', '/')).lastIndexOf('.')) != -1) str2 = str2.substring(0, i); 
/*  4 */     String str1 = UQ.Vr0(stringBuilder, str2, ".atlas"); str2 = null; if (this != null)
/*  5 */     { String str; if ((str = this.qD0) != null) str1 = str;  f7 f71; if ((f71 = this.IJ) != null) f7 = this;  }  synchronized (COm1.class) {
/*    */       /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{f/sz0}, name=paramsz0} */
/*  7 */       COm1 cOm1 = (COm1)paramsz0.Yo(this, str1);
/*  8 */       this(this); if (f7 != null)
/*  9 */       { oc oc; (oc = f7.sh()).getClass(); while (hasNext()) { str1 = (String)((yO)next()).Lb; Object object; mw
/* 10 */             .DQ((object = ((yO)next()).mm).getClass(), object, str1); }  }  mw
/* 11 */         .IX(paramRD0);
/*    */       return mw;
/*    */     }  }
/*    */ 
/*    */   
/*    */   public XY(Xt0 paramXt0) {
/*    */     super(paramXt0);
/*    */   }
/*    */   
/*    */   public final fQ getDependencies(String paramString, RD0 paramRD0, wP paramwP) {
/*    */     this();
/*    */     bs bs1;
/*    */     fQ fQ;
/*    */     bs bs2;
/*    */     String str;
/*    */     FZ fZ;
/*    */     if ((fZ = (FZ)paramwP) == null || (str = this.qD0) == null) {
/*    */       StringBuilder stringBuilder;
/*    */       bs1 = new bs();
/*    */       this();
/*    */       String str1;
/*    */       int i;
/*    */       if ((i = (str1 = paramRD0.ml.getPath().replace('\\', '/')).lastIndexOf('.')) != -1)
/*    */         str1 = str1.substring(0, i); 
/*    */       this(UQ.Vr0(stringBuilder, str1, ".atlas"), COm1.class);
/*    */       fQ.Com3(this);
/*    */       return fQ;
/*    */     } 
/*    */     this((String)this, COm1.class);
/*    */     fQ.Com3(bs2);
/*    */     return fQ;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/XY.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */