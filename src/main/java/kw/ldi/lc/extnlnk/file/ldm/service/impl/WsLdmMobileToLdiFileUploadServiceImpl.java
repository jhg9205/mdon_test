package kw.ldi.lc.extnlnk.file.ldm.service.impl;

import kw.ldi.lc.extnlnk.file.ldm.service.WsLdmMobileToLdiFileUploadPrcs;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(
        name = "WsLdmMobileToLdiFileUploadServiceImpl",
        portName = "WsLdmMobileToLdiFileUploadServicePort",
        serviceName = "wsLdmMobileToLdiFileUploadService",
        endpointInterface = "kw.ldi.lc.extnlnk.file.ldm.service.WsLdmMobileToLdiFileUploadPrcs"
)
public class WsLdmMobileToLdiFileUploadServiceImpl implements WsLdmMobileToLdiFileUploadPrcs {

    @WebMethod(operationName = "ldmMobileToFileUpload", exclude = true)
    public String ldmMobileFileUpload(String FILE_NM) throws Exception{
        System.out.println("테스트"+FILE_NM);
        return FILE_NM;
    }
}
