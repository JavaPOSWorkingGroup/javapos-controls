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
// PointCardRWBeanInfo.java - Bean information for the JavaPOS PointCardRW
//    device control
//
//------------------------------------------------------------------------------

package jpos;

import java.beans.*;

public class PointCardRWBeanInfo
  extends SimpleBeanInfo
{
    public BeanDescriptor getBeanDescriptor()
    {
        return new BeanDescriptor(jpos.PointCardRW.class);
    }

    public PropertyDescriptor makeProperty(String propertyName)
        throws IntrospectionException
    {
        return new PropertyDescriptor(propertyName, jpos.PointCardRW.class);
    }

    public PropertyDescriptor[] getPropertyDescriptors()
    {
        try
        {
            PropertyDescriptor[] properties =
            {
                // Capabilities
                makeProperty("CapBold"),
                makeProperty("CapCardEntranceSensor"),
                makeProperty("CapCharacterSet"),
                makeProperty("CapCleanCard"),
                makeProperty("CapClearPrint"),
                makeProperty("CapCompareFirmwareVersion"),
                makeProperty("CapDhigh"),
                makeProperty("CapDwide"),
                makeProperty("CapDwideDhigh"),
                makeProperty("CapItalic"),
                makeProperty("CapLeft90"),
                makeProperty("CapMapCharacterSet"),
                makeProperty("CapPowerReporting"),
                makeProperty("CapPrint"),
                makeProperty("CapPrintMode"),
                makeProperty("CapRight90"),
                makeProperty("CapRotate180"),
                makeProperty("CapStatisticsReporting"),
                makeProperty("CapTracksToRead"),
                makeProperty("CapTracksToWrite"),
                makeProperty("CapUpdateFirmware"),
                makeProperty("CapUpdateStatistics"),
                
                // Properties
                makeProperty("CardState"),
                makeProperty("CharacterSet"),
                makeProperty("CharacterSetList"),
                makeProperty("DataCount"),
                makeProperty("DataEventEnabled"),
                makeProperty("FontTypeFaceList"),
                makeProperty("LineChars"),
                makeProperty("LineCharsList"),
                makeProperty("LineHeight"),
                makeProperty("LineSpacing"),
                makeProperty("LineWidth"),
                makeProperty("MapCharacterSet"),
                makeProperty("MapMode"),
                makeProperty("MaxLines"),
                makeProperty("OutputID"),
                makeProperty("PowerNotify"),
                makeProperty("PowerState"),
                makeProperty("PrintHeight"),
                makeProperty("ReadState1"),
                makeProperty("ReadState2"),
                makeProperty("RecvLength1"),
                makeProperty("RecvLength2"),
                makeProperty("SidewaysMaxChars"),
                makeProperty("SidewaysMaxLines"),
                makeProperty("Track1Data"),
                makeProperty("Track2Data"),
                makeProperty("Track3Data"),
                makeProperty("Track4Data"),
                makeProperty("Track5Data"),
                makeProperty("Track6Data"),
                makeProperty("TracksToRead"),
                makeProperty("TracksToWrite"),
                makeProperty("Write1Data"),
                makeProperty("Write2Data"),
                makeProperty("Write3Data"),
                makeProperty("Write4Data"),
                makeProperty("Write5Data"),
                makeProperty("Write6Data"),
                makeProperty("WriteState1"),
                makeProperty("WriteState2")
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
        return new EventSetDescriptor(jpos.PointCardRW.class,
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
