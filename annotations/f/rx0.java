/*  1 */ package f;public final class rx0 extends v40 { public final void Ie() { Prn prn = (new Prn(BM.bC)).yH0((((BI)this.bm0).CQ()).fr); this.rc
/*    */       
/*  3 */       .put(prn.dL0, prn);
/*  4 */     prn = (new Prn(BM.lc)).yH0((((BI)this.bm0).CQ()).KV);
/*  5 */     this.rc
/*    */       
/*  7 */       .put(prn.dL0, prn);
/*  8 */     prn = (new Prn(BM.go0)).yH0((((BI)this.bm0).CQ()).Kg);
/*  9 */     this.rc
/*    */       
/* 11 */       .put(prn.dL0, prn);
/* 12 */     prn = (new Prn(BM.Nx)).yH0((((BI)this.bm0).CQ()).Tn);
/* 13 */     this.rc
/*    */       
/* 15 */       .put(prn.dL0, prn);
/* 16 */     if (((BI)this.bm0).T2() > 0) { prn = (new Prn(BM.ni)).nx((((BI)this.bm0).CQ()).cL, false); this
/* 17 */         .rc
/*    */         
/* 19 */         .put(prn.dL0, prn);
/* 20 */       prn = (new Prn(BM.N70)).nx((((BI)this.bm0).CQ()).cL, true);
/* 21 */       this.rc
/*    */         
/* 23 */         .put(prn.dL0, prn);
/* 24 */       prn = (new Prn(BM.Oq)).nx((((BI)this.bm0).CQ()).YA, false);
/* 25 */       this.rc
/*    */         
/* 27 */         .put(prn.dL0, prn);
/* 28 */       prn = (new Prn(BM.M8)).nx((((BI)this.bm0).CQ()).YA, true);
/* 29 */       this.rc
/*    */         
/* 31 */         .put(prn.dL0, prn);
/* 32 */       this.RV = new boolean[((BI)this.bm0).T2() * 2]; }  prn = (new Prn(BM.cf)).yH0((((BI)this.bm0).CQ()).Cn); this
/* 33 */       .rc
/*    */       
/* 35 */       .put(prn.dL0, prn);
/* 36 */     prn = (new Prn(BM.Ul)).yH0((((BI)this.bm0).CQ()).Z8);
/* 37 */     this.rc
/*    */       
/* 39 */       .put(prn.dL0, prn);
/* 40 */     prn = (new Prn(BM.Vv0)).yH0((((BI)this.bm0).CQ()).Hb0);
/* 41 */     this.rc
/*    */       
/* 43 */       .put(prn.dL0, prn);
/* 44 */     prn = (new Prn(BM.lpT3)).yH0((((BI)this.bm0).CQ()).Ai0);
/* 45 */     this.rc
/*    */       
/* 47 */       .put(prn.dL0, prn);
/* 48 */     prn = (new Prn(BM.WN)).yH0((((BI)this.bm0).CQ()).yL0);
/* 49 */     this.rc
/*    */       
/* 51 */       .put(prn.dL0, prn);
/* 52 */     prn = (new Prn(BM.l30)).yH0((((BI)this.bm0).CQ()).WA);
/* 53 */     this.rc
/*    */       
/* 55 */       .put(prn.dL0, prn);
/* 56 */     km.gE0(); if (((BI)this.bm0).T2() > 5) { prn = (new Prn(BM.fN)).nx(4, true); this
/* 57 */         .rc
/*    */         
/* 59 */         .put(prn.dL0, prn);
/* 60 */       prn = (new Prn(BM.PW)).nx(5, true); }
/* 61 */     else { BI bI; int i; if ((i = (bI = (BI)this.bm0).rp) < 0) { bI
/* 62 */           .rp = BI.r0.kG - 1; try { for (; (i = bI.rp) > 0 && !bI.Fp0.Sv((s3)BI.r0.get(i)); bI.rp--); } catch (l9 l9) { bI.hp0(); } catch (NullPointerException nullPointerException) {} i = bI.rp; }  if (i >= 10)
/* 63 */       { prn = (new Prn(BM.fN)).yH0((((BI)this.bm0).CQ()).Zy0);
/* 64 */         this.rc
/*    */           
/* 66 */           .put(prn.dL0, prn);
/* 67 */         prn = (new Prn(BM.PW)).yH0((((BI)this.bm0).CQ()).rp); } else { return; }  }  this
/* 68 */       .rc
/*    */       
/* 70 */       .put(prn.dL0, prn); }
/*    */ 
/*    */   
/*    */   public final String BT;
/*    */   public ah0 bm0;
/*    */   public HashMap rc;
/*    */   public boolean[] RV;
/*    */   
/*    */   public rx0(String paramString) {
/*    */     HashMap<Object, Object> hashMap;
/*    */     this();
/*    */     this.rc = this;
/*    */     this.BT = paramString;
/*    */     this.bm0 = null;
/*    */   }
/*    */   
/*    */   public rx0(ah0 paramah0, String paramString) {
/*    */     this.rc = new HashMap<>();
/*    */     this.bm0 = paramah0;
/*    */     this.BT = paramString;
/*    */     this.RV = new boolean[((BI)paramah0).T2() * 2];
/*    */   }
/*    */   
/*    */   public final Prn mw0(int paramInt1, int paramInt2, boolean paramBoolean) {
/*    */     for (Iterator iterator = this.rc.values().iterator(); hasNext();) {
/*    */       if ((prn = (Prn)next()).f5 == paramInt1) {
/*    */         if (paramInt1 != 0) {
/*    */           int i;
/*    */           if ((i = paramInt1 - 1) != 0) {
/*    */             if (i == 1 && prn.Com8 == paramInt2 && paramBoolean == prn.iD0)
/*    */               return prn; 
/*    */             continue;
/*    */           } 
/*    */           if (prn.wd0 == paramInt2)
/*    */             return prn; 
/*    */           continue;
/*    */         } 
/*    */         throw null;
/*    */       } 
/*    */     } 
/*    */     return null;
/*    */   }
/*    */   
/*    */   public final String LPt1() {
/*    */     return this.BT;
/*    */   }
/*    */   
/*    */   public final String Ih0() {
/*    */     String str1 = "";
/*    */     String str2;
/*    */     if ((str2 = this.BT).contains(" ")) {
/*    */       str1 = this.BT.substring(this.BT.lastIndexOf(' '), this.BT.length()).trim();
/*    */       str2 = this.BT.substring(0, this.BT.lastIndexOf(' ')).trim();
/*    */     } 
/*    */     if (this.BT.toLowerCase(Locale.ENGLISH).contains("xbox"))
/*    */       return m0.tF0("Xbox ", str1); 
/*    */     return (str2.length() > 8) ? (str2.substring(0, 7) + "... " + str1) : this.BT;
/*    */   }
/*    */   
/*    */   public final boolean KL(BI paramBI, int paramInt) {
/*    */     Prn prn;
/*    */     if ((prn = mw0(1, paramInt, true)) != null)
/*    */       km.ek.Xg0(this.dL0.Dx, true); 
/*    */     return false;
/*    */   }
/*    */   
/*    */   public final boolean F0(BI paramBI, int paramInt) {
/*    */     Prn prn;
/*    */     if ((prn = mw0(1, paramInt, true)) != null)
/*    */       km.ek.Xg0(this.dL0.Dx, false); 
/*    */     return false;
/*    */   }
/*    */   
/*    */   public final boolean CoM2(BI paramBI, int paramInt, float paramFloat) {
/*    */     int i = paramInt * 2;
/*    */     if (this.RV == null)
/*    */       return false; 
/*    */     for (byte b = 0; b < 2; ) {
/*    */       byte b1 = 2;
/*    */       if (b == 0) {
/*    */         bool = true;
/*    */       } else {
/*    */         bool = false;
/*    */       } 
/*    */       boolean bool = prn.m6(paramBI);
/*    */       Prn prn;
/*    */       boolean[] arrayOfBoolean;
/*    */       int j;
/*    */       if ((prn = mw0(b1, paramInt, bool)) != null && (arrayOfBoolean = this.RV)[j = i + b] != bool) {
/*    */         arrayOfBoolean[j] = bool;
/*    */         km.ek.Xg0(prn.dL0.Dx, bool);
/*    */       } 
/*    */       b++;
/*    */     } 
/*    */     return false;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/rx0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */