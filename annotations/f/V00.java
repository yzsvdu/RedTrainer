/*  1 */ package f;public final class V00 extends Qa0 implements r60 { public final Ip mh0; private void s40() { if (!this.LY.kN)
/*  2 */       return;  ra0(); R8 r8; if ((r8 = km.u4) != null) Ch0();  } public final Un LY; public V00(js paramjs, LI paramLI, wQ paramwQ) { super(false, false); String str; MS mS; da da; StringBuilder stringBuilder; paramjs.lv(); Xu("disconnection-widget"); this(); this.mh0 = ip; Ip ip; (ip = new Ip()).Xu("confirm-panel"); this(); this(mS); (new da()).Kh0(V00::A90); (new da()).Xu("textarea"); this(); if (paramwQ != wQ.l8) { this(); StringBuilder stringBuilder1; (stringBuilder1 = new StringBuilder()).append(Ml0.OH0(paramwQ.Nw())); int i; if ((i = paramwQ.h00()) > 0) { stringBuilder1.append("\n\n"); stringBuilder1.append(cS.Wc0(Ml0.OH0(i))); }  str = stringBuilder1.toString(); } else { str = paramLI.oS(); }  if (paramLI.pQ() != -1) { xD(stringBuilder, Ml0.OH0(1063), "big-yellow", true); Locale locale = cE.i20().PH(); xD(stringBuilder, Ml0.Go(1047, DateFormat.getDateTimeInstance(2, 3, locale).format(Long.valueOf(paramLI.pQ() * 1000L))), "default", true); xD(stringBuilder, Ml0.Go(1046, str), "default", true); xD(stringBuilder, Ml0.OH0(1064), "default", false); } else { xD(stringBuilder, Ml0.OH0(1059), "big-red", true); xD(stringBuilder, Ml0.Go(1048, DateFormat.getDateInstance(2, cE.i20().PH()).format(Long.valueOf(paramLI.Pp0() * 1000L))), "default", true); xD(stringBuilder, Ml0.Go(1046, str), "default", true); xD(stringBuilder, Ml0.OH0(1064), "default", false); }  mS.Oh(stringBuilder.toString()); this(Ml0.OH0(52)); this.LY = un; un.sk0(false); Un un; (un = new Un()).tW(this::s40); ip.WN(ip.d7().Ya(da).Ya(un).Em0()); ip.rK0(ip.mE0().Ya(da).Ya(un)); J8(ip); this.eh = km.XU(); } public static void xD(StringBuilder paramStringBuilder, String paramString1, String paramString2, boolean paramBoolean) { paramStringBuilder.append("<div style=\"word-wrap: break-word; font-family: " + paramString2 + "; text-align: center;"); paramStringBuilder.append(" \\\">"); if (paramBoolean) paramString1 = m0.tF0(paramString1, "\n\n");  if ((paramString1 = paramString1.replaceAll("\\n", "<br/>")).matches(".*https://([a-z\\.\\-]+)?pokemmo.com.*")) paramString1 = paramString1.replaceAll("(https://([a-z\\.\\-]+)?pokemmo\\.com\\S*)", "<a style=\"display: inline; float: left; font: link\" href=\"$1\">$1</a>");  paramStringBuilder.append(paramString1); paramStringBuilder.append("</div>"); } public final void LM(throws paramthrows) { VA0.c90(this.LY); (new fx0(paramthrows)).rl0(10000); (new fx0(paramthrows)).ha();
/*  3 */     (new fx0(paramthrows)).NY = (() -> this.LY.sk0(true)); } public final boolean i2(oa0 paramoa0) { if (B8.Wm0(paramoa0.cz0) && paramoa0.oO() && (
/*    */       
/*  5 */       h1.J20(paramoa0.GG0, BM.bC) || 
/*    */       
/*  7 */       h1.J20(paramoa0.GG0, BM.lc))) {
/*    */ 
/*    */       
/* 10 */       hm.Fz0(this.LY.TG0.oh0); return true;
/* 11 */     }  return super.i2(paramoa0); }
/*    */ 
/*    */   
/*    */   public final void d40() {
/*    */     super.d40();
/*    */     QI();
/*    */     this.mh0.mM();
/*    */     this.mh0.js0(et.Wi0);
/*    */   }
/*    */   
/*    */   public final void V90(throws paramthrows) {
/*    */     if (km.XU()) {
/*    */       BA();
/*    */     } else {
/*    */       VA0.c90(this.LY);
/*    */     } 
/*    */     super.V90(paramthrows);
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/V00.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */