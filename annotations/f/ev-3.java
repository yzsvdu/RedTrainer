/* 1 */ package f;public final class ev extends a { public final void Xq0() { r4 r41 = this.yp0; ES eS; if ((!Qf0() || ((
/* 2 */       !this.Q1 || (
/* 3 */       eS = this.fu.OM) == null) && (eS = this.fu.cM) == null)) && (!fC() || (
/* 4 */       this.Q1 ? ((
/* 5 */       eS = this.fu.cOM3) != null) : ((eS = this.fu.xg) != null))))
/* 6 */       if (!this.Q1 || ((
/* 7 */         eS = this.fu.vb0) == null && (!fC() || (eS = this.fu.xg) == null))) eS = this.fu.XE;   r41
/* 8 */       .eu0(eS); }
/*   */ 
/*   */   
/*   */   public final r4 yp0;
/*   */   public w5 fu;
/*   */   
/*   */   public ev(Mw paramMw) {
/*   */     this((w5)paramMw.Q1(w5.class));
/*   */   }
/*   */   
/*   */   public ev(Mw paramMw, String paramString) {
/*   */     this((w5)paramMw.Oz0(w5.class, paramString));
/*   */   }
/*   */   
/*   */   public ev(w5 paramw5) {
/*   */     super(paramw5);
/*   */     r4 r41 = mQ();
/*   */     X6(this);
/*   */     H40(paramw5);
/*   */     float f = DB0();
/*   */     qp0(f, d6());
/*   */   }
/*   */   
/*   */   public ev(ES paramES) {
/*   */     this(null, null, null, paramES, null, null);
/*   */     w5 w51;
/*   */     this(this);
/*   */   }
/*   */   
/*   */   public ev(ES paramES1, ES paramES2) {
/*   */     this(null, null, null, paramES1, paramES2, null);
/*   */     w5 w51;
/*   */     this(this);
/*   */   }
/*   */   
/*   */   public ev(ES paramES1, ES paramES2, ES paramES3) {
/*   */     this(null, null, null, paramES1, paramES2, paramES3);
/*   */     w5 w51;
/*   */     this(this);
/*   */   }
/*   */   
/*   */   public static r4 mQ() {
/*   */     return new r4(null, QJ0.qf);
/*   */   }
/*   */   
/*   */   public final void H40(Ny paramNy) {
/*   */     if (paramNy instanceof w5) {
/*   */       this.fu = (w5)paramNy;
/*   */       super.H40(paramNy);
/*   */       if (this.yp0 != null)
/*   */         Xq0(); 
/*   */       return;
/*   */     } 
/*   */     throw new IllegalArgumentException("style must be an ImageButtonStyle.");
/*   */   }
/*   */   
/*   */   public final void cD(JX paramJX, float paramFloat) {
/*   */     Xq0();
/*   */     super.cD(paramJX, paramFloat);
/*   */   }
/*   */   
/*   */   public final String toString() {
/*   */     String str1;
/*   */     int i;
/*   */     if ((i = (str1 = ev.class.getName()).lastIndexOf('.')) != -1)
/*   */       str1 = str1.substring(i + 1); 
/*   */     this();
/*   */     StringBuilder stringBuilder;
/*   */     String str2;
/*   */     if (str1.indexOf('$') != -1) {
/*   */       str2 = "ImageButton ";
/*   */     } else {
/*   */       str2 = "";
/*   */     } 
/*   */     return stringBuilder.append(str2).append(str1).append(": ").append(this.yp0.A5).toString();
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/ev.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */