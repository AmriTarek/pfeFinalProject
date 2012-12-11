package edu.esprit.pfeProjectEJB.domain.management;

import edu.esprit.pfeProjectEJB.domain.management.interfaces.ManagementServicesLocal;
import edu.esprit.pfeProjectEJB.domain.management.interfaces.ManagementServicesRemote;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class ManagementServices
 */
@Stateless
public class ManagementServices implements ManagementServicesRemote, ManagementServicesLocal {

    /**
     * Default constructor. 
     */
    public ManagementServices() {
        // TODO Auto-generated constructor stub
    }

}
