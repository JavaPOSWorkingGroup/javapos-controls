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
// ElectronicValueRWBeanInfo.java - Bean information for the JavaPOS ElectronicValueRW
//    device control
//
//------------------------------------------------------------------------------

package jpos;

import java.beans.*;

public class ElectronicValueRWBeanInfo
  extends SimpleBeanInfo
{
    public BeanDescriptor getBeanDescriptor()
    {
        return new BeanDescriptor(jpos.ElectronicValueRW.class);
    }

    public PropertyDescriptor makeProperty(String propertyName)
        throws IntrospectionException
    {
        return new PropertyDescriptor(propertyName, jpos.ElectronicValueRW.class);
    }

    public PropertyDescriptor[] getPropertyDescriptors()
    {
        try
        {
            PropertyDescriptor[] properties =
            {
                // Capabilities
                makeProperty("CapActivateService"),
                makeProperty("CapAddValue"),
                makeProperty("CapAdditionalSecurityInformation"),
                makeProperty("CapAuthorizeCompletion"),
                makeProperty("CapAuthorizePreSales"),
                makeProperty("CapAuthorizeRefund"),
                makeProperty("CapAuthorizeVoid"),
                makeProperty("CapAuthorizeVoidPreSales"),
                makeProperty("CapCancelValue"),
                makeProperty("CapCardSensor"),
                makeProperty("CapCashDeposit"),
                makeProperty("CapCenterResultCode"),
                makeProperty("CapCheckCard"),
                makeProperty("CapCompareFirmwareVersion"),
                makeProperty("CapDailyLog"),
                makeProperty("CapDetectionControl"),
                makeProperty("CapElectronicMoney"),
                makeProperty("CapEnumerateCardServices"),
                makeProperty("CapIndirectTransactionLog"),
                makeProperty("CapInstallments"),
                makeProperty("CapLockTerminal"),
                makeProperty("CapLogStatus"),
                makeProperty("CapMediumID"),
                makeProperty("CapMembershipCertificate"),
                makeProperty("CapPINDevice"),
                makeProperty("CapPaymentDetail"),
                makeProperty("CapPoint"),
                makeProperty("CapPowerReporting"),
                makeProperty("CapRealTimeData"),
                makeProperty("CapStatisticsReporting"),
                makeProperty("CapSubtractValue"),
                makeProperty("CapTaxOthers"),
                makeProperty("CapTrainingMode"),
                makeProperty("CapTransaction"),
                makeProperty("CapTransactionLog"),
                makeProperty("CapTransactionNumber"),
                makeProperty("CapUnlockTerminal"),
                makeProperty("CapUpdateFirmware"),
                makeProperty("CapUpdateKey"),
                makeProperty("CapUpdateStatistics"),
                makeProperty("CapVoucher"),
                makeProperty("CapWriteValue"),
                
                // Properties
                makeProperty("AccountNumber"),
                makeProperty("AdditionalSecurityInformation"),
                makeProperty("Amount"),
                makeProperty("ApprovalCode"),
                makeProperty("AsyncMode"),
                makeProperty("AutoDisable"),
                makeProperty("Balance"),
                makeProperty("BalanceOfPoint"),
                makeProperty("CardCompanyID"),
                makeProperty("CardServiceList"),
                makeProperty("CenterResultCode"),
                makeProperty("CurrentService"),
                makeProperty("DailyLog"),
                makeProperty("DataCount"),
                makeProperty("DataEventEnabled"),
                makeProperty("DetectionControl"),
                makeProperty("DetectionStatus"),
                makeProperty("ExpirationDate"),
                makeProperty("LastUsedDate"),
                makeProperty("LogStatus"),
                makeProperty("MediumID"),
                makeProperty("OutputID"),
                makeProperty("PINEntry"),
                makeProperty("PaymentCondition"),
                makeProperty("PaymentDetail"),
                makeProperty("PaymentMedia"),
                makeProperty("Point"),
                makeProperty("PowerNotify"),
                makeProperty("PowerState"),
                makeProperty("ReaderWriterServiceList"),
                makeProperty("SequenceNumber"),
                makeProperty("ServiceType"),
                makeProperty("SettledAmount"),
                makeProperty("SettledPoint"),
                makeProperty("SlipNumber"),
                makeProperty("TrainingModeState"),
                makeProperty("TransactionLog"),
                makeProperty("TransactionNumber"),
                makeProperty("TransactionType"),
                makeProperty("VoucherID"),
                makeProperty("VoucherIDList")
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
        return new EventSetDescriptor(jpos.ElectronicValueRW.class,
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
                makeEvent("Data"),
                makeEvent("DirectIO"),
                makeEvent("Error"),
                makeEvent("OutputComplete"),
                makeEvent("StatusUpdate"),
                makeEvent("Transition")
            };
            
            return events;
        }
        catch(Exception e)
        {
            return super.getEventSetDescriptors();
        }
    }
}
