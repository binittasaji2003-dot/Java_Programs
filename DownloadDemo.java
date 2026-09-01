class DownloadTask implements Runnable {

    private String fileName;

    public DownloadTask(String file) {
        this.fileName = file;
    }

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println(fileName + " - Downloading " + (i * 20) + "%");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(fileName + " download interrupted");
            }
        }

        System.out.println(fileName + " download completed!");
    }
}

public class DownloadDemo {

    public static void main(String[] args) {

        DownloadTask task1 = new DownloadTask("File-A");
        DownloadTask task2 = new DownloadTask("File-B");

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        thread1.start();
        thread2.start();

        System.out.println("Downloads started...");
    }
}