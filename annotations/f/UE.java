package f;

public final class UE extends Hn {
  public UE(Xb0 paramXb0, RD0 paramRD0) {
    // Byte code:
    //   0: aload_1
    //   1: aload_0
    //   2: aload_1
    //   3: invokespecial <init> : (Lf/Xb0;)V
    //   6: getfield jj0 : Z
    //   9: ifeq -> 13
    //   12: return
    //   13: aconst_null
    //   14: astore_1
    //   15: new f/K4
    //   18: dup
    //   19: astore_3
    //   20: aload_0
    //   21: aload_3
    //   22: dup
    //   23: dup
    //   24: dup2
    //   25: aload_2
    //   26: invokespecial <init> : (Lf/RD0;)V
    //   29: getfield fL : I
    //   32: invokestatic Vn : (Ljava/io/InputStream;I)[B
    //   35: astore_1
    //   36: getfield U40 : I
    //   39: istore #4
    //   41: getfield eN : I
    //   44: istore #5
    //   46: aload_1
    //   47: iload #4
    //   49: iload #5
    //   51: invokevirtual oK0 : ([BII)V
    //   54: invokestatic JC0 : (Ljava/io/Closeable;)V
    //   57: return
    //   58: astore_1
    //   59: goto -> 70
    //   62: goto -> 100
    //   65: astore_3
    //   66: aload_3
    //   67: aload_1
    //   68: astore_3
    //   69: astore_1
    //   70: new f/JU
    //   73: dup
    //   74: new java/lang/StringBuilder
    //   77: dup
    //   78: invokespecial <init> : ()V
    //   81: ldc 'Error reading WAV file: '
    //   83: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   86: aload_2
    //   87: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   90: invokevirtual toString : ()Ljava/lang/String;
    //   93: aload_1
    //   94: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   97: athrow
    //   98: aload_3
    //   99: astore_1
    //   100: aload_1
    //   101: invokestatic JC0 : (Ljava/io/Closeable;)V
    //   104: athrow
    // Exception table:
    //   from	to	target	type
    //   15	18	65	java/io/IOException
    //   15	18	62	finally
    //   20	29	65	java/io/IOException
    //   20	29	62	finally
    //   29	35	58	java/io/IOException
    //   29	35	98	finally
    //   36	39	58	java/io/IOException
    //   36	39	98	finally
    //   41	44	58	java/io/IOException
    //   41	44	98	finally
    //   46	54	58	java/io/IOException
    //   46	54	98	finally
    //   70	98	98	finally
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/UE.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */