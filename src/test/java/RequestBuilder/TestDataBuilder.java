package RequestBuilder;

import pojo.PersonalRecord;


public class TestDataBuilder {

    public PersonalRecord pr;

    public PersonalRecord generateBody(){

        pr = new PersonalRecord();
        pr.setName("Test2");
        pr.setJob("Teacher2");

        return pr ;
    }

}


