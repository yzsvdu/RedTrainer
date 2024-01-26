/*  1 */ package f;public abstract class g8 { public static final ik VS = C00.gd(g8.class); public static boolean Pf = false; public static HashMap cOm7 = h1.ib0(); public static HashMap as = new HashMap<>(); public static rx0[] H70 = new rx0[0]; public static void mE() { yk yk; if (Pf) return;  H70 = (rx0[])cOm7.values().toArray((Object[])new rx0[0]);
/*  2 */     Pf = true; ik ik1; (ik1 = VS).info("Starting controller setup"); if (h1.D30) { Tq tq; this();
/*  3 */       A1.L7
/*  4 */         .ac0(tq::Jh0, 20000L);
/*  5 */       rn0.Xl0();
/*  6 */       ((Z6)rn0.Q4.pd0(UB0.Kg0))
/*  7 */         .getControllers();
/*  8 */       tq.VF0 = true;
/*  9 */       JR(); this();
/* 10 */       rn0.Xl0();
/* 11 */       ((Z6)rn0.Q4.pd0(UB0.Kg0))
/* 12 */         .addListener(yk); } else { yk
/* 13 */         .info("Native controllers disabled due to config. (Potentially failed setup)"); }  } public static void JO(ah0 paramah0) { AN aN; ik ik1 = VS; StringBuilder stringBuilder = B40.df("Controller "); stringBuilder = stringBuilder.append(bI.COm4).append(" ( ax ").append(bI.T2()).append(" btn "); BI bI; int i; if ((i = (bI = (BI)paramah0).rp) < 0) { bI.rp = BI.r0.kG - 1; try { for (; (i = bI.rp) > 0 && !bI.Fp0.Sv((s3)BI.r0.get(i)); bI.rp--); } catch (l9 l9) { bI.hp0(); } catch (NullPointerException nullPointerException) {} i = bI.rp; }  stringBuilder = stringBuilder.append(i).append(") "); try {  } finally { null; }
/* 14 */      ik1.info(stringBuilder.append(aN).append(" attached. ").append(bI.UI0).toString()); js js; if ((js = js.vu0) != null) { AN aN1; js.Pu(-1, Ml0.Go(1395, bI.COm4));
/* 15 */       int[] arrayOfInt = Hj0.uM; try {  } finally { null; }
/* 16 */        arrayOfInt[aN1
/* 17 */           .ordinal()]; }
/*    */      rx0 rx01;
/* 19 */     if ((rx01 = (rx0)cOm7.get(bI.COm4)) != null) { rx01
/* 20 */         .bm0 = paramah0; if (paramah0 == null) { Arrays.fill(rx01.RV, false); } else { rx01.RV = new boolean[((BI)paramah0).T2() * 2]; }
/*    */        }
/*    */     else
/* 23 */     { this(paramah0, bI.COm4); (new rx0()).Ie(); cOm7
/*    */         
/* 25 */         .put(bI.COm4, rx01);
/* 26 */       H70 = (rx0[])cOm7.values().toArray((Object[])new rx0[0]); }
/* 27 */      bI.fJ
/* 28 */       .JK0
/* 29 */       .add(rx01);
/* 30 */     as.put(paramah0, rx01); }
/*    */ 
/*    */   
/*    */   public static fQ JR() {
/*    */     mE();
/*    */     if (!h1.D30)
/*    */       return new fQ(); 
/*    */     rn0.Xl0();
/*    */     fQ fQ;
/*    */     for (Hc0 hc0 = (fQ = ((Z6)rn0.Q4.pd0(UB0.Kg0)).getControllers()).r30(); hc0.hasNext();) {
/*    */       if (eE(ah0 = (ah0)hc0.next()) == null)
/*    */         JO(ah0); 
/*    */     } 
/*    */     return fQ;
/*    */   }
/*    */   
/*    */   public static rx0 eE(ah0 paramah0) {
/*    */     return (rx0)as.get(paramah0);
/*    */   }
/*    */   
/*    */   public static void Jh0(Tq paramTq) {
/*    */     if (!paramTq.VF0) {
/*    */       RuntimeException runtimeException;
/*    */       h1.D30 = false;
/*    */       h1.Td();
/*    */       this();
/*    */       C00.gd(g8.class).error("Deadlock setting up controllers. Attempting to restart with controllers disabled.", runtimeException);
/*    */       km.f70.iJ0("Error", "Deadlock setting up controllers. Attempting to restart with controllers disabled.\nIf you have Steam application running you can try closing it temporarily and then trying with controller support enabled again.", LP.Od0, g8::qd0, false);
/*    */     } 
/*    */   }
/*    */   
/*    */   public static void qd0() {
/*    */     UB0.Kg0.K7 = false;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/g8.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */