/*  1 */ package f;public class io extends iz0 { public final JG0 qp(int paramInt, hu paramhu, JG0 paramJG0, boolean paramBoolean) { int i; JG0 jG0; if ((jG0 = (JG0)this.ih.get(paramhu)) == null) { jG0 = paramhu.r7(this, paramInt + 1, paramJG0); this.ih.put(paramhu, jG0); }  if (jG0.fr0 == this) { paramInt++;
/*  2 */       while (Ub() > paramInt)
/*  3 */         fG0(Ub() - 1);  return jG0; }  if (this
/*  4 */       .fr0 != null) { i = 1; } else { i = 0; }  if (!i)
/*  5 */     { if (!jv()) { tp0(); return null; }  this
/*  6 */         .fr0
/*  7 */         .S20(this); }  while (Ub() > paramInt)
/*  8 */       fG0(Ub() - 1); 
/*  9 */     si(jG0, Ub());
/* 10 */     jG0.mM(); if (paramBoolean)
/* 11 */     { paramInt = jG0.xY;
/* 12 */       i = paramJG0.Xq();
/* 13 */       int j = paramJG0.er0;
/* 14 */       i = paramJG0.Kd;
/*    */       
/* 16 */       i = paramJG0.xY / 2 + i - paramInt / 2;
/* 17 */       j -= jG0.HC;
/* 18 */       if ((paramInt == 0) ? (paramJG0.Xq() + paramInt > m40() && (
/*    */         
/* 20 */         i = paramJG0.Kd + paramJG0.xY - paramInt) < 
/* 21 */         RS()) : (paramJG0.Xq() + paramInt > m40() && (
/* 22 */         i = paramJG0.Kd - paramInt) < 
/* 23 */         RS())) i = m40() - paramInt;  if (j + (
/* 24 */         paramInt = jG0.HC) > 
/* 25 */         mD()) j = Math.max(e3(), mD() - paramInt);  if (i < 0) i = 0;  if (j < 0) j = 0;  jG0.Ol0(i, j); }  return jG0; }
/*    */ 
/*    */   
/*    */   public final boolean g10;
/*    */   public final IdentityHashMap ih;
/*    */   public final G4 Td0;
/*    */   public final As C00;
/*    */   public boolean je;
/*    */   public JG0 Vn0;
/*    */   public fx0 LW;
/*    */   
/*    */   public io(JG0 paramJG0) {
/*    */     super(paramJG0);
/*    */     IdentityHashMap<Object, Object> identityHashMap;
/*    */     G4 g4;
/*    */     As as;
/*    */     this.g10 = false;
/*    */     this();
/*    */     this.ih = identityHashMap;
/*    */     this(this);
/*    */     this.Td0 = g4;
/*    */     this(this);
/*    */     this.C00 = as;
/*    */   }
/*    */   
/*    */   public final String TI() {
/*    */     return "menumanager";
/*    */   }
/*    */   
/*    */   public final void tp0() {
/*    */     fx0 fx01;
/*    */     if ((fx01 = this.LW) != null)
/*    */       fx01.vI(); 
/*    */     super.tp0();
/*    */     gx();
/*    */     this.ih.clear();
/*    */     throws throws;
/*    */     if ((throws = this.Bo0) != null && !throws.l30)
/*    */       throws.MW(2, null); 
/*    */   }
/*    */   
/*    */   public final void LM(throws paramthrows) {
/*    */     (this.LW = new fx0(paramthrows)).rl0(300);
/*    */     this.LW.NY = this.C00;
/*    */   }
/*    */   
/*    */   public final void d40() {}
/*    */   
/*    */   public final JG0 Oz0(oa0 paramoa0) {
/*    */     this.je = false;
/*    */     JG0 jG01, jG02;
/*    */     if ((jG02 = super.Oz0(paramoa0)) == this && this.g10 && this.AU.yw0(paramoa0) && (jG01 = this.AU.Oz0(paramoa0)) != null) {
/*    */       this.je = true;
/*    */       jG02 = jG01;
/*    */     } 
/*    */     jG01 = gg();
/*    */     if (this.Vn0 != jG01) {
/*    */       this.Vn0 = jG01;
/*    */       if (this.g10 && jG02.fr0 == this.AU && jG02 instanceof J7) {
/*    */         if (jG01 instanceof Runnable && jG01.kN) {
/*    */           ((Runnable)jG01).run();
/*    */         } else if (jG01 != this) {
/*    */           int i;
/*    */           for (i = -1; jG01 != null; ) {
/*    */             if (jG01 instanceof rJ0) {
/*    */               i = ((rJ0)jG01).w00;
/*    */               break;
/*    */             } 
/*    */             jG01 = jG01.fr0;
/*    */           } 
/*    */           if (i != -1)
/*    */             while (Ub() > i)
/*    */               fG0(Ub() - 1);  
/*    */         } 
/*    */       } else {
/*    */         fx0 fx01;
/*    */         if ((fx01 = this.LW) != null) {
/*    */           fx01.vI();
/*    */           this.LW.ha();
/*    */         } 
/*    */       } 
/*    */     } 
/*    */     return jG02;
/*    */   }
/*    */   
/*    */   public boolean sR(oa0 paramoa0) {
/*    */     if (this.g10 && this.AU.i2(paramoa0))
/*    */       return true; 
/*    */     if (super.sR(paramoa0))
/*    */       return true; 
/*    */     if (paramoa0.cz0 == 5) {
/*    */       if (this.z9) {
/*    */         Runnable runnable;
/*    */         if ((runnable = this.es0) != null) {
/*    */           runnable.run();
/*    */         } else {
/*    */           tp0();
/*    */         } 
/*    */       } 
/*    */       return true;
/*    */     } 
/*    */     return false;
/*    */   }
/*    */   
/*    */   public final JG0 gg() {
/*    */     if (this.je)
/*    */       return this.AU.gg(); 
/*    */     return super.gg();
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/io.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */