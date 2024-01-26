/*  1 */ package f;public final class LPT4 extends H3 { public static final ik dN = C00.gd(LPT4.class); public byte[] qc0; public ECPublicKey et0 = null; public final void sM() { byte[] arrayOfByte = ee0(Gc0()); try { this.et0 = v5.Kf(arrayOfByte); } catch (GeneralSecurityException generalSecurityException) { dN.error("", generalSecurityException); }  this.cg = ee0(Gc0()); this
/*  2 */       .vG0 = this.Ws.get(); } public byte[] cg; public byte vG0 = 4; public LPT4(int paramInt) { super(paramInt); } public final void Cx() { RuntimeException runtimeException; boolean bool; String str; if (this.et0 == null) { this(); dN.error("Failed to load public key.", this); ((PN)this.d).Sa(); return; }  byte[] arrayOfByte1 = ((LPT4)super).qc0, arrayOfByte2 = ((LPT4)super).cg;
/*    */ 
/*    */     
/*  5 */     PublicKey publicKey = ((PN)((yv)this).d).jB0;
/*    */     
/*  7 */     try { signature.initVerify(publicKey); signature.update(arrayOfByte1); Signature signature; bool = (signature = Signature.getInstance(str = "SHA256withECDSA")).verify(arrayOfByte2); } catch (Exception exception) { System.out.println("Exception verifying " + str + " signature."); null.printStackTrace(); bool = false; }  if (!bool)
/*  8 */     { this(); dN.error("Failed to verify signature.", this);
/*  9 */       ((PN)((yv)this).d)
/* 10 */         .Sa(); return; }  try { kz0 kz0; KeyPairGenerator.getInstance("EC").initialize(new ECGenParameterSpec("secp256r1")); KeyPair keyPair; PublicKey publicKey1 = (keyPair = KeyPairGenerator.getInstance("EC").generateKeyPair()).getPublic(); keyAgreement.init(keyPair.getPrivate()); keyAgreement.doPhase(((LPT4)super).et0, true); this(v5.ya((ECPublicKey)publicKey1));
/* 11 */       ((PN)((yv)this).d)
/* 12 */         .nb(kz0); KeyAgreement keyAgreement;
/* 13 */       byte[] arrayOfByte = (keyAgreement = KeyAgreement.getInstance("ECDH")).generateSecret();
/*    */ 
/*    */       
/* 16 */       ((PN)((yv)this).d).YS
/*    */         
/* 18 */         .vu0 = ((LPT4)super).vG0; PN pN;
/*    */       Sj0 sj0;
/* 20 */       (sj0 = (pN = (PN)((yv)this).d).YS)
/* 21 */         .getClass();
/* 22 */       if ((arrayOfByte.length * 8 >= 128)) { sj0
/*    */           
/* 24 */           .LL = Sj0.QL(arrayOfByte, Sj0.wa0);
/*    */         
/* 26 */         sj0.U7 = Sj0.QL(arrayOfByte, Sj0.cJ); sj0.WG0();
/* 27 */         this.xp = true; if (!this.bW) lpt5();  }
/* 28 */       else { throw new RuntimeException(); }  } catch (GeneralSecurityException generalSecurityException)
/* 29 */     { dN.error("", this); }
/*    */      }
/*    */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/LPT4.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */