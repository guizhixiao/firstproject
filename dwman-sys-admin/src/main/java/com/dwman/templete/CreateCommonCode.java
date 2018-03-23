package com.dwman.templete;

import com.dwman.core.templete.BatchTlt;
import com.dwman.core.templete.TltType;


public class CreateCommonCode {
    public static final String PARENT_PACKAGE = "com.dwman";

    public static void main(String[] args)  throws Exception{
        BatchTlt batchTlt = new BatchTlt();
        batchTlt.batch(PARENT_PACKAGE, TltType.DEFAULT_BIZ_TEMPLETE);

        BatchTlt batchCreate = new BatchTlt();
        batchCreate.batch(PARENT_PACKAGE, TltType.DEFAULT_SERVICE_TEMPLETE);

        BatchTlt batchCreateC = new BatchTlt();
        batchCreateC.batch(PARENT_PACKAGE,TltType.DEFAULT_SERVICE_IMPL_TEMPLETE);

        BatchTlt batchCreateDAO = new BatchTlt();
        batchCreateDAO.batch(PARENT_PACKAGE, TltType.DEFAULT_DAO_TEMPLETE);

        BatchTlt batchCreateDAOXML = new BatchTlt();
        batchCreateDAOXML.batch(PARENT_PACKAGE,TltType.DEFAULT_DAO_XML_TEMPLETE);



    }



}
