void main(){
    Thread t1 = new Thread(() -> {

        while (true) {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("1");
        }
    });

    Thread t2 = new Thread(() -> {

        while (true) {

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("2");
        }
    });

    Thread t3 = new Thread(() -> {

        while (true) {

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("3");
        }
    });

    t1.start();
    t2.start();
    t3.start();
}
