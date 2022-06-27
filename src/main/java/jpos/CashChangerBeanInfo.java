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
// CashChangerBeanInfo.java - Bean information for the JavaPOS CashChanger
//    device control
//
//------------------------------------------------------------------------------

package jpos;

import java.beans.*;

public class CashChangerBeanInfo
  extends SimpleBeanInfo
{
    public BeanDescriptor getBeanDescriptor()
    {
        return new BeanDescriptor(jpos.CashChanger.class);
    }

    public PropertyDescriptor makeProperty(String propertyName)
        throws IntrospectionException
    {
        return new PropertyDescriptor(propertyName, jpos.CashChanger.class);
    }

    public PropertyDescriptor[] getPropertyDescriptors()
    {
        try
        {
            PropertyDescriptor[] properties =
            {
                // Capabilities
                makeProperty("CapCompareFirmwareVersion"),
                makeProperty("CapDeposit"),
                makeProperty("CapDepositDataEvent"),
                makeProperty("CapDiscrepancy"),
                makeProperty("CapEmptySensor"),
                makeProperty("CapFullSensor"),
                makeProperty("CapJamSensor"),
                makeProperty("CapNearEmptySensor"),
                makeProperty("CapNearFullSensor"),
                makeProperty("CapPauseDeposit"),
                makeProperty("CapPowerReporting"),
                makeProperty("CapRealTimeData"),
                makeProperty("CapRepayDeposit"),
                makeProperty("CapStatisticsReporting"),
                makeProperty("CapUpdateFirmware"),
                makeProperty("CapUpdateStatistics"),
                
                // Properties
                makeProperty("AsyncMode"),
                makeProperty("AsyncResultCode"),
                makeProperty("AsyncResultCodeExtended"),
                makeProperty("CurrencyCashList"),
                makeProperty("CurrencyCode"),
                makeProperty("CurrencyCodeList"),
                makeProperty("CurrentExit"),
                makeProperty("CurrentService"),
                makeProperty("DataCount"),
                makeProperty("DataEventEnabled"),
                makeProperty("DepositAmount"),
                makeProperty("DepositCashList"),
                makeProperty("DepositCodeList"),
                makeProperty("DepositCounts"),
                makeProperty("DepositStatus"),
                makeProperty("DeviceExits"),
                makeProperty("DeviceStatus"),
                makeProperty("ExitCashList"),
                makeProperty("FullStatus"),
                makeProperty("PowerNotify"),
                makeProperty("PowerState"),
                makeProperty("RealTimeDataEnabled"),
                makeProperty("ServiceCount"),
                makeProperty("ServiceIndex")
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
        return new EventSetDescriptor(jpos.CashChanger.class,
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
