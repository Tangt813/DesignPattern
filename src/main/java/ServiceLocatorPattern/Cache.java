package ServiceLocatorPattern;

import java.util.ArrayList;
import java.util.List;

public class Cache {

    public List<ServiceDetails> services;

    public Cache(){
        services = new ArrayList<ServiceDetails>();
    }

    public ServiceDetails getService(String serviceName){
        for (ServiceDetails service : services) {
            if(service.getName().equalsIgnoreCase(serviceName)){
                return service;
            }
        }
        return null;
    }

    public void addService(ServiceDetails newService){
        boolean exists = false;
        for (ServiceDetails service : services) {
            if(service.getName().equalsIgnoreCase(newService.getName())){
                exists = true;
            }
        }
        if(!exists){
            services.add(newService);
        }
    }
}