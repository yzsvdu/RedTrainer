/*  1 */ package f;public class Bc extends rM { public void fo(BufferedReader paramBufferedReader) { super.fo(paramBufferedReader); if (!this.Pb) return;  Float.parseFloat(iB0.dL(paramBufferedReader, "highMin")); Float.parseFloat(iB0.dL(paramBufferedReader, "highMax"));
/*  2 */     Boolean.parseBoolean(iB0.dL(paramBufferedReader, "relative")); byte b;
/*    */     float[] arrayOfFloat;
/*  4 */     for (this.DL = new float[Integer.parseInt(iB0.dL(paramBufferedReader, "scalingCount"))], b = 0; b < (arrayOfFloat = this.DL).length; ) { arrayOfFloat[b] = 
/*  5 */         Float.parseFloat(iB0.dL(paramBufferedReader, "scaling" + b));
/*  6 */       b++; }  for (this
/*    */       
/*  8 */       .Yk = new float[Integer.parseInt(iB0.dL(paramBufferedReader, "timelineCount"))], b = 0; b < (arrayOfFloat = this.Yk).length; ) { arrayOfFloat[b] = 
/*  9 */         Float.parseFloat(iB0.dL(paramBufferedReader, "timeline" + b));
/* 10 */       b++; }
/*    */      }
/*    */ 
/*    */   
/*    */   public float[] DL;
/*    */   public float[] Yk;
/*    */   
/*    */   public Bc() {
/*    */     float[] arrayOfFloat;
/*    */     (arrayOfFloat = new float[1])[0] = 1.0F;
/*    */     this.DL = this;
/*    */     (arrayOfFloat = new float[1])[0] = 0.0F;
/*    */     this.Yk = this;
/*    */   }
/*    */   
/*    */   public final void k5(Bc paramBc) {
/*    */     this.Pb = paramBc.Pb;
/*    */     this.fs0 = paramBc.fs0;
/*    */     int i;
/*    */     float[] arrayOfFloat = new float[i = paramBc.DL.length];
/*    */     System.arraycopy(paramBc.DL, 0, arrayOfFloat, 0, i);
/*    */     this.Yk = arrayOfFloat = new float[i = paramBc.Yk.length];
/*    */     System.arraycopy(paramBc.Yk, 0, arrayOfFloat, 0, i);
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Bc.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */