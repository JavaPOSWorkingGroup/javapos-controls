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
// GestureControlBeanInfo.java - Bean information for the JavaPOS GestureControl
//    device control
//
//------------------------------------------------------------------------------

package jpos;

import java.beans.*;

public class GestureControlBeanInfo
  extends SimpleBeanInfo
{
    public BeanDescriptor getBeanDescriptor()
    {
        return new BeanDescriptor(jpos.GestureControl.class);
    }

    public PropertyDescriptor makeProperty(String propertyName)
        throws IntrospectionException
    {
        return new PropertyDescriptor(propertyName, jpos.GestureControl.class);
    }

    public PropertyDescriptor[] getPropertyDescriptors()
    {
        try
        {
            PropertyDescriptor[] properties =
            {
                // Capabilities
                makeProperty("CapAssociatedHardTotalsDevice"),
                makeProperty("CapCompareFirmwareVersion"),
                makeProperty("CapMotion"),
                makeProperty("CapMotionCreation"),
                makeProperty("CapPose"),
                makeProperty("CapPoseCreation"),
                makeProperty("CapPowerReporting"),
                makeProperty("CapStatisticsReporting"),
                makeProperty("CapStorage"),
                makeProperty("CapUpdateFirmware"),
                makeProperty("CapUpdateStatistics"),
                
                // Properties
                makeProperty("AutoMode"),
                makeProperty("AutoModeList"),
                makeProperty("JointList"),
                makeProperty("MotionList"),
                makeProperty("OutputID"),
                makeProperty("PoseCreationMode"),
                makeProperty("PoseList"),
                makeProperty("PowerNotify"),
                makeProperty("PowerState"),
                makeProperty("Storage")
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
        return new EventSetDescriptor(jpos.GestureControl.class,
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
