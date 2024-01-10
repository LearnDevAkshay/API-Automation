package RequestBuilder;

import pojo.personalRecord;


public class testDataBuilder {

    public personalRecord pr;

    public personalRecord generateBody(){

        pr = new personalRecord();
        pr.setName("Test2");
        pr.setJob("Teacher2");

        return pr ;
    }

}


