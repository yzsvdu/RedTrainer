/* 1 */ package f;public class rh extends Bj0 { public int T8; public int cQ; public int xG0 = 100; public int DY; public int AuX = 1; public er oW; public XI0 q6; public void l4(int paramInt) { er er1; if ((er1 = this.oW) != null) this.cQ = er1.NC0();  int i = this.cQ; er er2;
/* 2 */     if ((er2 = this.oW) != null) this.xG0 = er2.cB0(); 
/* 3 */     paramInt = Math.max(i, Math.min(this.xG0, paramInt)); if (this.T8 != paramInt) { this.T8 = paramInt; er er3; if ((er3 = this.oW) != null) er3.Hr0(paramInt);  t90(); ArrayList arrayList;
/* 4 */       if ((arrayList = this.Fp0) != null) for (Iterator<E> iterator = iterator(); hasNext(); ((Runnable)next()).run());  }  } public HashMap bK0 = null; public ArrayList Fp0 = null; public rh() { Xu("valueadjuster"); t90(); this.uu0.YV(Hf0.lF0); cL(); } public rh(er paramer) { Xu("valueadjuster"); pe(paramer); this.uu0.YV(Hf0.lF0); cL(); } public final void cL() { this.mc0.tW(this::hI0); this.Xx.tW(this::Dg); } public final String TI() { return "valueadjusterint"; } public final void pR(int paramInt) { this.AuX = paramInt; } public final void wB0(int paramInt, String paramString) { if (this.bK0 == null) { HashMap<Object, Object> hashMap; this(); this.bK0 = hashMap; }  Integer integer = Integer.valueOf(paramInt); this.bK0.put(this, Objects.requireNonNull(paramString)); } public final void pe(er paramer) { er er1; if ((er1 = this.oW) != paramer) { XI0 xI0; if (er1 != null && (xI0 = this.q6) != null) ((zA)er1).kG0 = (Runnable[])hm.LL0(xI0, (Object[])((zA)er1).kG0);  this.oW = paramer; this.cQ = paramer.NC0(); this.xG0 = paramer.cB0(); if (paramer != null && this.oW != null && this
/* 5 */         .Bo0 != null) { if (this
/* 6 */           .q6 == null) { XI0 xI01; this(this); this.q6 = xI01; }  er er2 = this.oW; ((zA)this).Ac0(this.q6); YI(); }  }  } public String X7() { return jw(); } public boolean UX(String paramString) { try { l4(Integer.parseInt(paramString)); return true; } catch (NumberFormatException numberFormatException) { return false; }  } public String I40(String paramString) { try { Integer.parseInt(paramString); return null; } catch (NumberFormatException numberFormatException) { return null.toString(); }  } public final void Fj() {} public final boolean hv0(char paramChar) { return ((paramChar >= '0' && paramChar <= '9') || paramChar == '-'); } public final void on0() { this.DY = this.T8; } public final void LM(throws paramthrows) { this(paramthrows); this.V30 = fx0; fx0 fx0; (fx0 = new fx0()).NY = this.AH0; (new fx0()).bo = true; if (this.oW != null && this.Bo0 != null) { if (this
/* 7 */         .q6 == null) { XI0 xI0; this(this); this.q6 = xI0; }  er er1 = this.oW; ((zA)this).Ac0(this.q6); YI(); }
/*   */      }
/*   */ 
/*   */   
/*   */   public final void L10(int paramInt) {
/*   */     er er1;
/*   */     if ((er1 = this.oW) != null)
/*   */       this.xG0 = er1.cB0(); 
/*   */     int j = this.xG0;
/*   */     er er2;
/*   */     if ((er2 = this.oW) != null)
/*   */       this.cQ = er2.NC0(); 
/*   */     int i = Math.max(1, Math.abs(j - this.cQ));
/*   */     paramInt = this.DY;
/*   */     l4(paramInt / Math.max(3, this.xY / i) + paramInt);
/*   */   }
/*   */   
/*   */   public final void BG0() {
/*   */     l4(this.DY);
/*   */   }
/*   */   
/*   */   public final void hI0() {
/*   */     int i;
/*   */     int j;
/*   */     if ((i = this.T8 - this.AuX) < (j = this.cQ))
/*   */       i = j; 
/*   */     l4(i);
/*   */   }
/*   */   
/*   */   public final void Dg() {
/*   */     int i;
/*   */     int j;
/*   */     if ((i = this.T8 + this.AuX) > (j = this.xG0))
/*   */       i = j; 
/*   */     l4(i);
/*   */   }
/*   */   
/*   */   public String jw() {
/*   */     HashMap hashMap;
/*   */     String str;
/*   */     return ((hashMap = this.bK0) != null && (str = (String)hashMap.get(Integer.valueOf(this.T8))) != null) ? str : Integer.toString(this.T8);
/*   */   }
/*   */   
/*   */   public final void YI() {
/*   */     z00();
/*   */     this.cQ = this.oW.NC0();
/*   */     this.xG0 = this.oW.cB0();
/*   */     this.T8 = this.oW.getValue();
/*   */     t90();
/*   */   }
/*   */   
/*   */   public final void ED0(throws paramthrows) {
/*   */     er er1;
/*   */     XI0 xI0;
/*   */     if ((er1 = this.oW) != null && (xI0 = this.q6) != null)
/*   */       ((zA)er1).kG0 = (Runnable[])hm.LL0(xI0, (Object[])((zA)er1).kG0); 
/*   */     fx0 fx0;
/*   */     if ((fx0 = this.V30) != null)
/*   */       fx0.vI(); 
/*   */     this.V30 = null;
/*   */   }
/*   */   
/*   */   public final void Te0(Runnable paramRunnable) {
/*   */     if (this.Fp0 == null) {
/*   */       ArrayList arrayList;
/*   */       this();
/*   */       this.Fp0 = arrayList;
/*   */     } 
/*   */     this.Fp0.add(paramRunnable);
/*   */   }
/*   */   
/*   */   public final void Jc() {
/*   */     wB0(0, " -- ");
/*   */   }
/*   */   
/*   */   public final void fn(int paramInt) {
/*   */     boolean bool;
/*   */     if (paramInt >= (bool = true)) {
/*   */       this.cQ = bool;
/*   */       this.xG0 = paramInt;
/*   */       l4(this.T8);
/*   */       return;
/*   */     } 
/*   */     throw new IllegalArgumentException("maxValue < minValue");
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/rh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */