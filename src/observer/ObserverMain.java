package observer;

public class ObserverMain {
    public static void main(String[] args) {
        Subject subject = new Subject();
        AppleObserver appleObserver = new AppleObserver();
        IbmObserver ibmObserver = new IbmObserver();

        subject.registerObserver(appleObserver);
        subject.registerObserver(ibmObserver);

        System.out.println(ibmObserver.getLastPrice());
        System.out.println(appleObserver.getLastPrice());

        subject.setApplePrice(100);

        System.out.println(appleObserver.getLastPrice());

        subject.unregisterObserver(appleObserver);

        subject.setApplePrice(4000);

        System.out.println(appleObserver.getLastPrice());
    }
}
