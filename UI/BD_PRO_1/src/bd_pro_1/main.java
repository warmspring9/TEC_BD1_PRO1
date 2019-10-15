package bd_pro_1;

import DA.DataHandler;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

public class main {

    public static void main(String[] args) throws SQLException {
       
        //DataHandler.createProposal("Camaras cc", 2000, "Camaras en el parque", 117070816, 1);
        Map<String, Integer> pr;
        pr = DataHandler.statsPropCommu(4);
        pr.forEach((k,v) -> System.out.println("Key: " + k + ": Value: " + v));
        //for(int i=0; i<pr.size(); i++){
            //System.out.println(pr.get(i));
          
        //}
        //DataHandler.getProposalFeed(1);
    }
    
}