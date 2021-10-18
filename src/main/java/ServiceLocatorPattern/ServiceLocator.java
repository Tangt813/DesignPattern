package ServiceLocatorPattern;

public class ServiceLocator {
    private static Cache cache;
    public  static NullService nullService;
    static {
        cache = new Cache();
    }

    public static ServiceDetails getService(String jndiName){

        ServiceDetails service = cache.getService(jndiName);

        if(service != null){
            return service;
        }

        return null;
    }

    public static ServiceDetails modiServicePos(String jndiPos,String jndiName){

        ServiceDetails service = cache.getService(jndiName);

        if(service != null){
            service.setPositon(jndiPos);
            return service;
        }

        return null;
    }

    public static ServiceDetails modiServiceAct(boolean jndiAct,String jndiName){

        ServiceDetails service = cache.getService(jndiName);

        if(service != null){
            service.setActive(jndiAct);
            return service;
        }

        return null;
    }

    public static void addServiceDetail(boolean jndiAct, String jndiName, String jndiPos){
        ServiceDetails service = cache.getService(jndiName);

        if(service != null){
            return;
        }
        cache.addService(new ServiceDetails(jndiName,jndiPos,jndiAct));
    }

    public static void addService(ServiceDetails serviceDetails){
        ServiceDetails service = cache.getService(serviceDetails.getName());

        if(service != null){
            return;
        }
        cache.addService(serviceDetails);
    }
    public static void listDetails(){
        for (ServiceDetails service : cache.services) {
            service.printDetails();
        }
    }
}
