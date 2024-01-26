/* 1 */ package f;public final class rE0 extends Wo0 { public static void Sr0() { h1.ev = "ANGLE";
/* 2 */     h1.Td(); String[] arrayOfString; (arrayOfString = new String[1])[0] = "angle"; km.Gj.lPt2(true, arrayOfString); } public final boolean zT(JU paramJU) { boolean bool = false; Locale locale; if (paramJU.getMessage().toLowerCase(locale = Locale.ROOT).contains("OpenGL 2.0 or higher with the FBO extension is required".toLowerCase(locale)) || paramJU.getMessage().toLowerCase(locale).contains("OpenGL is not supported by the video driver".toLowerCase(locale)) || paramJU.getMessage().equalsIgnoreCase("Couldn't create window") || paramJU.getMessage().equalsIgnoreCase("Unable to initialize GLFW")) bool = true;  if (!bool) return false;  if (ANGLELoader.isCompatible()) { boolean bool1; String str = System.getProperty("os.version"); if (yG.x3 == yG.HD0 && ("Windows XP".equalsIgnoreCase(System.getProperty("os.name")) || "5.1".equals(this))) { bool1 = true; } else { bool1 = false; }  if (bool1) {
/* 3 */         LP lP1 = LP.Od0; km.f70
/* 4 */           .iJ0("PokeMMO", Ml0.la(88, "Sorry, Your computer does not meet the minimum requirements."), this, null, false);
/* 5 */         System.exit(0); return true;
/* 6 */       }  if (Kz.valueOf(h1.ev) != 
/* 7 */         Kz.rL0 || !ANGLELoader.isInstalled()) km.f70.lpt3(paramJU.getMessage(), Ml0.la(1216, "Error attempting to set up hardware accelerated graphics.\nWould you like to attempt to use the ANGLE rendering mode?"), LP.lS, rE0::Sr0, rE0::pa0, true);  }  LP lP = LP.Od0; Runnable runnable = rE0::za0; km.f70
/* 8 */       .iJ0("PokeMMO", Ml0.la(85, "Error attempting to set up hardware accelerated graphics.\nPlease visit https://pokemmo.com/pfna for instructions on how to fix this."), this, runnable, false); return true; }
/*   */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/rE0.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */