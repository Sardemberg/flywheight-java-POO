package agencies;

import airplanes.Airplane;
import airplanes.ProxyAirplane;

import java.util.HashMap;
import java.util.Map;

public class AgencyFactory {
    Airplane airplane = new ProxyAirplane();
    Map<String, Agency> hash_agency = new HashMap<>();

    String[] agencies = {"Gol", "CVC", "RIP"};

    public AgencyFactory(){
        this.hash_agency.put("Gol", new Gol(airplane));
        this.hash_agency.put("CVC", new CVC(airplane));
        this.hash_agency.put("RIP", new RIP(airplane));
    }

    public Agency getAgency(String agency_name){
        Agency agency = this.hash_agency.get(agency_name);

        return agency;
    }

    public String[] getAgencies(){
        return agencies;
    }
}
