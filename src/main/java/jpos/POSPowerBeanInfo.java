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
// POSPowerBeanInfo.java - Bean information for the JavaPOS POSPower
//    device control
//
//------------------------------------------------------------------------------

package jpos;

import java.beans.*;

public class POSPowerBeanInfo
  extends SimpleBeanInfo
{
    public BeanDescriptor getBeanDescriptor()
    {
        return new BeanDescriptor(jpos.POSPower.class);
    }

    public PropertyDescriptor makeProperty(String propertyName)
        throws IntrospectionException
    {
        return new PropertyDescriptor(propertyName, jpos.POSPower.class);
    }

    public PropertyDescriptor[] getPropertyDescriptors()
    {
        try
        {
            PropertyDescriptor[] properties =
            {
                // Capabilities
                makeProperty("CapBatteryCapacityRemaining"),
                makeProperty("CapBatteryCapacityRemainingInSeconds"),
                makeProperty("CapChargeTime"),
                makeProperty("CapCompareFirmwareVersion"),
                makeProperty("CapFanAlarm"),
                makeProperty("CapHeatAlarm"),
                makeProperty("CapPowerReporting"),
                makeProperty("CapQuickCharge"),
                makeProperty("CapRestartPOS"),
                makeProperty("CapShutdownPOS"),
                makeProperty("CapStandbyPOS"),
                makeProperty("CapStatisticsReporting"),
                makeProperty("CapSuspendPOS"),
                makeProperty("CapUPSChargeState"),
                makeProperty("CapUpdateFirmware"),
                makeProperty("CapUpdateStatistics"),
                makeProperty("CapVariableBatteryCriticallyLowThreshold"),
                makeProperty("CapVariableBatteryCriticallyLowThresholdInSeconds"),
                makeProperty("CapVariableBatteryLowThreshold"),
                makeProperty("CapVariableBatteryLowThresholdInSeconds"),
                
                // Properties
                makeProperty("BatteryCapacityRemaining"),
                makeProperty("BatteryCapacityRemainingInSeconds"),
                makeProperty("BatteryCriticallyLowThreshold"),
                makeProperty("BatteryCriticallyLowThresholdInSeconds"),
                makeProperty("BatteryLowThreshold"),
                makeProperty("BatteryLowThresholdInSeconds"),
                makeProperty("ChargeTime"),
                makeProperty("EnforcedShutdownDelayTime"),
                makeProperty("PowerFailDelayTime"),
                makeProperty("PowerNotify"),
                makeProperty("PowerSource"),
                makeProperty("PowerState"),
                makeProperty("QuickChargeMode"),
                makeProperty("QuickChargeTime"),
                makeProperty("UPSChargeState")
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
        return new EventSetDescriptor(jpos.POSPower.class,
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
