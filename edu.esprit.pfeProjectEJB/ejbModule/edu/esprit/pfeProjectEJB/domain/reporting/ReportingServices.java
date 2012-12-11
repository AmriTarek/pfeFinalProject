package edu.esprit.pfeProjectEJB.domain.reporting;

import edu.esprit.pfeProjectEJB.domain.reporting.interfaces.ReportingServicesLocal;
import edu.esprit.pfeProjectEJB.domain.reporting.interfaces.ReportingServicesRemote;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class ReportingServices
 */
@Stateless
@LocalBean
public class ReportingServices implements ReportingServicesRemote, ReportingServicesLocal {

    /**
     * Default constructor. 
     */
    public ReportingServices() {
        // TODO Auto-generated constructor stub
    }

}
