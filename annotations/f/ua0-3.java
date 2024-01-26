/* 1 */ package f;public final class ua0 extends Bc { public final void fo(BufferedReader paramBufferedReader) { super.fo(paramBufferedReader); if (paramBufferedReader.markSupported()) paramBufferedReader.mark(100);  String str; if ((str = paramBufferedReader.readLine()) != null) { if (contains("independent"))
/* 2 */       { Boolean.parseBoolean(substring(indexOf(":") + 1).trim()); } else { if (paramBufferedReader.markSupported()) { paramBufferedReader.reset(); return; }  UB0.Kg0.O70("ParticleEmitter", "The loaded particle effect descriptor file uses an old invalid format. Please download the latest version of the Particle Editor tool and recreate the file by loading and saving it again."); throw new IOException("The loaded particle effect descriptor file uses an old invalid format. Please download the latest version of the Particle Editor tool and recreate the file by loading and saving it again."); }  return; }  throw new IOException("Missing value: independent"); }
/*   */ 
/*   */   
/*   */   public final void s4(ua0 paramua0) {
/*   */     k5(paramua0);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/ua0.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */