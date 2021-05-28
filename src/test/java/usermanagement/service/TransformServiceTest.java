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


    @Test
    public void test_toUserDomain() {
        Person testPerson = new Person();
        testPerson.setfName("fName");
        testPerson.setmName("mName");
        testPerson.setlName("lName");
        testPerson.setCompanyName("companyName");
        testPerson.setPersonId(1);
        User usr1 = testClass.toUserDomain(testPerson);
        User usr2 = new User();
        usr2.setFirstName(testPerson.getfName());
        usr2.setLastName(testPerson.getlName());
        usr2.setUserId(testPerson.getPersonId());
        usr2.setCompanyName(testPerson.getCompanyName());
        assertEquals(true, usr1.equals(usr2));
        assertEquals(usr1.getFirstName(), usr2.getFirstName());
        assertEquals(usr1.getLastName(), usr2.getLastName());
        assertEquals(usr1.getCompanyName(), usr2.getCompanyName());
        assertEquals(usr1.getUserId(), usr2.getUserId());
        assertEquals(usr1.hashCode(), usr2.hashCode());
    }

}
