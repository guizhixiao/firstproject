package com.dwman.core.templete;

import lombok.Data;

@Data
public class TempleteFileEntity {
    private String templateFile;
    private String descFile;

    public static final String DEFAULT_BIZ_TEMPLETE="/templete/biz.templete";
    public static final String DEFAULT_SERVICE_TEMPLETE="/templete/service.templete";
    public static final String DEFAULT_SERVICE_IMPL_TEMPLETE="/templete/serviceImpl.templete";
    public static final String DEFAULT_DAO_TEMPLETE="/templete/dao.templete";
    public static final String DEFAULT_DAO_XML_TEMPLETE="/templete/dao_xml.templete";

}
