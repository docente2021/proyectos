package mcuca.security;

import org.springframework.stereotype.Component;

import com.vaadin.spring.access.ViewAccessControl;
import com.vaadin.ui.UI;

@Component
public class SampleViewAccessControl implements ViewAccessControl {

    @Override
    public boolean isAccessGranted(UI ui, String beanName) {
    	
    	System.out.println("COMPROBANDO " + beanName + " PARA USUARIO CON ROLES: "+SecurityUtils.roles());

    	if(SecurityUtils.hasRole("ROLE_ADMIN")){
    		return true;
    	} else if (beanName.equals("clienteView")) {
            return true;
        } else if (beanName.equals("establecimientoView")) {
            return true;
        } else if (beanName.equals("userView")) {
            return SecurityUtils.hasRole("ROLE_USER") || SecurityUtils.hasRole("ROLE_MANAGER");
        } else if (beanName.equals("userManagementView")) {
            return SecurityUtils.hasRole("ROLE_MANAGER");
        } else {
        	return false;
        }
    }
}



