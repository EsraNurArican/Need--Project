/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author esra
 */
public class NeedPostInformations {
    
    private String needTitle;
    private String needDefinition;
    private String needAddress;
    private int needNumber;

    public NeedPostInformations(String needTitle, String needDefinition, String needAddress, int needNumber) {
        this.needTitle = needTitle;
        this.needDefinition = needDefinition;
        this.needAddress = needAddress;
        this.needNumber = needNumber;
    }

    public NeedPostInformations() {
        needTitle = null;
        needDefinition=null;
        needAddress=null;
        needNumber=0;
    }

    

    public String getNeedTitle() {
        return needTitle;
    }

    public String getNeedDefinition() {
        return needDefinition;
    }

    public String getNeedAddress() {
        return needAddress;
    }

    public int getNeedNumber() {
        return needNumber;
    }

    public void setNeedTitle(String needTitle) {
        this.needTitle = needTitle;
    }

    public void setNeedDefinition(String needDefinition) {
        this.needDefinition = needDefinition;
    }

    public void setNeedAddress(String needAddress) {
        this.needAddress = needAddress;
    }

    public void setNeedNumber(int needNumber) {
        this.needNumber = needNumber;
    }

    @Override
    public String toString() {
        return "NeedPostInformations{" + "needTitle=" + needTitle + 
                ", needDefinition=" + needDefinition + 
                ", needAddress=" + needAddress + 
                ", needNumber=" + needNumber + '}';
    }
    
    
   
}
