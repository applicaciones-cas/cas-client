package org.guanzon.cas.client.model;

import java.sql.SQLException;
import java.util.Date;
import org.guanzon.appdriver.agent.services.Model;
import org.guanzon.appdriver.base.MiscUtil;
import org.guanzon.appdriver.constant.EditMode;
import org.guanzon.appdriver.constant.Logical;
import org.guanzon.appdriver.constant.RecordStatus;
import org.guanzon.cas.parameter.model.Model_Barangay;
import org.guanzon.cas.parameter.model.Model_TownCity;
import org.json.simple.JSONObject;

public class Model_Client_Address extends Model{
    Model_TownCity poTownCity;
    Model_Client_Master poClient;
    Model_Barangay poBarangay;
    
    @Override
    public void initialize() {
        try {
            poEntity = MiscUtil.xml2ResultSet(System.getProperty("sys.default.path.metadata") + XML, getTable());
            
            poEntity.last();
            poEntity.moveToInsertRow();

            MiscUtil.initRowSet(poEntity);
            
            //assign default values
            poEntity.updateString("cPrimaryx", Logical.NO);
            poEntity.updateString("cOfficexx", Logical.NO);
            poEntity.updateString("cProvince", Logical.NO);
            poEntity.updateString("cBillingx", Logical.NO);
            poEntity.updateString("cShipping", Logical.NO);
            poEntity.updateString("cCurrentx", Logical.NO);
            poEntity.updateString("cLTMSAddx", Logical.NO);
            poEntity.updateString("cRecdStat", RecordStatus.ACTIVE);
            //end - assign default values

            poEntity.insertRow();
            poEntity.moveToCurrentRow();

            poEntity.absolute(1);

            ID = poEntity.getMetaData().getColumnLabel(1);
            
            //initialize other connections
            poTownCity = new Model_TownCity();
            poTownCity.setApplicationDriver(poGRider);
            poTownCity.setXML("Model_TownCity");
            poTownCity.setTableName("TownCity");
            poTownCity.initialize();
            
            poClient = new Model_Client_Master();
            poClient.setApplicationDriver(poGRider);
            poClient.setXML("Model_Client_Master");
            poClient.setTableName("Client_Master");
            poClient.initialize();
            
            poBarangay = new Model_Barangay();
            poBarangay.setApplicationDriver(poGRider);
            poBarangay.setXML("Model_Barangay");
            poBarangay.setTableName("Barangay");
            poBarangay.initialize();
            //end - initialize other connections
            
            pnEditMode = EditMode.UNKNOWN;
        } catch (SQLException e) {
            logwrapr.severe(e.getMessage());
            System.exit(1);
        }
    }
    
    public JSONObject setAddressId(String addressId){
        return setValue("sAddrssID", addressId);
    }

    public String getAddressId(){
        return (String) getValue("sAddrssID");
    }
    
    public JSONObject setClientId(String clientId){
        return setValue("sClientID", clientId);
    }
    
    public String getClientName(){
        if (!"".equals((String) getValue("sClientID"))){
            if (poClient.getEditMode() == EditMode.READY &&
                poClient.getClientId().equals((String) getValue("sClientID")))
                return poClient.getCompanyName();
            else{
                poJSON = poClient.openRecord((String) getValue("sClientID"));

                if ("success".equals((String) poJSON.get("result")))
                    return poClient.getCompanyName();
                else return "";
            }
        } else return "";
    }

    public String getClientId(){
        return (String) getValue("sClientID");
    }
    
    public JSONObject setHouseNo(String houseNo){
        return setValue("sHouseNox", houseNo);
    }

    public String getHouseNo(){
        return (String) getValue("sHouseNox");
    }
    
    public JSONObject setAddress(String address){
        return setValue("sAddressx", address);
    }

    public String getAddress(){
        return (String) getValue("sAddressx");
    }
    
    public JSONObject setBarangayId(String barangayId){
        return setValue("sBrgyIDxx", barangayId);
    }

    public String getBarangayId(){
        return (String) getValue("sBrgyIDxx");
    }
    
    public String getBarangayName(){
        if (!"".equals((String) getValue("sBrgyIDxx"))){
            if (poBarangay.getEditMode() == EditMode.READY &&
                poBarangay.getBarangayId().equals((String) getValue("sBrgyIDxx")))
                return poBarangay.getBarangayName();
            else{
                poJSON = poBarangay.openRecord((String) getValue("sBrgyIDxx"));

                if ("success".equals((String) poJSON.get("result")))
                    return poBarangay.getTownName();
                else return "";
            }
        } else return "";
    }
    
    public JSONObject setTownId(String townId){
        return setValue("sTownIDxx", townId);
    }    
    
    public String getTownId(){
        return (String) getValue("sTownIDxx");
    }
    
    public String getTownName(){
        if (!"".equals((String) getValue("sTownIDxx"))){
            if (poTownCity.getEditMode() == EditMode.READY &&
                poTownCity.getTownId().equals((String) getValue("sTownIDxx")))
                return poTownCity.getTownName();
            else{
                poJSON = poTownCity.openRecord((String) getValue("sTownIDxx"));

                if ("success".equals((String) poJSON.get("result")))
                    return poTownCity.getTownName();
                else return "";
            }
        } else return "";
    }
    
    public String getProvinceId(){
        if (!"".equals((String) getValue("sTownIDxx"))){
            if (poTownCity.getEditMode() == EditMode.READY &&
                poTownCity.getTownId().equals((String) getValue("sTownIDxx")))
                return poTownCity.getProvinceId();
            else{
                poJSON = poTownCity.openRecord((String) getValue("sTownIDxx"));

                if ("success".equals((String) poJSON.get("result")))
                    return poTownCity.getProvinceId();
                else return "";
            }
        } else return "";
    }
    
    public String getProvinceName(){
        if (!"".equals((String) getValue("sTownIDxx"))){
            if (poTownCity.getEditMode() == EditMode.READY &&
                poTownCity.getTownId().equals((String) getValue("sTownIDxx")))
                return poTownCity.getProvinceName();
            else{
                poJSON = poTownCity.openRecord((String) getValue("sTownIDxx"));

                if ("success".equals((String) poJSON.get("result")))
                    return poTownCity.getProvinceName();
                else return "";
            }
        } else return "";
    }
    
    public JSONObject setLatitude(String latitude){
        return setValue("nLatitude", latitude);
    }
    
    public double getLatitude(){
        return (double) getValue("nLatitude");
    }
    
    public JSONObject setLongitude(String longitude){
        return setValue("nLongitud", longitude);
    }
    
    public double getLongitude(){
        return (double) getValue("nLongitud");
    }
    
    public JSONObject isPrimaryMobile(boolean isPrimaryMobile){
        return setValue("cPrimaryx", isPrimaryMobile ? "1" : "0");
    }

    public boolean isPrimaryMobile(){
        return ((String) getValue("cPrimaryx")).equals("1");
    }
    
    public JSONObject isOfficeAddress(boolean isOfficeAddress){
        return setValue("cOfficexx", isOfficeAddress ? "1" : "0");
    }

    public boolean isOfficeAddress(){
        return ((String) getValue("cOfficexx")).equals("1");
    }
    
    public JSONObject isProvinceAddress(boolean isProvinceAddress){
        return setValue("cProvince", isProvinceAddress ? "1" : "0");
    }

    public boolean isProvinceAddress(){
        return ((String) getValue("cProvince")).equals("1");
    }
    
    public JSONObject isBillingAddress(boolean isBillingAddress){
        return setValue("cBillingx", isBillingAddress ? "1" : "0");
    }

    public boolean isBillingAddress(){
        return ((String) getValue("cBillingx")).equals("1");
    }
    
    public JSONObject isShippingAddress(boolean isShippingAddress){
        return setValue("cShipping", isShippingAddress ? "1" : "0");
    }

    public boolean isShippingAddress(){
        return ((String) getValue("cShipping")).equals("1");
    }
    
    public JSONObject isCurrentAddress(boolean isCurrentAddress){
        return setValue("cCurrentx", isCurrentAddress ? "1" : "0");
    }

    public boolean isCurrentAddress(){
        return ((String) getValue("cCurrentx")).equals("1");
    }
    
    public JSONObject isLTMSAddress(boolean isLTMSAddress){
        return setValue("cLTMSAddx", isLTMSAddress ? "1" : "0");
    }

    public boolean isLTMSAddress(){
        return ((String) getValue("cLTMSAddx")).equals("1");
    }
    
    public JSONObject setSourceCode(String sourceCode){
        return setValue("sSourceCd", sourceCode);
    }

    public String getSourceCode(){
        return (String) getValue("sSourceCd");
    }
    
    public JSONObject setSourceNo(String sourceNo){
        return setValue("sReferNox", sourceNo);
    }

    public String getSourceNo(){
        return (String) getValue("sReferNox");
    }
    
    public JSONObject setRecordStatus(String recordStatus){
        return setValue("cRecdStat", recordStatus);
    }
    
    public String getRecordStatus(){
        return (String) getValue("cRecdStat");
    }
       
    public JSONObject setModifiedDate(Date modifiedDate){
        return setValue("dModified", modifiedDate);
    }
    
    public Date getModifiedDate(){
        return (Date) getValue("dModified");
    }
}