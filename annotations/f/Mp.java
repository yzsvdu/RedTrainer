/*  1 */
package f;

public final class Mp implements Runnable {
    public final void run() {
        while (true) {
            if (!((ALC10.alcGetInteger(this.G40.Jx, 787) != 0) ? 1 : 0)) {
                this.G40.Yr0(null, false);
                continue;
            }
            /*  2 */
            Xb0 xb0;
            if ((xb0 = this.G40)
                    /*  3 */.SO != null)
                /*  4 */ {
                if (Arrays.<String>asList(xb0.Mv())
/*    */
/*  6 */.contains(this.G40.SO))
                    /*    */
                    /*  8 */ {
                    if (!(xb0 = this.G40).SO.equals(ALC10.alcGetString(xb0.Jx, 4115))) this.G40
/*    */
/* 10 */.Yr0(this.G40.SO, true);
                }
                /* 11 */
                else if ((xb0 = this.G40)
/* 12 */.SO
/* 13 */.equals(ALC10.alcGetString(xb0.Jx, 4115))) {
                    this.G40
/* 14 */.Yr0(null, false);
                }
            }
            /* 15 */
            else {
                String[] arrayOfString = xb0.Mv();
                (new ArrayList(Arrays.asList((Object[]) arrayOfString))).removeAll(Arrays.asList((Object[]) this.Uz));
                if ((new ArrayList(Arrays.asList((Object[]) arrayOfString))).size() != 0) this.G40
/* 16 */.Yr0(null, true);
                this
                        /* 17 */.Uz = arrayOfString;
            }
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException interruptedException)
                /*    */ {
                break;
            }
            /*    */
        }
        /*    */
    }

    /*    */
    /*    */
    /*    */   public String[] Uz = new String[0];

    /*    */
    /*    */
    public Mp(Xb0 paramXb0) {
    }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Mp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */