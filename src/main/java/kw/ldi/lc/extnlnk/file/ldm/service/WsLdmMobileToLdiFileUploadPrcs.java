package kw.ldi.lc.extnlnk.file.ldm.service;

import javax.jws.WebService;

@WebService
public interface WsLdmMobileToLdiFileUploadPrcs {
    public String ldmMobileFileUpload(String FILE_NM) throws Exception;
}
