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
// CoinDispenserBeanInfo.java - Bean information for the JavaPOS CoinDispenser
//    device control
//
//------------------------------------------------------------------------------

package jpos;

import java.beans.*;

public class CoinDispenserBeanInfo
  extends SimpleBeanInfo
{
    public BeanDescriptor getBeanDescriptor()
    {
        return new BeanDescriptor(jpos.CoinDispenser.class);
    }

    public PropertyDescriptor makeProperty(String propertyName)
        throws IntrospectionException
    {
        return new PropertyDescriptor(propertyName, jpos.CoinDispenser.class);
    }

    public PropertyDescriptor[] getPropertyDescriptors()
    {
        try
        {
            PropertyDescriptor[] properties =
            {
                // Capabilities
                makeProperty("CapCompareFirmwareVersion"),
                makeProperty("CapEmptySensor"),
                makeProperty("CapJamSensor"),
                makeProperty("CapNearEmptySensor"),
                makeProperty("CapPowerReporting"),
                makeProperty("CapStatisticsReporting"),
                makeProperty("CapUpdateFirmware"),
                makeProperty("CapUpdateStatistics"),
                
                // Properties
                makeProperty("DispenserStatus"),
                makeProperty("PowerNotify"),
                makeProperty("PowerState")
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
        return new EventSetDescriptor(jpos.CoinDispenser.class,
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
