/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author hrishipal
 */
// Extending Organization from ECosystem
public class EcoSystem extends Organization{
    
       
    private static EcoSystem ecosystem;
    private ArrayList<Network> networks;
    public static EcoSystem getInstance(){
        if(ecosystem==null){
            ecosystem=new EcoSystem();
        }
        return ecosystem;
    }
    
    public Network createAndAddNetwork(){
        Network network=new Network();
        networks.add(network);
        return network;
    }
    //Overriding Support role
    //Created ArrayList of Role
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private EcoSystem(){
        super(null);
        networks=new ArrayList<Network>();
    }
    //ArrayList of <Network> calling function getNetwork() 
    public ArrayList<Network> getNetworks() {
        return networks;
    }
    //ArrayList of <Network> calling function setNetwork()
    public void setNetworks(ArrayList<Network> networks) {
        this.networks = networks;
    }
    
    //Defining boolean function for Unique User
    public boolean IsUserUnique(String userName){
        if(!this.getUserAccountDirectory().isUserUnique(userName)){
            return false;
        }
        for(Network network:networks){
            
        }
        return true;
    }
    
}
