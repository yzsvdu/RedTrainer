/*  1 */ package f;public abstract class pf extends iK { public static void Bx0(ByteBuffer paramByteBuffer) { short s; byte b; for (s = paramByteBuffer.getShort(), b = 0; b < s; ) { short s1 = paramByteBuffer.getShort(); (WD)Objects.<WD>requireNonNull(yk0.cw().mP(s1), s1 + ""); Z4 z4;
/*    */       gr0 gr0;
/*  3 */       if ((gr0 = (gr0)(z4 = Z4.T0).TF.Z90(s1)) == null) {
/*  4 */         this(DG.qk0, gr0.g6);
/*  5 */         z4.TF.Vh0(s1, gr0);
/*  6 */       }  if (((s1 = paramByteBuffer.get()) & 0x1) != 0) gr0
/*  7 */           .vK0 = paramByteBuffer.get();  if ((s1 & 0x2) != 0) gr0
/*    */           
/*  9 */           .CA0 = DG.dM(paramByteBuffer.get());  if ((s1 & 0x4) != 0) paramByteBuffer
/* 10 */           .get();  if ((s1 & 0x8) != 0) { byte[] arrayOfByte; byte b1; for (arrayOfByte = new byte[s1 = paramByteBuffer.get()], b1 = 0; b1 < s1; ) { arrayOfByte[b1] = paramByteBuffer.get(); b1++; }  gr0
/* 11 */           .mi = arrayOfByte; }  b++; }
/*    */      }
/*    */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/pf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */