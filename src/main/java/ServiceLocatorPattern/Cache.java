package ServiceLocatorPattern;

import java.util.ArrayList;
import java.util.List;

public class Cache {
    //创建list列表，来存储所有的服务对象
    public List<ServiceDetails> services;

    //设置cache类，来专门存储所有的服务对象，也就是list
    public Cache(){
        services = new ArrayList<ServiceDetails>();
    }

    //返回特定的服务对象 根据关键词serviceName查找
    public ServiceDetails getService(String serviceName){
        for (ServiceDetails service : services) {
            if(service.getName().equalsIgnoreCase(serviceName)){
                return service;
            }
        }
        return null;
    }
    //添加服务对象
    public void addService(ServiceDetails newService){
        boolean exists = false;
        //防止重复添加，如果已经存在就不在添加了
        for (ServiceDetails service : services) {
            if(service.getName().equalsIgnoreCase(newService.getName())){
                exists = true;
            }
        }
        //如果没有再添加到cache中
        if(!exists){
            services.add(newService);
        }
    }
}