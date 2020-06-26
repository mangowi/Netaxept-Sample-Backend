
package epayment.bbs;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.10
 * 2020-06-24T12:15:05.818Z
 * Generated source version: 3.1.10
 */

@WebFault(name = "MerchantTranslationException", targetNamespace = "http://schemas.datacontract.org/2004/07/BBS.EPayment.ServiceLibrary")
public class INetaxeptReconMerchantTranslationExceptionFaultFaultMessage extends Exception {
    
    private org.datacontract.schemas._2004._07.bbs_epayment.MerchantTranslationException merchantTranslationException;

    public INetaxeptReconMerchantTranslationExceptionFaultFaultMessage() {
        super();
    }
    
    public INetaxeptReconMerchantTranslationExceptionFaultFaultMessage(String message) {
        super(message);
    }
    
    public INetaxeptReconMerchantTranslationExceptionFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public INetaxeptReconMerchantTranslationExceptionFaultFaultMessage(String message, org.datacontract.schemas._2004._07.bbs_epayment.MerchantTranslationException merchantTranslationException) {
        super(message);
        this.merchantTranslationException = merchantTranslationException;
    }

    public INetaxeptReconMerchantTranslationExceptionFaultFaultMessage(String message, org.datacontract.schemas._2004._07.bbs_epayment.MerchantTranslationException merchantTranslationException, Throwable cause) {
        super(message, cause);
        this.merchantTranslationException = merchantTranslationException;
    }

    public org.datacontract.schemas._2004._07.bbs_epayment.MerchantTranslationException getFaultInfo() {
        return this.merchantTranslationException;
    }
}
