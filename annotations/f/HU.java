/*  1 */ package f;public final class HU extends UA { public final void Vt(String[] paramArrayOfString) { if (paramArrayOfString.length < 2) { UA.Ue(">debug <ui|map|season|csanim|battle_gui|buildmode|phyupdate|particlesystem>"); return; }  if (paramArrayOfString[1].equals("ui")) { Pw.Ag0 ^= 0x1; js.vu0
/*  2 */         .KE(); UA.Ue("Debug UI = " + Pw.Ag0); } else if (paramArrayOfString[1].equals("map"))
/*    */     { Oe0 oe0;
/*  4 */       this();
/*    */       
/*  6 */       js.vu0.si(this, js.vu0.Ub()); } else if (paramArrayOfString[1]
/*  7 */       .equals("season")) { if (paramArrayOfString.length < 3) {
/*  8 */         mk.vx
/*  9 */           .r10("Missing season_id check your request.", "red"); return;
/*    */       }  
/* 11 */       try { L70.gq
/* 12 */           .kX(Byte.parseByte(paramArrayOfString[2])); } catch (NumberFormatException numberFormatException)
/* 13 */       { mk.vx
/* 14 */           .r10("Error parsing season_id check your request.", "red"); return; }  } else if (paramArrayOfString[1]
/* 15 */       .equals("weather")) { try { yE0.valueOf(paramArrayOfString[2]); } catch (Exception exception)
/* 16 */       { mk.vx
/* 17 */           .r10("Error parsing weatherType check your request.", "red"); return; }  } else { byte b; String str; hm0[] arrayOfHm0; if (paramArrayOfString[1]
/* 18 */         .equals("csanim")) { try { float f; if ((f = Float.parseFloat(paramArrayOfString[2])) <= 0.0F)
/* 19 */             mk.vx
/* 20 */               .r10("Speed can't be less or equal 0.", "red"); 
/* 21 */           Hk.Pn = f; String str1 = "Set the character sprite animation speed to " + f; str = "green"; } catch (NumberFormatException numberFormatException)
/* 22 */         { mk.vx
/* 23 */             .r10("Error parsing speed check your request.", "red"); return; }  } else { String str1; if (str[1]
/* 24 */           .equals("phyupdate") || str[1].equals("physpeed")) {
/*    */           vH vH;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */           
/* 33 */           this = null; Pw pw;
/*    */           Wl wl;
/* 35 */           if ((wl = (pw = km.wI0).K7) != null && wl instanceof vH) {
/* 36 */             vH = (vH)wl;
/*    */           }
/* 38 */           kg0 kg0 = pw.iJ0.eA0(); if (str.length < 3) { if (this != null)
/* 39 */             { this
/* 40 */                 .jv0
/* 41 */                 .getClass();
/*    */               
/* 43 */               UA.Ue(B40.df("BattlePhySysTick = ").append(kg0.b5).toString()); }  if (kg0 != null)
/*    */             {
/*    */               
/* 46 */               UA.Ue(B40.df("MapPhySysTick = ").append(kg0.b5).toString()); }  return; }  try { float f; if ((f = Float.parseFloat(str[2])) <= 0.0F)
/* 47 */               mk.vx
/* 48 */                 .r10("Speed can't be less or equal 0.", "red");  if (this != null) { this
/* 49 */                 .jv0
/* 50 */                 .getClass();
/* 51 */               kg0.b5 = 1.0F / f; }  if (kg0 != null) kg0.b5 = 1.0F / f; 
/* 52 */             String str2 = "Set the physics update to " + f + "fps "; str1 = "green";
/* 53 */             mk.vx
/* 54 */               .r10(this, str1); } catch (NumberFormatException numberFormatException)
/* 55 */           { mk.vx
/* 56 */               .r10("Error parsing speed check your request.", "red");
/*    */             return; }
/*    */         
/*    */         } 
/*    */         if (str1[1].equals("particlesystem")) {
/*    */           Bz.SF ^= 0x1;
/*    */           String str2 = "Toggled particle system profiler.";
/*    */           str1 = "green";
/*    */         } else {
/*    */           if (str1[1].equals("buildmode")) {
/*    */             R8 r8;
/*    */             if ((r8 = km.u4) != null && this.Qa != null)
/*    */               ro.l10 = (ro.l10 == 0) ? 1 : 0; 
/*    */           } else if (str1[1].equals("battle_gui") && km.MR != null) {
/*    */             for (b = 0; b < km.MR.H3(); ) {
/*    */               int i;
/*    */               byte b1;
/*    */               for (i = (arrayOfHm0 = km.MR.cl[b]).length, b1 = 0; b1 < i; ) {
/*    */                 hm0 hm0;
/*    */                 Wl wl;
/*    */                 if ((hm0 = arrayOfHm0[b1]) != null && (wl = km.wI0.K7) != null) {
/*    */                   wl.LW.oD(hm0).COM8(hm0, false, hm0.XW());
/*    */                   int j = (wl.LW.oD(hm0)).pz0, k = (wl.LW.oD(hm0)).Ll, m = (wl.LW.oD(hm0)).p9, n = (wl.LW.oD(hm0)).ho0;
/*    */                   wl.LW.oD(hm0).Io0(j, k, m, n, true);
/*    */                 } 
/*    */                 b1++;
/*    */               } 
/*    */               b = (byte)(b + 1);
/*    */             } 
/*    */           } 
/*    */           return;
/*    */         }  }
/*    */       
/*    */       mk.vx.r10(this, (String)arrayOfHm0); }
/*    */      }
/*    */ 
/*    */   
/*    */   public HU() {
/*    */     super("debug");
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/HU.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */