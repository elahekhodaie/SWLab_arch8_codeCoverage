package usermanagement.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;
import usermanagement.entity.Person;


public class TransformServiceTest { 
private TransformService testClass = new TransformService();



    @Test
    public void test_toUserEntity() {
        User usr = new User();
        usr.setFirstName("fName");
        usr.setLastName("lName");
        usr.setCompanyName("companyName");
        usr.setUserId(1);
        Person testPer1 = testClass.toUserEntity(usr);

        Person testPer2 = new Person();
        testPer2.setfName(usr.getFirstName());
        testPer2.setlName(usr.getLastName());
        testPer2.setPersonId(usr.getUserId());
        testPer2.setCompanyName(usr.getCompanyName());
        assertEquals(testPer1.getfName(), testPer2.getfName());
        assertEquals(testPer1.getlName(), testPer2.getlName());
        assertEquals(testPer1.getCompanyName(), testPer2.getCompanyName());
        assertEquals(testPer1.getPersonId(), testPer2.getPersonId());
    }


}
