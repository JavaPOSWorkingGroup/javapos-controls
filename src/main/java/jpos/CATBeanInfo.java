//////////////////////////////////////////////////////////////////////
//
// The JavaPOS library source code is now under the CPL license, which 
// is an OSS Apache-like license. The complete license is located at:
//    http://www.ibm.com/developerworks/library/os-cpl.html
//
//////////////////////////////////////////////////////////////////////
//------------------------------------------------------------------------------
//
// THIS SOFTWARE IS PROVIDED AS IS. THE JAVAPOS WORKING GROUP MAKES NO
// REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF THE SOFTWARE,
// EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE IMPLIED
// WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, OR
// NON-INFRINGEMENT.  INDIVIDUAL OR CORPORATE MEMBERS OF THE JAVAPOS
// WORKING GROUP SHALL NOT BE LIABLE FOR ANY DAMAGES SUFFERED AS A RESULT
// OF USING, MODIFYING OR DISTRIBUTING THIS SOFTWARE OR ITS DERIVATIVES.
//
// CATBeanInfo.java - Bean information for the JavaPOS CAT
//    device control
//
//------------------------------------------------------------------------------

package jpos;

import java.beans.*;

public class CATBeanInfo
  extends SimpleBeanInfo
{
    public BeanDescriptor getBeanDescriptor()
    {
        return new BeanDescriptor(jpos.CAT.class);
    }

    public PropertyDescriptor makeProperty(String propertyName)
        throws IntrospectionException
    {
        return new PropertyDescriptor(propertyName, jpos.CAT.class);
    }

    public PropertyDescriptor[] getPropertyDescriptors()
    {
        try
        {
            PropertyDescriptor[] properties =
            {
                // Capabilities
                makeProperty("CapAdditionalSecurityInformation"),
                makeProperty("CapAuthorizeCompletion"),
                makeProperty("CapAuthorizePreSales"),
                makeProperty("CapAuthorizeRefund"),
                makeProperty("CapAuthorizeVoid"),
                makeProperty("CapAuthorizeVoidPreSales"),
                makeProperty("CapCashDeposit"),
                makeProperty("CapCenterResultCode"),
                makeProperty("CapCheckCard"),
                makeProperty("CapCompareFirmwareVersion"),
                makeProperty("CapDailyLog"),
                makeProperty("CapInstallments"),
                makeProperty("CapLockTerminal"),
                makeProperty("CapLogStatus"),
                makeProperty("CapPaymentDetail"),
                makeProperty("CapPowerReporting"),
                makeProperty("CapStatisticsReporting"),
                makeProperty("CapTaxOthers"),
                makeProperty("CapTrainingMode"),
                makeProperty("CapTransactionNumber"),
                makeProperty("CapUnlockTerminal"),
                makeProperty("CapUpdateFirmware"),
                makeProperty("CapUpdateStatistics"),
                
                // Properties
                makeProperty("AccountNumber"),
                makeProperty("AdditionalSecurityInformation"),
                makeProperty("ApprovalCode"),
                makeProperty("AsyncMode"),
                makeProperty("Balance"),
                makeProperty("CardCompanyID"),
                makeProperty("CenterResultCode"),
                makeProperty("DailyLog"),
                makeProperty("LogStatus"),
                makeProperty("OutputID"),
                makeProperty("PaymentCondition"),
                makeProperty("PaymentDetail"),
                makeProperty("PaymentMedia"),
                makeProperty("PowerNotify"),
                makeProperty("PowerState"),
                makeProperty("SequenceNumber"),
                makeProperty("SettledAmount"),
                makeProperty("SlipNumber"),
                makeProperty("TrainingMode"),
                makeProperty("TransactionNumber"),
                makeProperty("TransactionType")
            };

            return properties;
        }
        catch(Exception e)
        {
            return super.getPropertyDescriptors();
        }
    }

    public EventSetDescriptor makeEvent(String eventName)
        throws IntrospectionException, ClassNotFoundException
    {
        String listener = "jpos.events." + eventName + "Listener";
        return new EventSetDescriptor(jpos.CAT.class,
                                      eventName,
                                      Class.forName(listener),
                                      eventName + "Occurred");
    }

    public EventSetDescriptor[] getEventSetDescriptors()
    {
        try
        {
            EventSetDescriptor[] events =
            {
                makeEvent("DirectIO"),
                makeEvent("Error"),
                makeEvent("OutputComplete"),
                makeEvent("StatusUpdate")
            };
            
            return events;
        }
        catch(Exception e)
        {
            return super.getEventSetDescriptors();
        }
    }
}
