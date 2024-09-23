package InterfaceNesting;

interface Vehicle {
    public int getnumberofwheels();

    /**
     * class inside interface is public and static by default.
     */
    public class GeneralVehicle implements Vehicle {
        @Override
        public int getnumberofwheels() {
            return 2;
        }
    }
}

class Bus implements Vehicle{

    @Override
    public int getnumberofwheels() {
        return 6;
    }
}

public class ClassinsideInterface {

    public static void main(String[] args){
        Vehicle.GeneralVehicle obj = new Vehicle.GeneralVehicle();
       System.out.println(obj.getnumberofwheels());

        Bus bobj=new Bus();
        System.out.println(bobj.getnumberofwheels());

    }

}