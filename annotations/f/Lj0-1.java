/*   */ package f;public final class Lj0 extends Bj0 { public float Z60; public float ob0; public float YR = 100.0F; public float Jj0; public float Cw = 1.0F; public jg Pr0; public XI0 Je0; public String Cd = "%.2f"; public Locale CoM7 = Locale.ENGLISH; public final boolean UX(String paramString) { 
/* 2 */     try { MF0(NumberFormat.getNumberInstance(this.CoM7).parse(paramString).floatValue()); return true; } catch (ParseException parseException) { return false; }  } public lpt5 lm0 = null; public Lj0() { Xu("valueadjuster"); t90(); this.uu0.YV(Hf0.lF0); v8(); } public Lj0(jg paramjg) { Xu("valueadjuster"); YD(paramjg); this.uu0.YV(Hf0.lF0); v8(); } public final void v8() { this.mc0.tW(new Qg0(this)); this.Xx.tW(new Pi0(this)); } public final String TI() { return "valueadjusterfloat"; } public final void sC(lpt5 paramlpt5) { this.lm0 = paramlpt5; } public final void Ld(float paramFloat1, float paramFloat2) { if (paramFloat2 >= paramFloat1) { this.ob0 = paramFloat1; this.YR = paramFloat2; MF0(this.Z60); return; }  throw new IllegalArgumentException("maxValue < minValue"); } public final void MF0(float paramFloat) { float f; if (paramFloat > (f = this.YR) || paramFloat < (f = this.ob0)) paramFloat = f;  if (this.Z60 != paramFloat) { this.Z60 = paramFloat; jg jg1; if ((jg1 = this.Pr0) != null) jg1.Ej0(paramFloat);  t90(); lpt5 lpt51; if ((lpt51 = this.lm0) != null) U90(paramFloat);  }  } public final void Ng(float paramFloat) { if (paramFloat > 0.0F) { this.Cw = paramFloat; return; }  throw new IllegalArgumentException("stepSize"); } public final String X7() { return jw(); } public final String I40(String paramString) { try { NumberFormat.getNumberInstance(this.CoM7).parse(paramString).floatValue(); return null; } catch (ParseException parseException) { return toString(); }  } public final void Fj() {} public final boolean hv0(char paramChar) { if ((paramChar >= '0' && paramChar <= '9') || paramChar == '-' || paramChar == '.') return true;  } public final void on0() { this.Jj0 = this.Z60; }
/* 3 */   public final void L10(int paramInt) { float f1 = Math.max(1.0E-4F, Math.abs(this.YR - this.ob0)), f2 = this.Jj0;
/*   */     
/* 5 */     MF0(paramInt / Math.max(3.0F, this.xY / f1) + f2); } public final void BG0() { MF0(this.Jj0); } public final void hI0() { MF0(this.Z60 - this.Cw); } public final void Dg() { MF0(this.Z60 + this.Cw); } public final String jw() { return String.format(this.CoM7, this.Cd, new Object[] { Float.valueOf(this.Z60) }); } public final void YI() { z00(); this.ob0 = this.Pr0.Ru(); this.YR = this.Pr0.dN(); this.Z60 = this.Pr0.SE(); t90(); } public final void LM(throws paramthrows) { this(paramthrows); this.V30 = fx0; fx0 fx0; (fx0 = new fx0()).NY = this.AH0; (new fx0()).bo = true; if (this.Pr0 != null && this
/* 6 */       .Bo0 != null) { if (this
/* 7 */         .Je0 == null) { XI0 xI0; this(this); this.Je0 = xI0; }  this.Pr0.Ac0(this.Je0); YI(); }
/*   */      }
/*   */ 
/*   */   
/*   */   public final void ED0(throws paramthrows) {
/*   */     jg jg1;
/*   */     XI0 xI0;
/*   */     if ((jg1 = this.Pr0) != null && (xI0 = this.Je0) != null)
/*   */       jg1.kG0 = (Runnable[])hm.LL0(xI0, (Object[])jg1.kG0); 
/*   */     fx0 fx0;
/*   */     if ((fx0 = this.V30) != null)
/*   */       fx0.vI(); 
/*   */     this.V30 = null;
/*   */   }
/*   */   
/*   */   public final void YD(jg paramjg) {
/*   */     jg jg1;
/*   */     if ((jg1 = this.Pr0) != paramjg) {
/*   */       XI0 xI0;
/*   */       if (jg1 != null && (xI0 = this.Je0) != null)
/*   */         jg1.kG0 = (Runnable[])hm.LL0(xI0, (Object[])jg1.kG0); 
/*   */       this.Pr0 = paramjg;
/*   */       this.ob0 = paramjg.Ru();
/*   */       this.YR = paramjg.dN();
/*   */       if (paramjg != null && this.Pr0 != null && this.Bo0 != null) {
/*   */         if (this.Je0 == null) {
/*   */           XI0 xI01;
/*   */           this(this);
/*   */           this.Je0 = xI01;
/*   */         } 
/*   */         this.Pr0.Ac0(this.Je0);
/*   */         YI();
/*   */       } 
/*   */     } 
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Lj0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */