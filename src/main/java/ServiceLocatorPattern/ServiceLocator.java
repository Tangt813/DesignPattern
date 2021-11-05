package ServiceLocatorPattern;

public class ServiceLocator {

    private static Cache cache;
    public  static NullService nullService;
    //创建cache对象，便于调用
    static {
        cache = new Cache();
    }
    //根据关键词查找，直接调用cache中的查找函数，得到具体的对象
    public static ServiceDetails getService(String jndiName){

        ServiceDetails service = cache.getService(jndiName);
        //系统安全性考量，设置空对象处理
        if(service != null){
            return service;
        }

        return null;
    }
    //修改服务对象位置信息，先得到该对象，再对该对象进行处理以及修改
    public static ServiceDetails modiServicePos(String jndiPos,String jndiName){

        ServiceDetails service = cache.getService(jndiName);

        if(service != null){
            service.setPositon(jndiPos);
            System.out.println(jndiName+"前往了------>"+jndiPos);
            return service;
        }

        return null;
    }
    //修改服务对象状态信息，先得到该对象，再对该对象进行处理以及修改
    public static ServiceDetails modiServiceAct(boolean jndiAct,String jndiName){

        ServiceDetails service = cache.getService(jndiName);

        if(service != null){
            service.setActive(jndiAct);
            if(jndiAct==true){
                System.out.println(jndiName+"顺便吃了个饭");
            }
            else if(jndiAct==false){

            }
            return service;
        }

        return null;
    }
    //调用cache函数，在cache中添加对象，添加名称，位置，状态相关信息
    public static void addServiceDetail(boolean jndiAct, String jndiName, String jndiPos){
        ServiceDetails service = cache.getService(jndiName);

        if(service != null){
            return;
        }
        cache.addService(new ServiceDetails(jndiName,jndiPos,jndiAct));
    }
    //调用cache函数，在cache中添加对象，添加名称，位置，状态相关信息
    public static void addService(ServiceDetails serviceDetails){
        ServiceDetails service = cache.getService(serviceDetails.getName());

        if(service != null){
            return;
        }
        cache.addService(serviceDetails);
    }
    //调用cache函数，得到该对象的详细信息
    public static void listDetails(){
        for (ServiceDetails service : cache.services) {
            service.printDetails();
        }
    }
}
