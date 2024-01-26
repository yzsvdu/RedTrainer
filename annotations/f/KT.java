/* 1 */ package f;public final class KT extends lpt1 { public final void M70(eo parameo) { getClass(); float f1 = parameo.x, f2 = parameo.y, f3 = parameo.z; eo eo1; this.mh
/* 2 */       .b8((eo1 = MA).TG0(f1, f2, f3).uD(0.0F, 0.05F, -0.15F)); }
/*   */ 
/*   */   
/*   */   public static final eo MA = new eo();
/*   */   
/*   */   public KT(cf0 paramcf0) {
/*   */     super(paramcf0, "CNYRatGameObject", 48.0F, null);
/*   */     Jx0(true);
/*   */     if (!paramcf0.cs.isEmpty())
/*   */       ml0(0, true); 
/*   */     Hc0 hc0 = paramcf0.s30.r30();
/*   */     while (hasNext()) {
/*   */       ((T0)next()).Ng0(qo.J9);
/*   */       ((T0)next()).Ng0(qo.cu0);
/*   */       ((T0)next()).Ng0(qo.bh0);
/*   */       ((T0)next()).Ng0(zc.U7);
/*   */     } 
/*   */     T0 t02 = (T0)paramcf0.s30.get(1);
/*   */     T0 t01;
/*   */     long l;
/*   */     if ((t01 = (T0)paramcf0.s30.get(0)) != null && gV(l = qo.A80))
/*   */       ((qo)ct0(l)).vF0.set(Color.WHITE); 
/*   */     if (t02 != null && t02.gV(l = qo.A80))
/*   */       ((qo)t02.ct0(l)).vF0.set(Color.BLACK); 
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/KT.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */