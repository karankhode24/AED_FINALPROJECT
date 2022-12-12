/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.LabOrganization;
import Business.UserAccount.UserAccount;
import ui.LabRole.LabAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author karan
 */
public class LabRole extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new LabAreaJPanel(userProcessContainer, account, (LabOrganization)organization, enterprise, business);
    }

    

}