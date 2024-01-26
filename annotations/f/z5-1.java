/*  1 */ package f;public interface z5 extends Serializable { static z5 qC0(InetAddress paramInetAddress) { String str; if (paramInetAddress instanceof java.net.Inet6Address) { byte[] arrayOfByte1; Eb0 eb0; if ((paramInetAddress = paramInetAddress).getScopeId() == 0 && paramInetAddress.getScopedInterface() == null) { (arrayOfByte1 = paramInetAddress.getAddress())
/*  2 */           .getClass(); if ((paramInetAddress.getAddress()).length == 16)
/*  3 */         { long l1 = iA.DK0(arrayOfByte1, 0), l2 = iA.DK0(arrayOfByte1, 8); this(l1, l2); }
/*  4 */         else { throw new IllegalArgumentException("The given array must be 16 bytes long"); }  } else { zC zC; if (arrayOfByte1
/*  5 */           .getScopedInterface() != null) { str = arrayOfByte1.getScopedInterface().getName(); byte[] arrayOfByte2; (arrayOfByte2 = arrayOfByte1.getAddress())
/*  6 */             .getClass(); if ((arrayOfByte1.getAddress()).length == 16)
/*  7 */           { long l1 = iA.DK0(arrayOfByte2, 0), l2 = iA.DK0(arrayOfByte2, 8); this(str, l1, l2); }
/*  8 */           else { throw new IllegalArgumentException("The given array must be 16 bytes long"); }  }
/*  9 */         else { str = Integer.toString(str.getScopeId()); byte[] arrayOfByte2; (arrayOfByte2 = str.getAddress())
/* 10 */             .getClass(); if ((str.getAddress()).length == 16)
/* 11 */           { long l1 = iA.DK0(arrayOfByte2, 0), l2 = iA.DK0(arrayOfByte2, 8); this(str, l1, l2); }
/* 12 */           else { throw new IllegalArgumentException("The given array must be 16 bytes long"); }  }  eb0 = zC; }
/*    */        return eb0; }
/* 14 */      byte[] arrayOfByte; if ((arrayOfByte = ((Inet4Address)str).getAddress()) != null) { int i; if (arrayOfByte.length == 
/* 15 */         4) { byte b1 = arrayOfByte[1], b2 = arrayOfByte[2], b3 = arrayOfByte[3]; i = b1 & 0xFF; int j = b2 & 0xFF, k = b3 & 0xFF; return new o80((arrayOfByte[0] & 0xFF) << 24 | i << 16 | j << 8 | k); }  Object[] arrayOfObject; (arrayOfObject = new Object[1])[0] = Integer.valueOf(i.length); throw new IllegalArgumentException(String.format("The array has to be 4 bytes long, the given array is %d bytes long", arrayOfObject)); }  throw new NullPointerException("The given array is null"); }
/*    */ 
/*    */   
/*    */   default o80 Ue0() {
/*    */     throw new UnsupportedOperationException();
/*    */   }
/*    */   
/*    */   default Eb0 BD() {
/*    */     throw new UnsupportedOperationException();
/*    */   }
/*    */   
/*    */   boolean gK();
/*    */   
/*    */   int hp();
/*    */   
/*    */   byte[] DH(); }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/z5.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */