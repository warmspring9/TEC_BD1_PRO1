package bd_pro_1;

import DA.DataHandler;
import java.sql.SQLException;
import java.util.ArrayList;

public class main {

    public static void main(String[] args) throws SQLException {
       
        //DataHandler.createProposal("Camaras cc", 2000, "Camaras en el parque", 117070816, 1);
        ArrayList<Integer> pr=DataHandler.getProposalProfile(117070816);
        for(int i=0; i<pr.size(); i++){
            System.out.println(pr.get(i));
          
        }
        //DataHandler.getProposalFeed(1);
    }
    
}