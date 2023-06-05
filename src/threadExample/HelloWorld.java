package threadExample;

public class HelloWorld {
    public static void main(String[] args) {
        StringDisplay sd = new StringDisplay();
        MyThread [] nts = new MyThread[5];
        for(int i =0; i<nts.length; i++) {
            nts[i] = new MyThread(sd, Integer.toString(i));
            nts[i].start();
        }
    }
}

class StringDisplay {
    synchronized void display(String s) {
        for (int i=0; i<5; i++) {
            System.out.print(s);
        }
        System.out.println("");
    }

}

class MyThread extends Thread {
    StringDisplay sd;
    String s = "";

    public MyThread(StringDisplay sd, String s) {
        this.sd = sd;
        this.s = s;
    }

    @Override
    public void run() {
        sd.display(s);
    }
}