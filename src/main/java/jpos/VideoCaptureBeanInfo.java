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
// VideoCaptureBeanInfo.java - Bean information for the JavaPOS VideoCapture
//    device control
//
//------------------------------------------------------------------------------

package jpos;

import java.beans.*;

public class VideoCaptureBeanInfo
  extends SimpleBeanInfo
{
    public BeanDescriptor getBeanDescriptor()
    {
        return new BeanDescriptor(jpos.VideoCapture.class);
    }

    public PropertyDescriptor makeProperty(String propertyName)
        throws IntrospectionException
    {
        return new PropertyDescriptor(propertyName, jpos.VideoCapture.class);
    }

    public PropertyDescriptor[] getPropertyDescriptors()
    {
        try
        {
            PropertyDescriptor[] properties =
            {
                // Capabilities
                makeProperty("CapAssociatedHardTotalsDevice"),
                makeProperty("CapAutoExposure"),
                makeProperty("CapAutoFocus"),
                makeProperty("CapAutoGain"),
                makeProperty("CapAutoWhiteBalance"),
                makeProperty("CapBrightness"),
                makeProperty("CapCompareFirmwareVersion"),
                makeProperty("CapContrast"),
                makeProperty("CapExposure"),
                makeProperty("CapGain"),
                makeProperty("CapHorizontalFlip"),
                makeProperty("CapHue"),
                makeProperty("CapPhoto"),
                makeProperty("CapPhotoColorSpace"),
                makeProperty("CapPhotoFrameRate"),
                makeProperty("CapPhotoResolution"),
                makeProperty("CapPhotoType"),
                makeProperty("CapPowerReporting"),
                makeProperty("CapSaturation"),
                makeProperty("CapStatisticsReporting"),
                makeProperty("CapStorage"),
                makeProperty("CapUpdateFirmware"),
                makeProperty("CapUpdateStatistics"),
                makeProperty("CapVerticalFlip"),
                makeProperty("CapVideo"),
                makeProperty("CapVideoColorSpace"),
                makeProperty("CapVideoFrameRate"),
                makeProperty("CapVideoResolution"),
                makeProperty("CapVideoType"),
                
                // Properties
                makeProperty("AutoExposure"),
                makeProperty("AutoFocus"),
                makeProperty("AutoGain"),
                makeProperty("AutoWhiteBalance"),
                makeProperty("Brightness"),
                makeProperty("Contrast"),
                makeProperty("Exposure"),
                makeProperty("Gain"),
                makeProperty("HorizontalFlip"),
                makeProperty("Hue"),
                makeProperty("PhotoColorSpace"),
                makeProperty("PhotoColorSpaceList"),
                makeProperty("PhotoFrameRate"),
                makeProperty("PhotoMaxFrameRate"),
                makeProperty("PhotoResolution"),
                makeProperty("PhotoResolutionList"),
                makeProperty("PhotoType"),
                makeProperty("PhotoTypeList"),
                makeProperty("PowerNotify"),
                makeProperty("PowerState"),
                makeProperty("RemainingRecordingTimeInSec"),
                makeProperty("Saturation"),
                makeProperty("Storage"),
                makeProperty("VerticalFlip"),
                makeProperty("VideoCaptureMode"),
                makeProperty("VideoColorSpace"),
                makeProperty("VideoColorSpaceList"),
                makeProperty("VideoFrameRate"),
                makeProperty("VideoMaxFrameRate"),
                makeProperty("VideoResolution"),
                makeProperty("VideoResolutionList"),
                makeProperty("VideoType"),
                makeProperty("VideoTypeList")
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
        return new EventSetDescriptor(jpos.VideoCapture.class,
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
