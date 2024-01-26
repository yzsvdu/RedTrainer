/* 1 */ package f;public final class L00 extends q80 implements nY { public final nY mn0(String paramString, boolean paramBoolean) { nY nY1; if ((nY1 = (nY)this.Tf.VV(paramString)) == null) { String str; if ((str = this.w10) != null) { dS dS; (dS = this.qi).getClass(); if (dS.Av0 || str.length() == 0 || str.endsWith(".")) { if ((nY1 = dS.GK(str.concat(paramString), false, paramBoolean)) == null || !((L00)nY1).a00) nY1 = null;  } else { throw new AssertionError(); }  }  if (nY1 == null && paramBoolean)
/* 2 */       { lI.wb().getClass();
/* 3 */         lI.u4
/*   */           
/* 5 */           .warning("Missing child theme \"" + paramString + "\" for \"" + t6(0).toString() + "\""); }  }  return nY1; }
/*   */ 
/*   */   
/*   */   public final String is;
/*   */   public final XR Tf;
/*   */   public boolean a00;
/*   */   public String w10;
/*   */   
/*   */   public L00(dS paramdS, String paramString, L00 paramL00) {
/*   */     super(paramdS, paramL00);
/*   */     XR xR;
/*   */     this.is = paramString;
/*   */     this();
/*   */     this.Tf = this;
/*   */   }
/*   */   
/*   */   public final L00 XC0(String paramString) {
/*   */     return (L00)this.Tf.VV(paramString);
/*   */   }
/*   */   
/*   */   public final StringBuilder t6(int paramInt) {
/*   */     StringBuilder stringBuilder;
/*   */     paramInt = this.is.length() + paramInt;
/*   */     L00 l00;
/*   */     if ((l00 = this.Bf0) != null) {
/*   */       (stringBuilder = l00.t6(paramInt + 1)).append('.');
/*   */     } else {
/*   */       StringBuilder stringBuilder1;
/*   */       this(stringBuilder);
/*   */       stringBuilder = stringBuilder1;
/*   */     } 
/*   */     stringBuilder.append(this.is);
/*   */     return stringBuilder;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/L00.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */