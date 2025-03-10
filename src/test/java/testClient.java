
import org.guanzon.appdriver.base.GRider;
import org.guanzon.appdriver.base.LogWrapper;
import org.guanzon.appdriver.base.MiscUtil;
import org.guanzon.appdriver.constant.ClientType;
import org.guanzon.appdriver.constant.MobileNetwork;
import org.guanzon.appdriver.constant.SocMedAccountType;
import org.guanzon.cas.client.Client;
import org.json.simple.JSONObject;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class testClient {

    static GRider instance;
    static Client record;
    static LogWrapper logWrapper;

    @BeforeClass
    public static void setUpClass() {
        System.setProperty("sys.default.path.temp", "D:/GGC_Maven_Systems/temp/");
        System.setProperty("sys.default.path.metadata", "D:/GGC_Maven_Systems/config/metadata/new/");

        instance = MiscUtil.Connect();
        logWrapper = new LogWrapper("CAS", System.getProperty("sys.default.path.temp") + "cas-error.log");

        record = new Client(instance, "", null);
    }

//    @Test
//    public void testValidator() {
//        JSONObject loJSON;
//        record.New();
//        System.out.println(record.Master().getModel().getLTOClientId());
//    }
//       @Test
//    public void testNewRecord1() {
//          JSONObject loJSON;
//          record.New();
//        
//           loJSON = record.addMobile();
//           if ("error".equals((String) loJSON.get("result"))) {
//               Assert.fail((String) loJSON.get("message"));
//           }
//           
//           
//        
//          //master
////        loJSON = record.Master().getModel().setClientType(ClientType.INDIVIDUAL);
////        if ("error".equals((String) loJSON.get("result"))) {
////            Assert.fail((String) loJSON.get("message"));
////        } 
////           System.out.println(record.Master().getModel().getClientId());
//        
//    }
    
//        @Test
//    public void testOpenRecords() {
//        JSONObject loJSON;
//        System.out.println("this is a test");
//        loJSON = record.Master().openRecord("M00125000002");
//        if ("error".equals((String) loJSON.get("result"))){
//            Assert.fail((String) loJSON.get("message"));
//        } 
//        record.OpenClientAddress("M00125000002");
//        record.OpenClientMobile("M00125000002");
//        record.OpenClientMail("M00125000002");
//        record.OpenClientSocialMedia("M00125000002");
//        
//        
//        System.out.println("the test test");
//        System.out.println(record.Address(0).getModel().getClientId());
//        
//        System.out.println(String.valueOf(record.getAddressCount()));
//        System.out.println(String.valueOf(record.getMobileCount()));
//        System.out.println(String.valueOf(record.getMailCount()));
//        System.out.println(String.valueOf(record.getSocMedCount()));
//   
//    }
//    
    
//    @Test
//    public void testNewRecord() {
//        JSONObject loJSON;
//        System.out.println("this is a test");
//        loJSON = record.Master().openRecord("M00125000002");
//        if ("error".equals((String) loJSON.get("result"))){
//            Assert.fail((String) loJSON.get("message"));
//        } 
//
//        loJSON = record.New();
//        if ("error".equals((String) loJSON.get("result"))) {
//            Assert.fail((String) loJSON.get("message"));
//        }              
//                loJSON = record.Master().getModel().setCompanyName("Michael, Cuison Corporation");
//        if ("error".equals((String) loJSON.get("result"))) {
//            Assert.fail((String) loJSON.get("message"));
//        }    
//        //master
//        loJSON = record.Master().getModel().setClientType(ClientType.INDIVIDUAL);
//        if ("error".equals((String) loJSON.get("result"))) {
//            Assert.fail((String) loJSON.get("message"));
//        }              
//        
//        loJSON = record.Master().getModel().setLastName("Cuison");
//        if ("error".equals((String) loJSON.get("result"))) {
//            Assert.fail((String) loJSON.get("message"));
//        }              
//        
//        loJSON = record.Master().getModel().setMiddleName("Torres");
//        if ("error".equals((String) loJSON.get("result"))) {
//            Assert.fail((String) loJSON.get("message"));
//        }              
//        
//        loJSON = record.Master().getModel().setFirstName("Michael");
//        if ("error".equals((String) loJSON.get("result"))) {
//            Assert.fail((String) loJSON.get("message"));
//        }   
//        
//        //mobile
//        loJSON = record.Mobile(0).getModel().setMobileNo("09260375777");
//        if ("error".equals((String) loJSON.get("result"))) {
//            Assert.fail((String) loJSON.get("message"));
//        }
//        
//        loJSON = record.Mobile(0).getModel().isPrimaryMobile(true);
//        if ("error".equals((String) loJSON.get("result"))) {
//            Assert.fail((String) loJSON.get("message"));
//        }
//        
//        loJSON = record.Mobile(0).getModel().setMobileNetwork(MobileNetwork.GLOBE);
//        if ("error".equals((String) loJSON.get("result"))) {
//            Assert.fail((String) loJSON.get("message"));
//        }
//        
//        loJSON = record.Mobile(0).getModel().isPrimaryMobile(true);
//        if ("error".equals((String) loJSON.get("result"))) {
//            Assert.fail((String) loJSON.get("message"));
//        }
//        
//        loJSON = record.addMobile();
//        if ("error".equals((String) loJSON.get("result"))) {
//            Assert.fail((String) loJSON.get("message"));
//        }   
//        
//        loJSON = record.Mobile(1).getModel().setMobileNo("09176340516");
//        if ("error".equals((String) loJSON.get("result"))) {
//            Assert.fail((String) loJSON.get("message"));
//        }   
//        
//        loJSON = record.Mobile(1).getModel().setMobileNetwork(MobileNetwork.GLOBE);
//        if ("error".equals((String) loJSON.get("result"))) {
//            Assert.fail((String) loJSON.get("message"));
//        }
//        
//        loJSON = record.addMobile();
//        if ("error".equals((String) loJSON.get("result"))) {
//            Assert.fail((String) loJSON.get("message"));
//        }   
//        
//        //address
//        loJSON = record.Address(0).getModel().setHouseNo("027");
//        if ("error".equals((String) loJSON.get("result"))) {
//            Assert.fail((String) loJSON.get("message"));
//        }
//        
//        loJSON = record.Address(0).getModel().setAddress("Purok Centro");
//        if ("error".equals((String) loJSON.get("result"))) {
//            Assert.fail((String) loJSON.get("message"));
//        }
//        
//        loJSON = record.Address(0).getModel().setBarangayId("1100134");
//        if ("error".equals((String) loJSON.get("result"))) {
//            Assert.fail((String) loJSON.get("message"));
//        }
//        
//        loJSON = record.Address(0).getModel().setTownId("0314");
//        if ("error".equals((String) loJSON.get("result"))) {
//            Assert.fail((String) loJSON.get("message"));
//        }
//        
//        loJSON = record.Address(0).getModel().isPrimaryAddress(true);
//        if ("error".equals((String) loJSON.get("result"))) {
//            Assert.fail((String) loJSON.get("message"));
//        }
//        
//        loJSON = record.Address(0).getModel().setLatitude("1");
//        if ("error".equals((String) loJSON.get("result"))) {
//            Assert.fail((String) loJSON.get("message"));
//        }
//
//        
//        
//        //email
//        loJSON = record.Mail(0).getModel().setMailAddress("michael_cuison07@yahoo.com");
//        if ("error".equals((String) loJSON.get("result"))) {
//            Assert.fail((String) loJSON.get("message"));
//        }
//        
//        loJSON = record.Mail(0).getModel().isPrimaryEmail(true);
//        if ("error".equals((String) loJSON.get("result"))) {
//            Assert.fail((String) loJSON.get("message"));
//        }
//        
//        loJSON = record.Mail(0).getModel().isPrimaryEmail(true);
//        if ("error".equals((String) loJSON.get("result"))) {
//            Assert.fail((String) loJSON.get("message"));
//        }
//        
//        loJSON = record.addMail();
//        if ("error".equals((String) loJSON.get("result"))) {
//            Assert.fail((String) loJSON.get("message"));
//        }   
//        
//        loJSON = record.Mail(1).getModel().setMailAddress("xurpas7@gmail.com");
//        if ("error".equals((String) loJSON.get("result"))) {
//            Assert.fail((String) loJSON.get("message"));
//        }   
//        
//        loJSON = record.addMail();
//        if ("error".equals((String) loJSON.get("result"))) {
//            Assert.fail((String) loJSON.get("message"));
//        }   
//        
//        //social media
//        loJSON = record.SocialMedia(0).getModel().setAccount("michael_cuison07@yahoo.com");
//        if ("error".equals((String) loJSON.get("result"))) {
//            Assert.fail((String) loJSON.get("message"));
//        }
//        
//        loJSON = record.SocialMedia(0).getModel().setSocMedType(SocMedAccountType.FACEBOOK);
//        if ("error".equals((String) loJSON.get("result"))) {
//            Assert.fail((String) loJSON.get("message"));
//        }
//        
//        loJSON = record.addSocialMedia();
//        if ("error".equals((String) loJSON.get("result"))) {
//            Assert.fail((String) loJSON.get("message"));
//        }   
//        
//        loJSON = record.SocialMedia(1).getModel().setAccount("xurpas7@gmail.com");
//        if ("error".equals((String) loJSON.get("result"))) {
//            Assert.fail((String) loJSON.get("message"));
//        }   
//        
//        loJSON = record.SocialMedia(1).getModel().setSocMedType(SocMedAccountType.X);
//        if ("error".equals((String) loJSON.get("result"))) {
//            Assert.fail((String) loJSON.get("message"));
//        }
//        
//        loJSON = record.addSocialMedia();
//        if ("error".equals((String) loJSON.get("result"))) {
//            Assert.fail((String) loJSON.get("message"));
//        }   
//        
//        loJSON = record.Save();
//        if ("error".equals((String) loJSON.get("result"))) {
//            Assert.fail((String) loJSON.get("message"));
//        }  
//    }
    
    
    
    
//        @Test
//    public void testNewRecord() {
//        JSONObject loJSON;
//       loJSON =  record.Master().searchCitizenship("", true);
//          if ("error".equals((String) loJSON.get("result"))) {
//           Assert.fail((String) loJSON.get("message"));
//       }       
//    }
//    
//    @Test
//    public void testNewRecordIns() {
//        JSONObject loJSON;
//
//        loJSON = record.New();
//        if ("error".equals((String) loJSON.get("result"))) {
//            Assert.fail((String) loJSON.get("message"));
//        }              
//        
//        
//        //master
//        loJSON = record.Master().getModel().setClientType(ClientType.INSTITUTION);
//        if ("error".equals((String) loJSON.get("result"))) {
//            Assert.fail((String) loJSON.get("message"));
//        }              
//        
//        loJSON = record.Master().getModel().setCompanyName("Michael Cuison Corporation");
//        if ("error".equals((String) loJSON.get("result"))) {
//            Assert.fail((String) loJSON.get("message"));
//        }              
//        
//        //mobile
//        loJSON = record.Mobile(0).getModel().setMobileNo("09260375777");
//        if ("error".equals((String) loJSON.get("result"))) {
//            Assert.fail((String) loJSON.get("message"));
//        }
//        
//        loJSON = record.Mobile(0).getModel().isPrimaryMobile(true);
//        if ("error".equals((String) loJSON.get("result"))) {
//            Assert.fail((String) loJSON.get("message"));
//        }
//        
//        loJSON = record.Mobile(0).getModel().setMobileNetwork(MobileNetwork.GLOBE);
//        if ("error".equals((String) loJSON.get("result"))) {
//            Assert.fail((String) loJSON.get("message"));
//        }
//        
//        loJSON = record.Mobile(0).getModel().isPrimaryMobile(true);
//        if ("error".equals((String) loJSON.get("result"))) {
//            Assert.fail((String) loJSON.get("message"));
//        }
//        
//        loJSON = record.addMobile();
//        if ("error".equals((String) loJSON.get("result"))) {
//            Assert.fail((String) loJSON.get("message"));
//        }   
//        
//        loJSON = record.Mobile(1).getModel().setMobileNo("09176340516");
//        if ("error".equals((String) loJSON.get("result"))) {
//            Assert.fail((String) loJSON.get("message"));
//        }   
//        
//        loJSON = record.Mobile(1).getModel().setMobileNetwork(MobileNetwork.GLOBE);
//        if ("error".equals((String) loJSON.get("result"))) {
//            Assert.fail((String) loJSON.get("message"));
//        }
//        
//        loJSON = record.addMobile();
//        if ("error".equals((String) loJSON.get("result"))) {
//            Assert.fail((String) loJSON.get("message"));
//        }   
//        
//        //address
//        loJSON = record.Address(0).getModel().setHouseNo("027");
//        if ("error".equals((String) loJSON.get("result"))) {
//            Assert.fail((String) loJSON.get("message"));
//        }
//        
//        loJSON = record.Address(0).getModel().setAddress("Purok Centro");
//        if ("error".equals((String) loJSON.get("result"))) {
//            Assert.fail((String) loJSON.get("message"));
//        }
//        
//        loJSON = record.Address(0).getModel().setBarangayId("1100134");
//        if ("error".equals((String) loJSON.get("result"))) {
//            Assert.fail((String) loJSON.get("message"));
//        }
//        
//        loJSON = record.Address(0).getModel().setTownId("0314");
//        if ("error".equals((String) loJSON.get("result"))) {
//            Assert.fail((String) loJSON.get("message"));
//        }
//        
//        loJSON = record.Address(0).getModel().isPrimaryAddress(true);
//        if ("error".equals((String) loJSON.get("result"))) {
//            Assert.fail((String) loJSON.get("message"));
//        }
//        
//        //email
//        loJSON = record.Mail(0).getModel().setMailAddress("michael_cuison07@yahoo.com");
//        if ("error".equals((String) loJSON.get("result"))) {
//            Assert.fail((String) loJSON.get("message"));
//        }
//        
//        loJSON = record.Mail(0).getModel().isPrimaryEmail(true);
//        if ("error".equals((String) loJSON.get("result"))) {
//            Assert.fail((String) loJSON.get("message"));
//        }
//        
//        loJSON = record.Mail(0).getModel().isPrimaryEmail(true);
//        if ("error".equals((String) loJSON.get("result"))) {
//            Assert.fail((String) loJSON.get("message"));
//        }
//        
//        loJSON = record.addMail();
//        if ("error".equals((String) loJSON.get("result"))) {
//            Assert.fail((String) loJSON.get("message"));
//        }   
//        
//        loJSON = record.Mail(1).getModel().setMailAddress("xurpas7@gmail.com");
//        if ("error".equals((String) loJSON.get("result"))) {
//            Assert.fail((String) loJSON.get("message"));
//        }   
//        
//        loJSON = record.addMail();
//        if ("error".equals((String) loJSON.get("result"))) {
//            Assert.fail((String) loJSON.get("message"));
//        }   
//        
//        //social media
//        loJSON = record.SocialMedia(0).getModel().setAccount("michael_cuison07@yahoo.com");
//        if ("error".equals((String) loJSON.get("result"))) {
//            Assert.fail((String) loJSON.get("message"));
//        }
//        
//        loJSON = record.SocialMedia(0).getModel().setSocMedType(SocMedAccountType.FACEBOOK);
//        if ("error".equals((String) loJSON.get("result"))) {
//            Assert.fail((String) loJSON.get("message"));
//        }
//        
//        loJSON = record.addSocialMedia();
//        if ("error".equals((String) loJSON.get("result"))) {
//            Assert.fail((String) loJSON.get("message"));
//        }   
//        
//        loJSON = record.SocialMedia(1).getModel().setAccount("xurpas7@gmail.com");
//        if ("error".equals((String) loJSON.get("result"))) {
//            Assert.fail((String) loJSON.get("message"));
//        }   
//        
//        loJSON = record.SocialMedia(1).getModel().setSocMedType(SocMedAccountType.X);
//        if ("error".equals((String) loJSON.get("result"))) {
//            Assert.fail((String) loJSON.get("message"));
//        }
//        
//        loJSON = record.addSocialMedia();
//        if ("error".equals((String) loJSON.get("result"))) {
//            Assert.fail((String) loJSON.get("message"));
//        }   
//        
//        
//        
//        
//        //institution contact person
//        loJSON = record.InstitutionContactPerson(0).getModel().setContactPersonName("Michael Cuison");
//        if ("error".equals((String) loJSON.get("result"))) {
//            Assert.fail((String) loJSON.get("message"));
//        }
//        
//        loJSON = record.InstitutionContactPerson(0).getModel().setContactPersonPosition("CEO");
//        if ("error".equals((String) loJSON.get("result"))) {
//            Assert.fail((String) loJSON.get("message"));
//        }
//        
//        loJSON = record.InstitutionContactPerson(0).getModel().setMobileNo("09176340516");
//        if ("error".equals((String) loJSON.get("result"))) {
//            Assert.fail((String) loJSON.get("message"));
//        }
//        
//        loJSON = record.InstitutionContactPerson(0).getModel().setMailAddress("michael_cuison07@yahoo.com");
//        if ("error".equals((String) loJSON.get("result"))) {
//            Assert.fail((String) loJSON.get("message"));
//        }
//        
//        loJSON = record.Save();
//        if ("error".equals((String) loJSON.get("result"))) {
//            Assert.fail((String) loJSON.get("message"));
//        }  
//    }  

    @AfterClass
    public static void tearDownClass() {
        record = null;
        instance = null;
    }
}
