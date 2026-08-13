class Device{
    public final void powerOn(){
        System.out.println("Device power on");
    }

}
class phones1 extends Device{
    public void call(String number){
        System.out.println(number + " is calling");
    }
    public void installApp(String app){
        System.out.println(app + " is installed");
    }

}
class smartphone extends phones1{
    @Override
    public void installApp(String app){
        System.out.println(app + " is installed");
    }

}

public class DeviceHierarchi {
    public static void main(String[] args){
        smartphone sp = new smartphone();
        sp.powerOn();
        sp.installApp("Hotstar");

    }
}

