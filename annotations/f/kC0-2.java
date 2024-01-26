/*  1 */ package f;public final class kC0 extends kD0 { public final of cv0; public final String Wa; public rS Io; public da XH0; public wH0 yU; public SimpleDateFormat Is; public wi0 aw; public StringBuilder Lm0; public kC0(String paramString) { super("pm-box-frame"); Fy0 fy0; Un un1; this.Is = new SimpleDateFormat("hh:mm:ss a"); this.Lm0 = new StringBuilder(); this.Wa = paramString; this(); EP(3); Xu("pm-box-frame"); Lo("PM (" + paramString + ")"); TG0(new eD(paramString)); this(); of1.ZW(); this.yU = new wH0(); (this.XH0 = new da(this.yU)).Xu("textarea"); this.XH0.Kh0(new uq0()); of of1; (of1 = new of()).sk0(false); (this.Io = new rS(this.XH0)).Xu("text-scrollpane"); this(); this.cv0 = new of(); this(Ml0.OH0(1525)); this("⇲"); un2.Xu("button-symbol"); un1.tW(new Mq0(this)); of1.JD0(new Pw0(this)); Un un2; (un2 = new Un()).tW(new c2(this)); Ip ip; (new Ip()).rK0((ip = new Ip()).mE0().ee0(ip.d7().Ya(this.Io)).ee0(ip.d7().Mg(new JG0[] { of1, un1, un2 }))); (new Ip()).WN((new Ip()).d7().ee0(ip.mE0().Ya(this.Io)).ee0(ip.mE0().Mg(new JG0[] { of1, un1, un2 }))); J8(new Ip()); this.Bm0 = ip; if (paramString.length() > 10) paramString = paramString.substring(0, 9) + "..."; 
/*  2 */     this(De0.AT("PM (", paramString, ")"), 200, 30); this.vi = new Fy0(); fy0.zY().zT(7, 7); this.vi.zY().tL(16, 16); this.vi.zY().EV(250); this.vi.tW(new eA(this)); this.ab0.J8(this.vi); J8(this.ab0); this.ab0.wI0(false); }
/*    */ 
/*    */   
/*  5 */   public static void m4(kC0 paramkC0) { if (!paramkC0.cv0.F2.PH0.toString().isEmpty()) { ZY zY = ZY.Nd0;
/*    */ 
/*    */       
/*  8 */       String str1 = paramkC0.cv0.F2.PH0.toString();
/*  9 */       String str2 = paramkC0.Wa;
/* 10 */       km.u4.p9(zY, str1, str2, true);
/* 11 */       paramkC0.cv0
/* 12 */         .Be0("", false); }  } public final void KS(Mv0 paramMv0) { wu wu; boolean bool; da da1; String str1 = "admin", str3 = paramMv0.mq; if (paramMv0.r6 == 0) { str1 = "player"; str3 = km.a3.Ct.ED0; }  int j = this.Lm0.length(); if (paramMv0.r6 == 0) { this.Lm0.append("\n<div style=\"width: 340px;\"><div style=\"float: right; width: 240px; background-image: url(").append(str1).append(");\">"); this.Lm0.append("\n\t<chat style=\"text-align: right; font-family: link; margin-right: 14px; margin-top: 12px;\">").append(str3).append("</chat>"); this.Lm0.append("\n\t<div style=\"display: inline; text-align: right; word-wrap: break-word; margin-right: 10px; padding: 3px; padding-bottom: 10px;font-family: chatdefault; \">"); if (paramMv0.LT > 0) { da da2 = this.XH0;
/* 13 */         str3 = paramMv0.IQ;
/* 14 */         int k = paramMv0.r6;
/* 15 */         StringBuilder stringBuilder = this.Lm0; pA.Dg0.TF.Cd(da2, str3, k, stringBuilder, true, false, false); }  if (paramMv0
/* 16 */         .IQ
/* 17 */         .contains("{") && paramMv0
/* 18 */         .IQ
/* 19 */         .contains("}"))
/*    */       { boolean bool1;
/* 21 */         wu = pA.Dg0.TF;
/* 22 */         da1 = this.XH0;
/* 23 */         String str = paramMv0.IQ;
/* 24 */         int k = paramMv0.r6;
/* 25 */         StringBuilder stringBuilder = this.Lm0;
/* 26 */         if (paramMv0.LT > 0) { bool1 = true; } else { bool1 = false; }  wu
/* 27 */           .Cd(da1, str, k, stringBuilder, bool1, false, false); } else { this.Lm0
/*    */           
/* 29 */           .append(paramMv0.IQ); }  this.Lm0.append("</div>"); this.Lm0.append("\n</div>"); this.Lm0.append("\n\t<div style=\"display: block; float: right; text-align: right; width: 240px;font-family: chatdefault;\">").append(this.Is.format(Long.valueOf(System.currentTimeMillis()))).append("</div>"); this.Lm0.append("</div>"); } else { this.Lm0.append("\n<div style=\"width: 340px;\"><div style=\"width: 240px; background-image: url(").append((String)wu).append(");\">"); this.Lm0.append("\n\t<chat style=\"font-family: link; margin-left: 4px; margin-top: 12px;\">").append((String)da1).append("</chat>"); this.Lm0.append("\n\t<div style=\"display: inline; text-align: left; word-wrap: break-word; margin-right: 10px; padding: 3px; padding-bottom: 10px;font-family: chatdefault; \">"); if (paramMv0
/* 30 */         .LT > 0)
/*    */       
/*    */       { 
/* 33 */         da da2 = this.XH0;
/* 34 */         String str = paramMv0.IQ;
/* 35 */         int k = paramMv0.r6;
/* 36 */         StringBuilder stringBuilder = this.Lm0; pA.Dg0.TF.Cd(da2, str, k, stringBuilder, true, false, false); } else if (paramMv0
/* 37 */         .IQ
/* 38 */         .contains("{") && paramMv0
/* 39 */         .IQ
/* 40 */         .contains("}"))
/*    */       
/*    */       { 
/* 43 */         da da2 = this.XH0;
/* 44 */         String str = paramMv0.IQ;
/* 45 */         int k = paramMv0.r6;
/* 46 */         StringBuilder stringBuilder = this.Lm0; pA.Dg0.TF.Cd(da2, str, k, stringBuilder, false, false, false); } else { this.Lm0
/*    */           
/* 48 */           .append(paramMv0.IQ); }  this.Lm0.append("</div>"); this.Lm0.append("\n</div>"); this.Lm0.append("\n\t<div style=\"display: block; float: left; text-align: left; width: 240px;font-family: chatdefault;\">").append(this.Is.format(Long.valueOf(System.currentTimeMillis()))).append("</div>"); this.Lm0.append("</div>"); }
/* 49 */      int i = paramMv0.r6;
/* 50 */     String str2 = paramMv0.IQ;
/* 51 */     this.aw = new wi0(i, this.Lm0.length() - j, str2); Ja ja;
/* 52 */     if ((ja = this.Io.PB)
/* 53 */       .sy == ja
/* 54 */       .Ny0) { bool = true; } else { bool = false; }  this
/* 55 */       .yU.BK(this.Lm0.toString()); this.XH0.Ld(this.yU);
/* 56 */     if (this.ab0
/* 57 */       .dP && paramMv0
/* 58 */       .r6 != 0)
/*    */     {
/* 60 */       this.vi.As
/* 61 */         .w70 = true; }  if (bool)
/* 62 */       UB0.Kg0.fN(new Vw(this));  }
/*    */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/kC0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */