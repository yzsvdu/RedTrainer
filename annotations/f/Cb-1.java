/*  1 */ package f;public final class Cb extends vF0 { public Lh0 kj0; public int PL0; public String eb0 = ""; public final void TU(Lh0 paramLh0) { this.kj0 = paramLh0; if (paramLh0 == null) { this.TS
/*  2 */         .H();
/*  3 */       this.z4 = null; zn();
/*  4 */       E1(""); wI0(false); } else { short s4; StringBuilder stringBuilder4; short s3; StringBuilder stringBuilder3; short s2; StringBuilder stringBuilder2; short s1; StringBuilder stringBuilder1; float f; wI0(true); char c = Character.MIN_VALUE;
/*  5 */       switch (this.kj0.H40
/*  6 */         .Ei0
/*  7 */         .ordinal()) { default: this.eb0 = ""; this.N7 = ""; break;case 8: c = 'Ԝ'; this.eb0 = Ml0.OH0(16804151); break;case 7: c = 'А'; this.eb0 = Ml0.OH0(16777248); break;case 6: c = 'Ꮧ'; this.eb0 = Ml0.OH0(16777237); break;case 5: c = 'ᒡ';
/*    */           
/*  9 */           if ((s4 = this.kj0.H40.cF0) >= 200 && s4 <= 217) c = 'ל';  this
/* 10 */             .eb0 = Ml0.OH0(101116); break;case 4: c = 'ᖮ';
/*    */           
/* 12 */           if ((s4 = this.kj0.H40.cF0) >= 100 && s4 <= 199) c = 'ց';  this
/* 13 */             .eb0 = Ml0.OH0(101126);
/*    */ 
/*    */ 
/*    */ 
/*    */           
/* 18 */           this.N7 = B40.df("+").append(100.0F - this.kj0.H40.Oq * 100.0F).append("%").toString(); break;case 3: c = 'ᑹ';
/*    */           
/* 20 */           if ((s4 = this.kj0.H40.cF0) >= 100 && s4 <= 199) c = 'վ';  this
/* 21 */             .eb0 = Ml0.OH0(101124);
/* 22 */           stringBuilder4 = B40.df("+");
/*    */         case 2:
/* 24 */           c = 'ᑺ';
/*    */ 
/*    */           
/* 27 */           if ((s3 = this.kj0.H40.cF0) >= 100 && s3 <= 199) c = 'ջ';  this
/* 28 */             .eb0 = Ml0.OH0(101122);
/* 29 */           stringBuilder3 = B40.df("+");
/*    */         case 1:
/* 31 */           c = 'ᑧ';
/*    */ 
/*    */           
/* 34 */           if ((s2 = this.kj0.H40.cF0) >= 100 && s2 <= 199) c = 'ք';  this
/* 35 */             .eb0 = Ml0.OH0(101128);
/* 36 */           stringBuilder2 = B40.df("+");
/*    */         case 0:
/* 38 */           c = 'ᑯ';
/*    */ 
/*    */           
/* 41 */           if ((s1 = this.kj0.H40.cF0) == 2) { c = 'ҩ'; } else if (s1 >= 100 && s1 <= 199) { c = 'ո'; }  this
/* 42 */             .eb0 = Ml0.OH0(101120);
/* 43 */           stringBuilder1 = B40.df("+");
/*    */ 
/*    */           
/* 46 */           f = this.kj0.H40.Oq; this
/* 47 */             .N7 = stringBuilder1.append(f * 100.0F - 100.0F).append("%").toString(); break; }  this
/* 48 */         .TS
/*    */ 
/*    */ 
/*    */         
/* 52 */         .qt(new U70[] { wm0.y0.ep(c, false) });
/* 53 */       this.TS
/*    */         
/* 55 */         .zT((this.xY - this.TS.e00()) / 2, 5); if (km.XU()) { this
/* 56 */           .TS
/* 57 */           .tL(48, 48); } else { this
/* 58 */           .TS
/* 59 */           .tL(24, 24); }
/* 60 */        Jo jo; String str; if ((jo = km.a3.Ct) != null && (
/*    */         
/* 62 */         str = this.kj0.Oi) != jo
/* 63 */         .ED0) this
/* 64 */           .L = str;  this
/*    */         
/* 66 */         .PL0 = this.kj0.X4; rt0(); ln();
/* 67 */       this.jl = 100;
/* 68 */       sk0(false); }
/*    */      }
/*    */ 
/*    */   
/*    */   public String N7 = "";
/*    */   public String L = "";
/*    */   public String Ej = "";
/*    */   
/*    */   public Cb(Lh0 paramLh0) {
/*    */     Xu("effects-slot");
/*    */     TU(paramLh0);
/*    */   }
/*    */   
/*    */   public final void d40() {
/*    */     super.d40();
/*    */     this.TS.zT((this.xY - this.TS.e00()) / 2, 5);
/*    */   }
/*    */   
/*    */   public final void rt0() {
/*    */     String str = this.eb0;
/*    */     if (!this.N7.isEmpty())
/*    */       str = zw.vz(str, "\n").append(this.N7).toString(); 
/*    */     if (this.kj0 != null) {
/*    */       if (this.PL0 > 0)
/*    */         str = zw.vz(str, "\n").append(LF.Ya(this.PL0, 2)).toString(); 
/*    */       if (!this.L.isEmpty())
/*    */         str = zw.vz(str, "\n").append(Ml0.Go(6069, this.L)).toString(); 
/*    */     } 
/*    */     if (!str.equals(this.Ej)) {
/*    */       this.z4 = str;
/*    */       zn();
/*    */       this.Ej = str;
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void ln() {
/*    */     String str;
/*    */     if (this.kj0.X4 < 0) {
/*    */       E1("∞");
/*    */       return;
/*    */     } 
/*    */     int i;
/*    */     if ((i = this.PL0) < 1) {
/*    */       E1(" ");
/*    */       return;
/*    */     } 
/*    */     if (i > 86400) {
/*    */       int j = (i - (i /= 86400) * 86400) / 3600;
/*    */       if (Ml0.nW.return(7511)) {
/*    */         arrayOfString[0] = String.valueOf(i);
/*    */         String[] arrayOfString;
/*    */         (arrayOfString = new String[2])[1] = String.valueOf(j);
/*    */         str = Ml0.sB(7511, arrayOfString);
/*    */       } else {
/*    */         str = str + "d" + j + "h";
/*    */       } 
/*    */     } else {
/*    */       String str1;
/*    */       if (str > 'ฐ') {
/*    */         int j = str / 3600;
/*    */         if (Ml0.nW.return(7512)) {
/*    */           str1 = Ml0.Go(7512, String.valueOf(j));
/*    */         } else {
/*    */           str1 = str1 + "h";
/*    */         } 
/*    */       } else if (str1 > '<') {
/*    */         int j = str1 / 60;
/*    */         if (Ml0.nW.return(7513)) {
/*    */           str = Ml0.Go(7513, String.valueOf(j));
/*    */         } else {
/*    */           str = str + "m";
/*    */         } 
/*    */       } else if (Ml0.nW.return(7514)) {
/*    */         str = Ml0.Go(7514, String.valueOf(str));
/*    */       } else {
/*    */         str = str + "s";
/*    */       } 
/*    */     } 
/*    */     E1(str);
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Cb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */