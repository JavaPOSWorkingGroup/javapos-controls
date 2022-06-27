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
// FiscalPrinterBeanInfo.java - Bean information for the JavaPOS FiscalPrinter
//    device control
//
//------------------------------------------------------------------------------

package jpos;

import java.beans.*;

public class FiscalPrinterBeanInfo
  extends SimpleBeanInfo
{
    public BeanDescriptor getBeanDescriptor()
    {
        return new BeanDescriptor(jpos.FiscalPrinter.class);
    }

    public PropertyDescriptor makeProperty(String propertyName)
        throws IntrospectionException
    {
        return new PropertyDescriptor(propertyName, jpos.FiscalPrinter.class);
    }

    public PropertyDescriptor[] getPropertyDescriptors()
    {
        try
        {
            PropertyDescriptor[] properties =
            {
                // Capabilities
                makeProperty("CapAdditionalHeader"),
                makeProperty("CapAdditionalLines"),
                makeProperty("CapAdditionalTrailer"),
                makeProperty("CapAmountAdjustment"),
                makeProperty("CapAmountNotPaid"),
                makeProperty("CapChangeDue"),
                makeProperty("CapCheckTotal"),
                makeProperty("CapCompareFirmwareVersion"),
                makeProperty("CapCoverSensor"),
                makeProperty("CapDoubleWidth"),
                makeProperty("CapDuplicateReceipt"),
                makeProperty("CapEmptyReceiptIsVoidable"),
                makeProperty("CapFiscalReceiptStation"),
                makeProperty("CapFiscalReceiptType"),
                makeProperty("CapFixedOutput"),
                makeProperty("CapHasVatTable"),
                makeProperty("CapIndependentHeader"),
                makeProperty("CapItemList"),
                makeProperty("CapJrnEmptySensor"),
                makeProperty("CapJrnNearEndSensor"),
                makeProperty("CapJrnPresent"),
                makeProperty("CapMultiContractor"),
                makeProperty("CapNonFiscalMode"),
                makeProperty("CapOnlyVoidLastItem"),
                makeProperty("CapOrderAdjustmentFirst"),
                makeProperty("CapPackageAdjustment"),
                makeProperty("CapPercentAdjustment"),
                makeProperty("CapPositiveAdjustment"),
                makeProperty("CapPositiveSubtotalAdjustment"),
                makeProperty("CapPostPreLine"),
                makeProperty("CapPowerLossReport"),
                makeProperty("CapPowerReporting"),
                makeProperty("CapPredefinedPaymentLines"),
                makeProperty("CapRecEmptySensor"),
                makeProperty("CapRecNearEndSensor"),
                makeProperty("CapRecPresent"),
                makeProperty("CapReceiptNotPaid"),
                makeProperty("CapRemainingFiscalMemory"),
                makeProperty("CapReservedWord"),
                makeProperty("CapSetCurrency"),
                makeProperty("CapSetHeader"),
                makeProperty("CapSetPOSID"),
                makeProperty("CapSetStoreFiscalID"),
                makeProperty("CapSetTrailer"),
                makeProperty("CapSetVatTable"),
                makeProperty("CapSlpEmptySensor"),
                makeProperty("CapSlpFiscalDocument"),
                makeProperty("CapSlpFullSlip"),
                makeProperty("CapSlpNearEndSensor"),
                makeProperty("CapSlpPresent"),
                makeProperty("CapSlpValidation"),
                makeProperty("CapStatisticsReporting"),
                makeProperty("CapSubAmountAdjustment"),
                makeProperty("CapSubPercentAdjustment"),
                makeProperty("CapSubtotal"),
                makeProperty("CapTotalizerType"),
                makeProperty("CapTrainingMode"),
                makeProperty("CapUpdateFirmware"),
                makeProperty("CapUpdateStatistics"),
                makeProperty("CapValidateJournal"),
                makeProperty("CapXReport"),
                
                // Properties
                makeProperty("ActualCurrency"),
                makeProperty("AdditionalHeader"),
                makeProperty("AdditionalTrailer"),
                makeProperty("AmountDecimalPlace"),
                makeProperty("AmountDecimalPlaces"),
                makeProperty("AsyncMode"),
                makeProperty("ChangeDue"),
                makeProperty("CheckTotal"),
                makeProperty("ContractorId"),
                makeProperty("CountryCode"),
                makeProperty("CoverOpen"),
                makeProperty("DateType"),
                makeProperty("DayOpened"),
                makeProperty("DescriptionLength"),
                makeProperty("DuplicateReceipt"),
                makeProperty("ErrorLevel"),
                makeProperty("ErrorOutID"),
                makeProperty("ErrorState"),
                makeProperty("ErrorStation"),
                makeProperty("ErrorString"),
                makeProperty("FiscalReceiptStation"),
                makeProperty("FiscalReceiptType"),
                makeProperty("FlagWhenIdle"),
                makeProperty("JrnEmpty"),
                makeProperty("JrnNearEnd"),
                makeProperty("MessageLength"),
                makeProperty("MessageType"),
                makeProperty("NumHeaderLines"),
                makeProperty("NumTrailerLines"),
                makeProperty("NumVatRates"),
                makeProperty("OutputID"),
                makeProperty("PostLine"),
                makeProperty("PowerNotify"),
                makeProperty("PowerState"),
                makeProperty("PreLine"),
                makeProperty("PredefinedPaymentLines"),
                makeProperty("PrinterState"),
                makeProperty("QuantityDecimalPlaces"),
                makeProperty("QuantityLength"),
                makeProperty("RecEmpty"),
                makeProperty("RecNearEnd"),
                makeProperty("RemainingFiscalMemory"),
                makeProperty("ReservedWord"),
                makeProperty("SlipSelection"),
                makeProperty("SlpEmpty"),
                makeProperty("SlpNearEnd"),
                makeProperty("TotalizerType"),
                makeProperty("TrainingModeActive")
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
        return new EventSetDescriptor(jpos.FiscalPrinter.class,
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
